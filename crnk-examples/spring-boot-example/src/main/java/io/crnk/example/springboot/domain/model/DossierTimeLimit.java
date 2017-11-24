package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToMany;
import io.crnk.core.resource.annotations.JsonApiToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class DossierTimeLimit {

	public DossierTimeLimit() {};
        
	@JsonProperty("TimeLimitType")
	public String timeLimitType;
        
	@JsonProperty("TimeLimitStatus")
	public String timeLimitStatus;
        
	@JsonProperty("StatusDateTime")
	public Date statusDateTime;

        
	@JsonProperty("CreatedDateTime")
	public Date createdDateTime;

        
	@JsonProperty("CreatedDate")
	public Date createdDate;

        
	@JsonProperty("ExpirationDate")
	public Date expirationDate;

        
	@JsonProperty("SignalDate")
	public Date signalDate;

        
	@JsonProperty("LimitDateType")
	public String limitDateType;
        
	@JsonProperty("ChangeDateTime")
	public Date changeDateTime;

        
	@JsonProperty("Reason")
	public String reason;
        
	@JsonProperty("LastChange")
	public Date lastChange;

        
	@JsonProperty("TaskProgress")
	public String taskProgress;
        
	@JsonProperty("TriggeredByEvent")
	public String triggeredByEvent;
        
	@JsonProperty("ExpirationDateColor")
	public String expirationDateColor;
}
