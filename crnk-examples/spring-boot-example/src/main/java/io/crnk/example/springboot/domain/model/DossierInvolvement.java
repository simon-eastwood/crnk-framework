package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToMany;
import io.crnk.core.resource.annotations.JsonApiToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


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
	public Date dossierInvolvementStartDate;

        
	@JsonProperty("dossierInvolvementEndDate")
	public Date dossierInvolvementEndDate;
}
