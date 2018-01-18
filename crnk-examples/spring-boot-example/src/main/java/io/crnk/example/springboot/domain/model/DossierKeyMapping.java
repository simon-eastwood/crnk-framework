package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiRelation;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToOne;
import io.crnk.core.resource.annotations.LookupIncludeBehavior;
import io.crnk.core.resource.annotations.SerializeType;

@JsonApiResource(type = "dossierkeymapping")
public class DossierKeyMapping {
	@JsonApiId
	private String jsonApiId;
	public String getJsonApiId() {return this.jsonApiId;}
	public void setJsonApiId(String id) { this.jsonApiId = id;}
	public DossierKeyMapping(String id) {this.jsonApiId = id;}
	public DossierKeyMapping() {};
	
	@JsonProperty
	private String eTag = null;
    
	@JsonProperty("ApplicationNumber")
	private String applicationNumber;
                
	@JsonProperty("TrimmedApplicationNumber")
	private String trimmedApplicationNumber;
                
	@JsonProperty("CaseID")
	private String caseId;

	@JsonProperty("LAL_taskId")
	public String lalTaskId;
                
	@JsonApiToOne
	private Tunnel dossierCommentsResponse;
	
	@JsonApiToOne
	private Tunnel source;
	
	@JsonApiToOne
	private Tunnel pdm;

	@JsonApiToOne
	private Tunnel annotations;

	@JsonApiToOne
	private Tunnel testTasks;
	
	public Tunnel getSource() {
		return source;
	}
	public void setSource(Tunnel source) {
		this.source = source;
	}
	public Tunnel getPdm() {
		return pdm;
	}
	public void setPdm(Tunnel pdm) {
		this.pdm = pdm;
	}
	public Tunnel getAnnotations() {
		return annotations;
	}
	public void setAnnotations(Tunnel annotations) {
		this.annotations = annotations;
	}
	public Tunnel getTestTasks() {
		return testTasks;
	}
	public void setTestTasks(Tunnel testTasks) {
		this.testTasks = testTasks;
	}
	public Tunnel getDossierCommentsResponse() {
		return dossierCommentsResponse;
	}
	public void setDossierCommentsResponse(Tunnel dossierCommentsResponse) {
		this.dossierCommentsResponse = dossierCommentsResponse;
	}
	public String geteTag() {
		return eTag;
	}
	public void seteTag(String eTag) {
		this.eTag = eTag;
	}
	public String getApplicationNumber() {
		return applicationNumber;
	}
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}
	public String getTrimmedApplicationNumber() {
		return trimmedApplicationNumber;
	}
	public void setTrimmedApplicationNumber(String trimmedApplicationNumber) {
		this.trimmedApplicationNumber = trimmedApplicationNumber;
	}
	public String getCaseId() {
		return caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	public String getLalTaskId() {
		return lalTaskId;
	}
	public void setLalTaskId(String lalTaskId) {
		this.lalTaskId = lalTaskId;
	}
}
