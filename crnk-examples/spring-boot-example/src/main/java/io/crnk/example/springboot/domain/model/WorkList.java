package io.crnk.example.springboot.domain.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToMany;

@JsonApiResource(type = "worklist")
public class WorkList {
	
	@JsonApiId
	private String jsonApiId;

	@JsonProperty
	private String eTag = null;

	@JsonApiToMany
	public List<DossierSnippet> dossierSnippet = new ArrayList<DossierSnippet>();

	public WorkList() {
	}
	
	public WorkList(String id) {
		this.jsonApiId = id;
	}
	
	public String getJsonApiId() {
		return this.jsonApiId;
	}

	public void setJsonApiId(String id) {
		this.jsonApiId = id;
	}

	public String geteTag() {
		return eTag;
	}

	public void seteTag(String eTag) {
		this.eTag = eTag;
	}

	public List<DossierSnippet> getDossierSnippet() {
		return dossierSnippet;
	}

	public void setDossierSnippet(List<DossierSnippet> dossierSnippet) {
		this.dossierSnippet = dossierSnippet;
	}

}
