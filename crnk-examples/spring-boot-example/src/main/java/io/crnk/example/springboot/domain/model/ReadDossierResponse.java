package io.crnk.example.springboot.domain.model;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToOne;

@JsonApiResource(type = "readdossierresponse")
public class ReadDossierResponse {
	
	@JsonApiId
	private String jsonApiId;
	public String getJsonApiId() {return this.jsonApiId;}
	public void setJsonApiId(String id) { this.jsonApiId = id;}
	public ReadDossierResponse(String id) {this.jsonApiId = id;}

	@JsonProperty
	private String eTag = null;

	public ReadDossierResponse() {};

	@JsonApiToOne
	public Tunnel dossierBi;

	@JsonApiToOne
	public Tunnel dossierBiblio;

	@JsonApiToOne
	public List<Tunnel> dossierClass = new ArrayList<>();

	@JsonApiToOne
	public List<Tunnel> dossierAssociateFiling = new ArrayList<>();;

	@JsonProperty
	public List<DossierTimeLimit> timeLimits = new ArrayList<>();

	@JsonProperty
	public List<DossierInfoIndicator> indicators = new ArrayList<>();

	@JsonProperty
	public List<DossierEvent> events = new ArrayList<>();;

	@JsonProperty
	public List<DossierInvolvement> involvements = new ArrayList<>();
	
	public List<DossierTimeLimit> getTimeLimits() {
		return timeLimits;
	}
	public void setTimeLimits(List<DossierTimeLimit> timeLimits) {
		this.timeLimits = timeLimits;
	}
	public List<DossierInfoIndicator> getIndicators() {
		return indicators;
	}
	public void setIndicators(List<DossierInfoIndicator> indicators) {
		this.indicators = indicators;
	}
	public List<DossierEvent> getEvents() {
		return events;
	}
	public void setEvents(List<DossierEvent> events) {
		this.events = events;
	}
	public List<DossierInvolvement> getInvolvements() {
		return involvements;
	}
	public void setInvolvements(List<DossierInvolvement> involvements) {
		this.involvements = involvements;
	}
	
	public String geteTag() {
		return eTag;
	}
	public void seteTag(String eTag) {
		this.eTag = eTag;
	}
	
	public Tunnel getDossierBi() {
		return dossierBi;
	}
	public void setDossierBi(Tunnel dossierBi) {
		this.dossierBi = dossierBi;
	}
	public Tunnel getDossierBiblio() {
		return dossierBiblio;
	}
	public void setDossierBiblio(Tunnel dossierBiblio) {
		this.dossierBiblio = dossierBiblio;
	}
	public List<Tunnel> getDossierClass() {
		return dossierClass;
	}
	public void setDossierClass(List<Tunnel> dossierClass) {
		this.dossierClass = dossierClass;
	}
	public List<Tunnel> getDossierAssociateFiling() {
		return dossierAssociateFiling;
	}
	public void setDossierAssociateFiling(List<Tunnel> dossierAssociateFiling) {
		this.dossierAssociateFiling = dossierAssociateFiling;
	}
}
