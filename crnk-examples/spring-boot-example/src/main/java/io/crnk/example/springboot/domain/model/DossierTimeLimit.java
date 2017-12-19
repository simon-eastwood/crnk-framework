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
	public String statusDateTime;
        
	@JsonProperty("CreatedDateTime")
	public String createdDateTime;
        
	@JsonProperty("CreatedDate")
	public String createdDate;
        
	@JsonProperty("ExpirationDate")
	public String expirationDate;
        
	@JsonProperty("SignalDate")
	public String signalDate;
        
	@JsonProperty("LimitDateType")
	public String limitDateType;
        
	@JsonProperty("ChangeDateTime")
	public String changeDateTime;
        
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
	
	@JsonProperty("LastUpdatedBy")
	public String lastUpdatedBy;
	
	public String getTimeLimitType() {
		return timeLimitType;
	}

	public void setTimeLimitType(String timeLimitType) {
		this.timeLimitType = timeLimitType;
	}

	public String getTimeLimitStatus() {
		return timeLimitStatus;
	}

	public void setTimeLimitStatus(String timeLimitStatus) {
		this.timeLimitStatus = timeLimitStatus;
	}


	public String getLimitDateType() {
		return limitDateType;
	}

	public void setLimitDateType(String limitDateType) {
		this.limitDateType = limitDateType;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getLastChange() {
		return lastChange;
	}

	public void setLastChange(Date lastChange) {
		this.lastChange = lastChange;
	}

	public String getTaskProgress() {
		return taskProgress;
	}

	public void setTaskProgress(String taskProgress) {
		this.taskProgress = taskProgress;
	}

	public String getTriggeredByEvent() {
		return triggeredByEvent;
	}

	public void setTriggeredByEvent(String triggeredByEvent) {
		this.triggeredByEvent = triggeredByEvent;
	}

	public String getExpirationDateColor() {
		return expirationDateColor;
	}

	public void setExpirationDateColor(String expirationDateColor) {
		this.expirationDateColor = expirationDateColor;
	}

	public String getStatusDateTime() {
		return statusDateTime;
	}

	public void setStatusDateTime(String statusDateTime) {
		this.statusDateTime = statusDateTime;
	}

	public String getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getSignalDate() {
		return signalDate;
	}

	public void setSignalDate(String signalDate) {
		this.signalDate = signalDate;
	}

	public String getChangeDateTime() {
		return changeDateTime;
	}

	public void setChangeDateTime(String changeDateTime) {
		this.changeDateTime = changeDateTime;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	
}
