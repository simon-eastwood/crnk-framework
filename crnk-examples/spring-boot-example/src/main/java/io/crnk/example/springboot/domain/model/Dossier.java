
package io.crnk.example.springboot.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToOne;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;


@JsonApiResource(type = "dossier")
public class Dossier {

	@JsonApiId
	private String trimmedApplicationNumberId; // the applicationNUmber is the Id but json-api will always call this "id" in the JSON

	@JsonProperty
	private String trimmedApplicationNumber; // shadow copy to make mapping in client easier

	@JsonProperty
	private String caseId;

	@JsonProperty
	private String lalTaskId;

	@JsonApiToOne
	private DossierInfo dossierInfo;


	@JsonProperty
	public List<Sticker> DossierIndicators = new ArrayList<Sticker>();

	public DossierInfo getDossierInfo() {
		return dossierInfo;
	}

	public void setDossierInfo(DossierInfo dossierInfo) {
		this.dossierInfo = dossierInfo;
	}

	public String getLalTaskId() {
		return lalTaskId;
	}

	public void setLalTaskId(String lalTaskId) {
		this.lalTaskId = lalTaskId;
	}

	public String getTrimmedApplicationNumberId() {
		return trimmedApplicationNumberId;
	}

	public void setTrimmedApplicationNumberId(String trimmedApplicationNumberId) {
		this.trimmedApplicationNumberId = trimmedApplicationNumberId;
	}

	public String getTrimmedApplicationNumber() {
		return trimmedApplicationNumber;
	}

	public void setTrimmedApplicationNumber(String trimmedApplicationNumber) {
		this.trimmedApplicationNumber = trimmedApplicationNumber;
	}

	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public Dossier() {
	}

	public Dossier(String aNumber) {
		this.setTrimmedApplicationNumber(aNumber);
		this.setTrimmedApplicationNumberId(aNumber);
	}



}
