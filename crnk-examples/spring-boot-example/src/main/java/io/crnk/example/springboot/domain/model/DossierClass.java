package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToMany;
import io.crnk.core.resource.annotations.JsonApiToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


@JsonApiResource(type = "dossierclass")
public class DossierClass {
	@JsonApiId
	private String jsonApiId;
	public String getJsonApiId() {return this.jsonApiId;}
	public void setJsonApiId(String id) { this.jsonApiId = id;}
	public DossierClass(String id) {this.jsonApiId = id;}


	@JsonProperty
	private String eTag = null;
	public String getEtag() {return this.eTag;}
	public void setEtag(String etag) { this.eTag  = etag ;}

	public DossierClass() {};
    
	@JsonProperty("CLASS_ID")
	public String classId;
        
	@JsonProperty("ClassType")
	public String classType;
        
	@JsonProperty("ClassValue")
	public String classValue;
        
	@JsonProperty("ClassDate")
	public String classDate;
        
	@JsonProperty("ClassDescription")
	public String classDescription;
        
	@JsonProperty("ClassOrigin")
	public String classOrigin;
}
