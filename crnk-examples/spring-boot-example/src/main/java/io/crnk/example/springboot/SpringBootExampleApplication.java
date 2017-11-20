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

// just for filter
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import java.io.IOException;





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




/**
 */
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
class MyFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FILTER INIT");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

            chain.doFilter(request,response);

		String path = ((javax.servlet.http.HttpServletRequest) request).getRequestURI();
		
		
		 System.out.println("FILTER CALLED FOR PATH " + path);
if (path.endsWith(".css") || path.endsWith(".js")  || path.endsWith(".ttf") || path.endsWith(".png") ) {
	
	 System.out.println("FILTER: Added cache header ");
			((javax.servlet.http.HttpServletResponse)response).addHeader("Cache-control", "public, max-age=31536000");
			((javax.servlet.http.HttpServletResponse)response).addHeader("X-Cache-control", "public, max-age=31536000");
}

    }

    @Override
    public void destroy() {

    }
}

