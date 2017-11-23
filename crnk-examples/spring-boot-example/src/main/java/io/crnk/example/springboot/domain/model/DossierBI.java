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
	private String dossierNumber;
        
	@JsonProperty("dossierPhase")
	private String dossierPhase;
        
	@JsonProperty("dossierPhaseLabel")
	private String dossierPhaseLabel;
        
	@JsonProperty("DoublureIndicator")
	private String doublureIndicator;
        
	@JsonProperty("FilingDate")
	private Date filingDate;

        
	@JsonProperty("FilingLanguage")
	private String filingLanguage;
        
	@JsonProperty("LeadClass")
	private String leadClass;
        
	@JsonProperty("LeadLimitDate")
	private Date leadDate;

        
	@JsonProperty("LeadLimitDateType")
	private String leadDateType;
        
	@JsonProperty("LeadLimitDateColor")
	private String leadDateColor;
        
	@JsonProperty("Priority")
	private String priority;
        
	@JsonProperty("ProceduralLanguage")
	private String proceduralLanguage;
        
	@JsonProperty("ProcedureType")
	private String procedureType;
        
	@JsonProperty("ProcedureLabel")
	private String procedureLabel;
        
	@JsonProperty("Ranking")
	private String ranking;
        
	@JsonProperty("ReceivingDate")
	private Date receivingDate;

        
	@JsonProperty("targetMonthCalculated")
	private int targetMonth ;
        
	@JsonProperty("targetMonthCalculatedColor")
	private String targetMonthColor;
        
	@JsonProperty("WorkflowStatusType")
	private String workflowStatusType;
        
	@JsonProperty("WorkflowStatusLabel")
	private String workflowStatusLabel;
        
	@JsonProperty("CaseID")
	private String caseId;
        
	@JsonProperty("taskTypeCode")
	private String taskTypeCode;
        
	@JsonProperty("taskStatusCode")
	private String taskStatusCode;
        
	@JsonProperty("TaskStatusLabel")
	private String taskStatusLabel;
        
	@JsonProperty("TitleOfInvention")
	private String titleOfInvention;
        
	@JsonProperty("WorkflowStatusCode")
	private String workflowStatusCode;
        
	@JsonProperty("internalStatus")
	private String internalStatus;
        
	@JsonProperty("TechnicallyAccepted")
	private boolean technicallyAccepted;

        
	@JsonProperty("technicalAcceptanceType")
	private String technicalAcceptanceType;
        
	@JsonProperty("Director")
	private String director;
        
	@JsonProperty("Directorate")
	private String directorate;
        
	@JsonProperty("DirectorateName")
	private String directorateName;
        
	@JsonProperty("DirectorCode")
	private String directorCode;
        
	@JsonProperty("SISUnit")
	private String sisUnit;
        
	@JsonProperty("SISUnitCode")
	private String sisUnitCode;
        
	@JsonProperty("eDossierInd")
	private boolean eDossier;

        
	@JsonProperty("dossierType")
	private String dossierType;
        
	@JsonProperty("DossierReadByUser")
	private boolean dossierRead;


	@JsonProperty
	public List<Sticker> DossierIndicators = new ArrayList<Sticker>();
        
	@JsonProperty("A2LimitDate")
	private Date a2Limit;

        
	@JsonProperty("NumberOfClaims")
	private int numberOfClaims ;
        
	@JsonProperty("NumberOfPages")
	private int numberOfPages ;
        
	@JsonProperty("DatePreallocated")
	private Date datePreallocated;

        
	@JsonProperty("FullnamePre_AllocatedBy")
	private String fullNamePreAllocatedBy;
        
	@JsonProperty("Preallocated")
	private boolean isPreallocated;

        
	@JsonProperty("INSP_MarkedToInspect")
	private String markedForInspection;
        
	@JsonProperty("INSP_DateMarked")
	private Date dateMarked;

        
	@JsonProperty("INSP_MarkedBy")
	private String markedBy;
        
	@JsonProperty("LAL_taskId")
	private String lalTaskId;
        
	@JsonProperty("DateTimeMarked")
	private Date dateTimeMarked;

        
	@JsonProperty("InspectionComment")
	private String inspectionComment;
        
	@JsonProperty("MarkedByFullname")
	private String markedByFullName;
}
