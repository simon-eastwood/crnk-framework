package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToMany;
import io.crnk.core.resource.annotations.JsonApiToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


@JsonApiResource(type = "dossierbi")
public class DossierBI {
	@JsonApiId
	private String jsonApiId;
	public String getJsonApiId() {return this.jsonApiId;}
	public void setJsonApiId(String id) { this.jsonApiId = id;}
	public DossierBI(String id) {this.jsonApiId = id;}


	@JsonProperty
	private String eTag = null;
	public String getEtag() {return this.eTag;}
	public void setEtag(String etag) { this.eTag  = eTag ;}

	public DossierBI() {};
        
	@JsonProperty("ApplicationNumber")
	public String applicationNumber;
        
	@JsonProperty("DossierNumber")
	public String dossierNumber;
        
	@JsonProperty("dossierPhase")
	public String dossierPhase;
        
	@JsonProperty("dossierPhaseLabel")
	public String dossierPhaseLabel;
        
	@JsonProperty("DoublureIndicator")
	public String doublureIndicator;
        
	@JsonProperty("FilingDate")
	public Date filingDate;

        
	@JsonProperty("FilingLanguage")
	public String filingLanguage;
        
	@JsonProperty("LeadClass")
	public String leadClass;
        
	@JsonProperty("LeadLimitDate")
	public Date leadDate;

        
	@JsonProperty("LeadLimitDateType")
	public String leadDateType;
        
	@JsonProperty("LeadLimitDateColor")
	public String leadDateColor;
        
	@JsonProperty("Priority")
	public String priority;
        
	@JsonProperty("ProceduralLanguage")
	public String proceduralLanguage;
        
	@JsonProperty("ProcedureType")
	public String procedureType;
        
	@JsonProperty("ProcedureLabel")
	public String procedureLabel;
        
	@JsonProperty("Ranking")
	public String ranking;
        
	@JsonProperty("ReceivingDate")
	public Date receivingDate;

        
	@JsonProperty("targetMonthCalculated")
	public int targetMonth ;
        
	@JsonProperty("targetMonthCalculatedColor")
	public String targetMonthColor;
        
	@JsonProperty("WorkflowStatusType")
	public String workflowStatusType;
        
	@JsonProperty("WorkflowStatusLabel")
	public String workflowStatusLabel;
        
	@JsonProperty("CaseID")
	public String caseId;
        
	@JsonProperty("taskTypeCode")
	public String taskTypeCode;
        
	@JsonProperty("taskStatusCode")
	public String taskStatusCode;
        
	@JsonProperty("TaskStatusLabel")
	public String taskStatusLabel;
        
	@JsonProperty("TitleOfInvention")
	public String titleOfInvention;
        
	@JsonProperty("WorkflowStatusCode")
	public String workflowStatusCode;
        
	@JsonProperty("internalStatus")
	public String internalStatus;
        
	@JsonProperty("TechnicallyAccepted")
	public boolean technicallyAccepted;

        
	@JsonProperty("technicalAcceptanceType")
	public String technicalAcceptanceType;
        
	@JsonProperty("Director")
	public String director;
        
	@JsonProperty("Directorate")
	public String directorate;
        
	@JsonProperty("DirectorateName")
	public String directorateName;
        
	@JsonProperty("DirectorCode")
	public String directorCode;
        
	@JsonProperty("SISUnit")
	public String sisUnit;
        
	@JsonProperty("SISUnitCode")
	public String sisUnitCode;
        
	@JsonProperty("eDossierInd")
	public boolean eDossier;

        
	@JsonProperty("dossierType")
	public String dossierType;
        
	@JsonProperty("DossierReadByUser")
	public boolean dossierRead;


	@JsonProperty
	public List<Sticker> DossierIndicators = new ArrayList<Sticker>();
        
	@JsonProperty("A2LimitDate")
	public Date a2Limit;

        
	@JsonProperty("NumberOfClaims")
	public int numberOfClaims ;
        
	@JsonProperty("NumberOfPages")
	public int numberOfPages ;
        
	@JsonProperty("DatePreallocated")
	public Date datePreallocated;

        
	@JsonProperty("FullnamePre_AllocatedBy")
	public String fullNamePreAllocatedBy;
        
	@JsonProperty("Preallocated")
	public boolean isPreallocated;

        
	@JsonProperty("INSP_MarkedToInspect")
	public String markedForInspection;
        
	@JsonProperty("INSP_DateMarked")
	public Date dateMarked;

        
	@JsonProperty("INSP_MarkedBy")
	public String markedBy;
        
	@JsonProperty("LAL_taskId")
	public String lalTaskId;
        
	@JsonProperty("DateTimeMarked")
	public Date dateTimeMarked;

        
	@JsonProperty("InspectionComment")
	public String inspectionComment;
        
	@JsonProperty("MarkedByFullname")
	public String markedByFullName;
}
