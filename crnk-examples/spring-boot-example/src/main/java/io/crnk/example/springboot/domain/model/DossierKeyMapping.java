package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToMany;
import io.crnk.core.resource.annotations.JsonApiToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


@JsonApiResource(type = "dossierkeymapping")
public class DossierKeyMapping {
	@JsonApiId
	private String jsonApiId;
	public String getJsonApiId() {return this.jsonApiId;}
	public void setJsonApiId(String id) { this.jsonApiId = id;}
	public DossierKeyMapping(String id) {this.jsonApiId = id;}


	@JsonProperty
	private String eTag = null;
	public String getEtag() {return this.eTag;}
	public void setEtag(String etag) { this.eTag  = etag ;}

	public DossierKeyMapping() {};
    
	@JsonProperty("ApplicationNumber")
	public String applicationNumber;
                
	@JsonProperty("TrimmedApplicationNumber")
	public String trimmedApplicationNumber;
                
	@JsonProperty("CaseID")
	public String caseId;
                
	@JsonProperty("LAL_taskId")
	public String lalTaskId;
 
}
