package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToMany;
import io.crnk.core.resource.annotations.JsonApiToOne;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


@JsonApiResource(type = "tray")
public class Tray {
	@JsonApiId
	private String jsonApiId;
	public String getJsonApiId() {return this.jsonApiId;}
	public void setJsonApiId(String id) { this.jsonApiId = id;}
	public Tray(String id) {this.jsonApiId = id;}


	@JsonProperty
	private String eTag = null;
	public String getEtag() {return this.eTag;}
	public void setEtag(String etag) { this.eTag  = etag ;}

	public Tray() {};

	@JsonProperty("Traykey")
	public String trayKey;

	@JsonProperty("ParentID")
	public String parentTrayKey;

	@JsonProperty("Item")
	public String name;

	@JsonProperty("Count_all")
	public int total ;

	@JsonProperty("Count_read")
	public int totalRead ;

	@JsonProperty("Count_prio")
	public int urgent ;

	@JsonProperty("Deputized")
	public boolean deputised;


     @JsonApiToOne
	private WorkList workList;

      
	public String getWorkList() {
		return this.workList;
	}

	public void setWorkList(WorkList w) {
		this.workList= w;
	}

	public String getTrayKey() {
		return trayKey;
	}

	public void setTrayKey(String trayKey) {
		this.trayKey = trayKey;
	}

	public String getParentTrayKey() {
		return parentTrayKey;
	}

	public void setParentTrayKey(String parentTrayKey) {
		this.parentTrayKey = parentTrayKey;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotalRead() {
		return totalRead;
	}

	public void setTotalRead(int totalRead) {
		this.totalRead = totalRead;
	}

	public int getUrgent() {
		return urgent;
	}

	public void setUrgent(int urgent) {
		this.urgent = urgent;
	}

	public boolean isDeputised() {
		return deputised;
	}

	public void setDeputised(boolean deputised) {
		this.deputised = deputised;
	}
}
