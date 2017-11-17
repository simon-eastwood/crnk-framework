
package main.java.io.crnk.example.springboot.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;

import java.util.Date;
import java.util.List;


@JsonApiResource(type = "dossierassociatefiling")
public class DossierAssociateFiling {

	@JsonApiId
	private String assId; //


	//	public dossierInfoIndicators: Array<DossierInfoIndicator> = [];
	// private  timeLimits: Array<DossierTimeLimit> = [];
//	public events: Array<DossierEvent> = [];
//	public involvements: Array<DossierInvolvement> = [];

	@JsonProperty
	private String applicationNumber; // of the associated filing

	@JsonProperty
	private Date dateOfFiling;

	@JsonProperty
	private String typeOfAssociation;

	@JsonProperty
	private boolean parent;

	@JsonProperty
	private String firstExaminer;

	@JsonProperty
	private String searchExaminer;


	public DossierAssociateFiling() {
	}

	public DossierAssociateFiling(String aNumber) {
		this.setAssId(aNumber);
	}

	public String getAssId() {
		return assId;
	}

	public void setAssId(String assId) {
		this.assId = assId;
	}

	public String getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public Date getDateOfFiling() {
		return dateOfFiling;
	}

	public void setDateOfFiling(Date dateOfFiling) {
		this.dateOfFiling = dateOfFiling;
	}

	public String getTypeOfAssociation() {
		return typeOfAssociation;
	}

	public void setTypeOfAssociation(String typeOfAssociation) {
		this.typeOfAssociation = typeOfAssociation;
	}

	public boolean isParent() {
		return parent;
	}

	public void setParent(boolean parent) {
		this.parent = parent;
	}

	public String getFirstExaminer() {
		return firstExaminer;
	}

	public void setFirstExaminer(String firstExaminer) {
		this.firstExaminer = firstExaminer;
	}

	public String getSearchExaminer() {
		return searchExaminer;
	}

	public void setSearchExaminer(String searchExaminer) {
		this.searchExaminer = searchExaminer;
	}
}
