package io.crnk.example.springboot.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "tunnel")
public class Tunnel {
	
	@JsonApiId
	private String jsonApiId;
	
	@JsonProperty
	private String eTag;
	
	@JsonProperty("payload")
	public String payload;
	
	public Tunnel() {};
        
	public Tunnel(String id) {
		this.jsonApiId = id;
	}
	
	public String geteTag() {
		return eTag;
	}
	public void seteTag(String eTag) {
		this.eTag = eTag;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	public String getJsonApiId() {
		return jsonApiId;
	}
	public void setJsonApiId(String jsonApiId) {
		this.jsonApiId = jsonApiId;
	}
}
