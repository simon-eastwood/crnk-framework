package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DossierInfoIndicator {

	public DossierInfoIndicator() {};
    
	@JsonProperty("dossierIndicatorType")
	public String dossierIndicatorType;
        
	@JsonProperty("dossierIndicatorLabel")
	public String dossierIndicatorLabel;
        
	@JsonProperty("dossierIndicatorValue")
	public String dossierIndicatorDescription;
	
	public String getDossierIndicatorType() {
		return dossierIndicatorType;
	}

	public void setDossierIndicatorType(String dossierIndicatorType) {
		this.dossierIndicatorType = dossierIndicatorType;
	}

	public String getDossierIndicatorLabel() {
		return dossierIndicatorLabel;
	}

	public void setDossierIndicatorLabel(String dossierIndicatorLabel) {
		this.dossierIndicatorLabel = dossierIndicatorLabel;
	}

	public String getDossierIndicatorDescription() {
		return dossierIndicatorDescription;
	}

	public void setDossierIndicatorDescription(String dossierIndicatorDescription) {
		this.dossierIndicatorDescription = dossierIndicatorDescription;
	}
}
