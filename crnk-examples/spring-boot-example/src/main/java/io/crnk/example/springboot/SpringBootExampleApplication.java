package io.crnk.example.springboot;

import io.crnk.core.engine.registry.RegistryEntry;
import io.crnk.core.engine.registry.ResourceRegistry;
import io.crnk.spring.boot.v3.CrnkConfigV3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Configuration
@RestController
@SpringBootApplication
@Import({CrnkConfigV3.class, JpaConfig.class, ModuleConfig.class, CorsConfig.class, TestDataLoader.class})
public class SpringBootExampleApplication {

	@Autowired
	private ResourceRegistry resourceRegistry;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
		System.out.println("visit http://127.0.0.1:8080/ resp. http://127.0.0.1:8080/browse/ in your browser");
	}

	@RequestMapping("/resourcesInfo")
	public Map<?, ?> getResources() {
		Map<String, String> result = new HashMap<>();
		// Add all resources (i.e. Project and Task)
		for (RegistryEntry entry : resourceRegistry.getResources()) {
			result.put(entry.getResourceInformation().getResourceType(),
					resourceRegistry.getResourceUrl(entry.getResourceInformation()));
		}
		return result;
	}
}


@Component
@Order(1)
public class MyFilter implements Filter {



  @Override
  public void init(final FilterConfig filterConfig) throws ServletException {
    System.out.println("filter");
  }

  @Override
  public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException {
    chain.doFilter(request, response);
  }

  @Override
  public void destroy() {
   ;
  }
}

// Now, confgure the Filter implemented above in Spring configuration class. Take a look
@Bean
public FilterRegistrationBean myFilterBean() {
  final FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
  filterRegBean.setFilter(new MyFilter());
  filterRegBean.addUrlPatterns("/*");
  filterRegBean.setEnabled(Boolean.TRUE);
  filterRegBean.setName("Meu Filter");
  filterRegBean.setAsyncSupported(Boolean.TRUE);
  return filterRegBean;
}
