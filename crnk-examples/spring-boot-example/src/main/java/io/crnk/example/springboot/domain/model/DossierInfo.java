
package  io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToMany;

import java.util.ArrayList;
import java.util.List;



@JsonApiResource(type = "dossierinfo")
public class DossierInfo {

	@JsonApiId
	private String applicationNumber;




	public String getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	//	public dossierInfoIndicators: Array<DossierInfoIndicator> = [];
	// private  timeLimits: Array<DossierTimeLimit> = [];
//	public events: Array<DossierEvent> = [];
//	public involvements: Array<DossierInvolvement> = [];

	public String getLalTaskId() {
		return lalTaskId;
	}

	public void setLalTaskId(String lalTaskId) {
		this.lalTaskId = lalTaskId;
	}

	public String getDossierNumber() {
		return dossierNumber;
	}

	public void setDossierNumber(String dossierNumber) {
		this.dossierNumber = dossierNumber;
	}

	public String getDossierPhase() {
		return dossierPhase;
	}

	public void setDossierPhase(String dossierPhase) {
		this.dossierPhase = dossierPhase;
	}

	public String getDossierPhaseLabel() {
		return dossierPhaseLabel;
	}

	public void setDossierPhaseLabel(String dossierPhaseLabel) {
		this.dossierPhaseLabel = dossierPhaseLabel;
	}

	public String getDoublureIndicator() {
		return doublureIndicator;
	}

	public void setDoublureIndicator(String doublureIndicator) {
		this.doublureIndicator = doublureIndicator;
	}

	public String getFilingLanguage() {
		return filingLanguage;
	}

	public void setFilingLanguage(String filingLanguage) {
		this.filingLanguage = filingLanguage;
	}

	public String getLeadClass() {
		return leadClass;
	}

	public void setLeadClass(String leadClass) {
		this.leadClass = leadClass;
	}

	public String getLeadDate() {
		return leadDate;
	}

	public void setLeadDate(String leadDate) {
		this.leadDate = leadDate;
	}

	public String getLeadDateType() {
		return leadDateType;
	}

	public void setLeadDateType(String leadDateType) {
		this.leadDateType = leadDateType;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@JsonProperty
	private String lalTaskId;
	@JsonProperty
	private String dossierNumber;
	@JsonProperty
	private String dossierPhase;
	@JsonProperty
	private String dossierPhaseLabel;
	@JsonProperty
	private String doublureIndicator;
	@JsonProperty
	private String filingLanguage;
	@JsonProperty
	private String leadClass;
	@JsonProperty
	private String leadDate;
	@JsonProperty
	private String leadDateType;
	@JsonProperty
	private String priority;





	public DossierInfo() {
	}

	public DossierInfo(String aNumber) {
		this.applicationNumber = aNumber;
	}



}
