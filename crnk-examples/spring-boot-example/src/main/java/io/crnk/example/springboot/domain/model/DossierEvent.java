package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DossierEvent {

	public DossierEvent() {};
    
	@JsonProperty("CompletedEventLabel")
	public String label;
                
	@JsonProperty("KindOfEventCode")
	public String code;
          
	@JsonProperty("DateTimeStamp")
	public String date;
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
