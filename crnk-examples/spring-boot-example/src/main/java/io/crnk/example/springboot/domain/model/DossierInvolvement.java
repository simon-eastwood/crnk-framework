package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DossierInvolvement {

	public DossierInvolvement() {};
    
	@JsonProperty("dossierInvolvementAccountId")
	public String dossierInvolvementAccountId;
        
	@JsonProperty("accountFullname")
	public String accountFullName;
        
	@JsonProperty("dossierInvolvementType")
	public String dossierInvolvementType;

	@JsonProperty("roleTypeDescription")
	public String roleTypeDescription;
        
	@JsonProperty("dossierInvolvementStartDate")
	public String dossierInvolvementStartDate;

	@JsonProperty("dossierInvolvementEndDate")
	public String dossierInvolvementEndDate;
	
	public String getDossierInvolvementAccountId() {
		return dossierInvolvementAccountId;
	}

	public void setDossierInvolvementAccountId(String dossierInvolvementAccountId) {
		this.dossierInvolvementAccountId = dossierInvolvementAccountId;
	}


	public String getAccountFullName() {
		return accountFullName;
	}


	public void setAccountFullName(String accountFullName) {
		this.accountFullName = accountFullName;
	}


	public String getDossierInvolvementType() {
		return dossierInvolvementType;
	}


	public void setDossierInvolvementType(String dossierInvolvementType) {
		this.dossierInvolvementType = dossierInvolvementType;
	}


	public String getRoleTypeDescription() {
		return roleTypeDescription;
	}


	public void setRoleTypeDescription(String roleTypeDescription) {
		this.roleTypeDescription = roleTypeDescription;
	}

	public String getDossierInvolvementStartDate() {
		return dossierInvolvementStartDate;
	}

	public void setDossierInvolvementStartDate(String dossierInvolvementStartDate) {
		this.dossierInvolvementStartDate = dossierInvolvementStartDate;
	}

	public String getDossierInvolvementEndDate() {
		return dossierInvolvementEndDate;
	}

	public void setDossierInvolvementEndDate(String dossierInvolvementEndDate) {
		this.dossierInvolvementEndDate = dossierInvolvementEndDate;
	}


}
