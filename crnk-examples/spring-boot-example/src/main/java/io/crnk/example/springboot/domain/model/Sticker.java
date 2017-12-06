package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


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

	public String getSticker() {
		return sticker;
	}

	public void setSticker(String sticker) {
		this.sticker = sticker;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getTooltip() {
		return tooltip;
	}

	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}

	public String getShownOn() {
		return shownOn;
	}

	public void setShownOn(String shownOn) {
		this.shownOn = shownOn;
	}
}
