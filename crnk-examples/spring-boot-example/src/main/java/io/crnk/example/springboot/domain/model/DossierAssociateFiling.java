package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToMany;
import io.crnk.core.resource.annotations.JsonApiToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


@JsonApiResource(type = "dossierassociatefiling")
public class DossierAssociateFiling {
	@JsonApiId
	private String jsonApiId;
	public String getJsonApiId() {return this.jsonApiId;}
	public void setJsonApiId(String id) { this.jsonApiId = id;}
	public DossierAssociateFiling(String id) {this.jsonApiId = id;}


	@JsonProperty
	private String eTag = null;
	public String getEtag() {return this.eTag;}
	public void setEtag(String etag) { this.eTag  = etag ;}

	public DossierAssociateFiling() {};
     
	@JsonProperty("ASS_ID")
	public String assId;
        
	@JsonProperty("ApplicationNumber")
	public String applicationNumber;
        
	@JsonProperty("DateOfFiling")
	public String dateOfFiling;
        
	@JsonProperty("TypeOfAssociation")
	public String typeOfAssociation;
        
	@JsonProperty("Parent")
	public boolean parent;

        
	@JsonProperty("FirstExaminer")
	public String firstExaminer;
        
	@JsonProperty("SearchExaminer")
	public String searchExaminer;
}
