package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToMany;
import io.crnk.core.resource.annotations.JsonApiToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


@JsonApiResource(type = "readdossierresponse")
public class ReadDossierResponse {
	@JsonApiId
	private String jsonApiId;
	public String getJsonApiId() {return this.jsonApiId;}
	public void setJsonApiId(String id) { this.jsonApiId = id;}
	public ReadDossierResponse(String id) {this.jsonApiId = id;}


	@JsonProperty
	private String eTag = null;
	public String getEtag() {return this.eTag;}
	public void setEtag(String etag) { this.eTag  = etag ;}

	public ReadDossierResponse() {};
    

	@JsonProperty
	public DossierBI[] dossiers;
        

	@JsonProperty
	public DossierTimeLimit[] timeLimits;
        

	@JsonProperty
	public DossierInfoIndicator[] indicators;
        

	@JsonProperty
	public DossierEvent[] events;
        

	@JsonProperty
	public DossierInvolvement[] involvements;
}
