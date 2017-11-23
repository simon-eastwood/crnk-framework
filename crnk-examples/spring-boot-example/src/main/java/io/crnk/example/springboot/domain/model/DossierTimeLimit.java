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
        

	public String timeLimitType;
        

	public String timeLimitStatus;
        

	public Date statusDateTime;

        

	public Date createdDateTime;

        

	public Date createdDate;

        

	public Date expirationDate;

        

	public Date signalDate;

        

	public String limitDateType;
        

	public Date changeDateTime;

        

	public String reason;
        

	public Date lastChange;

        

	public String taskProgress;
        

	public String triggeredByEvent;
        

	public String expirationDateColor;
}
