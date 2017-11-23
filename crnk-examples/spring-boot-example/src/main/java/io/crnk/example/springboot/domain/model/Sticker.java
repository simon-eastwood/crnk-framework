package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToMany;
import io.crnk.core.resource.annotations.JsonApiToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class Sticker {

	public Sticker() {};
    
	@JsonProperty("Sticker")
	public String sticker;
        
	@JsonProperty("Priority")
	public int priority ;
        
	@JsonProperty("Tooltip")
	public String tooltip;
        
	@JsonProperty("ShownOn")
	public String shownOn;
}
