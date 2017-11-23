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
    
	@JsonProperty(name="Sticker")
	private String sticker;
        
	@JsonProperty(name="Priority")
	private int priority ;
        
	@JsonProperty(name="Tooltip")
	private String tooltip;
        
	@JsonProperty(name="ShownOn")
	private string shownOn;
}
