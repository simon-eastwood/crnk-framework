package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToMany;
import io.crnk.core.resource.annotations.JsonApiToOne;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public class DossierSnippet {

	public DossierSnippet() {};
    
	@JsonProperty("taskid")
	public String lalTaskId;
                
	@JsonProperty("applicantName")
	public String applicantName;
                
	@JsonProperty("applicationNumber")
	public String applicationNumber;
                
	@JsonProperty("dossierNumber")
	public String dossierNumber;
                
	@JsonProperty("DossierIsRead")
	public boolean dossierIsRead;

                 
	@JsonProperty("dossierType")
	public String dossierType;
                 
	@JsonProperty("dossierPhase")
	public String dossierPhase;
                
	@JsonProperty("dossierPhaseLabel")
	public String dossierPhaseLabel;
                
	@JsonProperty("leadClass")
	public String leadClass;
                
	@JsonProperty("priority")
	public int priority ;
                
	@JsonProperty("proceduralLanguage")
	public String proceduralLanguage;
                
	@JsonProperty("ranking")
	public String ranking;
                 
	@JsonProperty("technicalAcceptanceType")
	public String technicalAcceptanceType;
                
	@JsonProperty("technicalAccepted")
	public boolean technicalAccepted;

                
	@JsonProperty("titleOfInvention")
	public String titleOfInvention;
                 
	@JsonProperty("woIndicator")
	public String woIndicator;
                 
	@JsonProperty("taskStatusCode")
	public String taskStatusCode;
                 
	@JsonProperty("taskName")
	public String taskName;
                 
	@JsonProperty("workflowStatus")
	public String workflowStatus;
                
	@JsonProperty("workflowStatusCode")
	public String workflowStatusCode;
                
	@JsonProperty("targetMonthCalculated")
	public int targetMonth ;
                
	@JsonProperty("targetMonthCalculatedColor")
	public String targetMonthColor;
                
	@JsonProperty("CaseIdentifier")
	public int caseId ;
                
	@JsonProperty("LeadLimitDate")
	public Date leadDate;

                
	@JsonProperty("LeadLimitDateType")
	public String leadDateType;
                
	@JsonProperty("LeadLimitDateColor")
	public String leadDateColor;

	@JsonProperty
	public List<Sticker> dossierIndicators = new ArrayList<Sticker>();
                
	@JsonProperty("Examiner1")
	public String firstExaminer= "";

                
	@JsonProperty("Examiner2")
	public String secondExaminer= "";

                
	@JsonProperty("Chairman")
	public String chairman= "";

                
	@JsonProperty("Proposed1stExaminer")
	public String proposedFirstExaminer= "";

                
	@JsonProperty("EDossier")
	public boolean eDossier = false;

                
	@JsonProperty("BlockedForAllocation")
	public boolean blocked = false;

                
	@JsonProperty("SynchronizationStatus")
	public String synchronizationStatus= "";

                
	@JsonProperty("showAllocationTimeLimit")
	public boolean showAllocationTimeLimit = true;

                
	@JsonProperty("showTATimeLimit")
	public boolean showTATimeLimit = true;

                
	@JsonProperty("showLeadLimitDate")
	public boolean showLeadLimitDate = true;

                 
	@JsonProperty("alloc_timeLimitStatus")
	public String allocTimeLimitStatus;
                
	@JsonProperty("alloc_statusDateTime")
	public Date allocStatusDateTime;

                
	@JsonProperty("alloc_createdDateTime")
	public Date allocCreatedDateTime;

                
	@JsonProperty("alloc_createdDate")
	public Date allocCreatedDate;

                
	@JsonProperty("alloc_expirationDate")
	public Date allocExpirationDate;

                
	@JsonProperty("alloc_expirationDateColor")
	public String allocExpirationDateColor;
                
	@JsonProperty("alloc_signalDate")
	public Date allocSignalDate;

                
	@JsonProperty("alloc_changeDateTime")
	public Date allocChangeDateTime;

                
	@JsonProperty("alloc_limitDateType")
	public String allocLimitDateType;
                
	@JsonProperty("alloc_taskProgress")
	public String allocTaskProgress;
                 
	@JsonProperty("alloc_timeLimitType")
	public String allocTimeLimitType;
                
	@JsonProperty("alloc_timeLimitTypeCode")
	public String allocTimeLimitTypeCode;
                 
	@JsonProperty("tech_timeLimitStatus")
	public String techTimeLimitStatus;
                
	@JsonProperty("tech_statusDateTime")
	public Date techStatusDateTime;

                
	@JsonProperty("tech_createdDateTime")
	public Date techCreatedDateTime;

                
	@JsonProperty("tech_createdDate")
	public Date techCreatedDate;

                
	@JsonProperty("tech_expirationDate")
	public Date techExpirationDate;

                
	@JsonProperty("tech_expirationDateColor")
	public String techExpirationDateColor;
                
	@JsonProperty("tech_signalDate")
	public Date techSignalDate;

                
	@JsonProperty("tech_changeDateTime")
	public Date techChangeDateTime;

                
	@JsonProperty("tech_limitDateType")
	public String techLimitDateType;
                
	@JsonProperty("tech_taskProgress")
	public String techTaskProgress;
                 
	@JsonProperty("tech_timeLimitType")
	public String techTimeLimitType;
                
	@JsonProperty("tech_timeLimitTypeCode")
	public String techTimeLimitTypeCode;
                
	@JsonProperty("DateActionPerformed")
	public String dateActionPerformed;
                
	@JsonProperty("ActionPerformed")
	public String actionPerformed;
                
	@JsonProperty("NumberOfPages")
	public int numberOfPages ;
                
	@JsonProperty("NumberOfClaims")
	public int numberOfClaims ;
                
	@JsonProperty("Examiner1Fullname")
	public String firstExaminerFullName;

                
	@JsonProperty("Examiner2Fullname")
	public String secondExaminerFullName;

                
	@JsonProperty("ChairmanFullname")
	public String chairmanFullName;
                
	@JsonProperty("Proposed1stExaminerFullname")
	public String proposed1stExaminerFullName;
                
	@JsonProperty("ProposedExaminerFromSameDir")
	public boolean proposedExaminerFromSameDir;

                
	@JsonProperty("DatePreallocated")
	public Date datePreallocated;

                
	@JsonProperty("FullnamePreAllocatedBy")
	public String fullNamePreAllocatedBy;
                
	@JsonProperty("Preallocated")
	public boolean isPreallocated;

                
	@JsonProperty("MarkedToInspect")
	public String markedForInspection;
                
	@JsonProperty("DateMarked")
	public Date dateMarked;

                
	@JsonProperty("MarkedBy")
	public String markedBy;
                
	@JsonProperty("MarkedByFullname")
	public String markedByFullName;
                
	@JsonProperty("AssociatedFilingsPresent")
	public boolean isAssociatedFilingsPresent;

                
	@JsonProperty("RoleName")
	public String roleNameId;
                
	@JsonProperty("DateTimeMarked")
	public Date dateTimeMarked;

                
	@JsonProperty("InspectionComment")
	public String inspectionComment;
}
