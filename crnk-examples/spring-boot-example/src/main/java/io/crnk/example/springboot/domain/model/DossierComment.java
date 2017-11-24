package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToMany;
import io.crnk.core.resource.annotations.JsonApiToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


@JsonApiResource(type = "dossiercomment")
public class DossierComment {
	@JsonApiId
	private String jsonApiId;
	public String getJsonApiId() {return this.jsonApiId;}
	public void setJsonApiId(String id) { this.jsonApiId = id;}
	public DossierComment(String id) {this.jsonApiId = id;}


	@JsonProperty
	private String eTag = null;
	public String getEtag() {return this.eTag;}
	public void setEtag(String etag) { this.eTag  = etag ;}

	public DossierComment() {};
    
	@JsonProperty("AuthorId")
	public String authorId;
                
	@JsonProperty("CreatedDateTime")
	public Date createdDateTime;

                
	@JsonProperty("Text")
	public String text;
                
	@JsonProperty("RelatedTransaction")
	public String relatedTransaction;
                
	@JsonProperty("DOSSIERNUMBER")
	public String dossierNumber;
                
	@JsonProperty("APPLICATIONNUMBER")
	public String applicationNumber;
                
	@JsonProperty("CaseId")
	public String caseId;
                
	@JsonProperty("CMT_ID")
	public String cmtId;
}
