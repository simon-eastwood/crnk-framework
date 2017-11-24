package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToMany;
import io.crnk.core.resource.annotations.JsonApiToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class DossierEvent {

	public DossierEvent() {};
    
	@JsonProperty("CompletedEventLabel")
	public String label;
                
	@JsonProperty("KindOfEventCode")
	public String code;
                
	@JsonProperty("DateTimeStamp")
	public Date date;
}
