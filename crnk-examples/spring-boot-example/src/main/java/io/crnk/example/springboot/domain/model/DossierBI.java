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
	public DossierBI(String id) {this.jsonApiId = id};


	@JsonProperty
	private String eTag = null;
	public String getEtag() {return this.eTag;}
	public void setEtag(String etag) { this.eTag  = eTag ;}

	public DossierBI() {};
        
	@JsonProperty(name="ApplicationNumber")
	private String applicationNumber;
        
	@JsonProperty(name="DossierNumber")
	private String dossierNumber;
        
	@JsonProperty(name="dossierPhase")
	private String dossierPhase;
        
	@JsonProperty(name="dossierPhaseLabel")
	private String dossierPhaseLabel;
        
	@JsonProperty(name="DoublureIndicator")
	private String doublureIndicator;
        
	@JsonProperty(name="FilingDate")
	private Date filingDate;

        
	@JsonProperty(name="FilingLanguage")
	private String filingLanguage;
        
	@JsonProperty(name="LeadClass")
	private String leadClass;
        
	@JsonProperty(name="LeadLimitDate")
	private Date leadDate;

        
	@JsonProperty(name="LeadLimitDateType")
	private String leadDateType;
        
	@JsonProperty(name="LeadLimitDateColor")
	private String private leadDateColor;
        
	@JsonProperty(name="Priority")
	private String priority;
        
	@JsonProperty(name="ProceduralLanguage")
	private String proceduralLanguage;
        
	@JsonProperty(name="ProcedureType")
	private String procedureType;
        
	@JsonProperty(name="ProcedureLabel")
	private String procedureLabel;
        
	@JsonProperty(name="Ranking")
	private String ranking;
        
	@JsonProperty(name="ReceivingDate")
	private Date receivingDate;

        
	@JsonProperty(name="targetMonthCalculated")
	private int targetMonth ;
        
	@JsonProperty(name="targetMonthCalculatedColor")
	private String private targetMonthColor;
        
	@JsonProperty(name="WorkflowStatusType")
	private String workflowStatusType;
        
	@JsonProperty(name="WorkflowStatusLabel")
	private String workflowStatusLabel;
        
	@JsonProperty(name="CaseID")
	private String caseId;
        
	@JsonProperty(name="taskTypeCode")
	private String taskTypeCode;
        
	@JsonProperty(name="taskStatusCode")
	private String taskStatusCode;
        
	@JsonProperty(name="TaskStatusLabel")
	private String taskStatusLabel;
        
	@JsonProperty(name="TitleOfInvention")
	private String titleOfInvention;
        
	@JsonProperty(name="WorkflowStatusCode")
	private String workflowStatusCode;
        
	@JsonProperty(name="internalStatus")
	private String internalStatus;
        
	@JsonProperty(name="TechnicallyAccepted")
	private boolean technicallyAccepted;

        
	@JsonProperty(name="technicalAcceptanceType")
	private String technicalAcceptanceType;
        
	@JsonProperty(name="Director")
	private String director;
        
	@JsonProperty(name="Directorate")
	private String directorate;
        
	@JsonProperty(name="DirectorateName")
	private String directorateName;
        
	@JsonProperty(name="DirectorCode")
	private String directorCode;
        
	@JsonProperty(name="SISUnit")
	private String sisUnit;
        
	@JsonProperty(name="SISUnitCode")
	private String sisUnitCode;
        
	@JsonProperty(name="eDossierInd")
	private boolean eDossier;

        
	@JsonProperty(name="dossierType")
	private String dossierType;
        
	@JsonProperty(name="DossierReadByUser")
	private boolean dossierRead;


	@JsonProperty
	private List<Sticker> DossierIndicators = new ArrayList<>();
        
	@JsonProperty(name="A2LimitDate")
	private Date a2Limit;

        
	@JsonProperty(name="NumberOfClaims")
	private int numberOfClaims ;
        
	@JsonProperty(name="NumberOfPages")
	private int numberOfPages ;
        
	@JsonProperty(name="DatePreallocated")
	private Date datePreallocated;

        
	@JsonProperty(name="FullnamePre_AllocatedBy")
	private String fullNamePreAllocatedBy;
        
	@JsonProperty(name="Preallocated")
	private boolean isPreallocated;

        
	@JsonProperty(name="INSP_MarkedToInspect")
	private String markedForInspection;
        
	@JsonProperty(name="INSP_DateMarked")
	private Date dateMarked;

        
	@JsonProperty(name="INSP_MarkedBy")
	private String markedBy;
        
	@JsonProperty(name="LAL_taskId")
	private String lalTaskId;
        
	@JsonProperty(name="DateTimeMarked")
	private Date dateTimeMarked;

        
	@JsonProperty(name="InspectionComment")
	private String inspectionComment;
        
	@JsonProperty(name="MarkedByFullname")
	private string markedByFullName;
}
