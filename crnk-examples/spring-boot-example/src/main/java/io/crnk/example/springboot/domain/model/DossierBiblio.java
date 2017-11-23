package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToMany;
import io.crnk.core.resource.annotations.JsonApiToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


@JsonApiResource(type = "dossierbiblio")
public class DossierBiblio {
	@JsonApiId
	private String jsonApiId;
	public String getJsonApiId() {return this.jsonApiId;}
	public void setJsonApiId(String id) { this.jsonApiId = id;}
	public DossierBiblio(String id) {this.jsonApiId = id;}


	@JsonProperty
	private String eTag = null;
	public String getEtag() {return this.eTag;}
	public void setEtag(String etag) { this.eTag  = etag ;}

	public DossierBiblio() {};
    
	@JsonProperty("applicationNumber")
	public String applicationNumber;
        
	@JsonProperty("dateOfFiling")
	public Date dateOfFiling;

        
	@JsonProperty("applicationTitle")
	public String applicationTitle;
        
	@JsonProperty("proceduralLanguage")
	public String proceduralLanguage;
        
	@JsonProperty("drawingUrl")
	public String drawingUrl;
        
	@JsonProperty("applicant")
	public String applicant;
        
	@JsonProperty("representative")
	public String representative;
        
	@JsonProperty("numberOfPages")
	public int numberOfPages ;
        
	@JsonProperty("leadClassOrigin")
	public String leadClassOrigin;
        
	@JsonProperty("origin")
	public String origin;

	@JsonProperty
	public List<String> familyMemberApplicationNumbers = new ArrayList<String>();

	@JsonProperty
	public List<PublicationNumber> publicationNumbers = new ArrayList<PublicationNumber>();

	@JsonProperty
	public List<String> priorityClaims = new ArrayList<String>();

	@JsonProperty
	public List<String> divisionals = new ArrayList<String>();

	@JsonProperty
	public List<String> ipcClasses = new ArrayList<String>();

	@JsonProperty
	public List<String> ipcClassesDescription = new ArrayList<String>();

	@JsonProperty
	public List<String> cpcClasses = new ArrayList<String>();

	@JsonProperty
	public List<String> cpcClassesDescription = new ArrayList<String>();
}
