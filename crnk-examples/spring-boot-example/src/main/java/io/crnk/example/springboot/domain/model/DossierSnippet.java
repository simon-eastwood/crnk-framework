package io.crnk.example.springboot.domain.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;

@JsonApiResource(type = "dossiersnippet")
public class DossierSnippet {

	@JsonApiId
	private String jsonApiId;

	@JsonProperty
	private String eTag = null;
	
	@JsonProperty("taskid")
	private String lalTaskId;
                
	@JsonProperty("applicantName")
	private String applicantName;
                
	//Should be changed it to ID
	@JsonProperty("applicationNumber")
	private String applicationNumber;
                
	@JsonProperty("dossierNumber")
	private String dossierNumber;
                
	@JsonProperty("DossierIsRead")
	private boolean dossierIsRead;
                 
	@JsonProperty("dossierType")
	private String dossierType;
                 
	@JsonProperty("dossierPhase")
	private String dossierPhase;
                
	@JsonProperty("dossierPhaseLabel")
	private String dossierPhaseLabel;
                
	@JsonProperty("leadClass")
	private String leadClass;
                
	@JsonProperty("priority")
	private int priority ;
                
	@JsonProperty("proceduralLanguage")
	private String proceduralLanguage;
                
	@JsonProperty("ranking")
	private String ranking;
                 
	@JsonProperty("technicalAcceptanceType")
	private String technicalAcceptanceType;
                
	@JsonProperty("technicalAccepted")
	private boolean technicalAccepted;

                
	@JsonProperty("titleOfInvention")
	private String titleOfInvention;
                 
	@JsonProperty("woIndicator")
	private String woIndicator;
                 
	@JsonProperty("taskStatusCode")
	private String taskStatusCode;
                 
	@JsonProperty("taskName")
	private String taskName;
                 
	@JsonProperty("workflowStatus")
	private String workflowStatus;
                
	@JsonProperty("workflowStatusCode")
	private String workflowStatusCode;
                
	@JsonProperty("targetMonthCalculated")
	private int targetMonth ;
                
	@JsonProperty("targetMonthCalculatedColor")
	private String targetMonthColor;
                
	@JsonProperty("CaseIdentifier")
	private int caseId ;
                
	@JsonProperty("LeadLimitDate")
	private Date leadDate;

                
	@JsonProperty("LeadLimitDateType")
	private String leadDateType;
                
	@JsonProperty("LeadLimitDateColor")
	private String leadDateColor;

	@JsonProperty
	private List<Sticker> dossierIndicators = new ArrayList<Sticker>();
                
	@JsonProperty("Examiner1")
	private String firstExaminer= "";

                
	@JsonProperty("Examiner2")
	private String secondExaminer= "";

                
	@JsonProperty("Chairman")
	private String chairman= "";

                
	@JsonProperty("Proposed1stExaminer")
	private String proposedFirstExaminer= "";

                
	@JsonProperty("EDossier")
	private boolean eDossier = false;

                
	@JsonProperty("BlockedForAllocation")
	private boolean blocked = false;

                
	@JsonProperty("SynchronizationStatus")
	private String synchronizationStatus= "";

                
	@JsonProperty("showAllocationTimeLimit")
	private boolean showAllocationTimeLimit = true;

                
	@JsonProperty("showTATimeLimit")
	private boolean showTATimeLimit = true;

                
	@JsonProperty("showLeadLimitDate")
	private boolean showLeadLimitDate = true;

                 
	@JsonProperty("alloc_timeLimitStatus")
	private String allocTimeLimitStatus;
                
	@JsonProperty("alloc_statusDateTime")
	private Date allocStatusDateTime;

                
	@JsonProperty("alloc_createdDateTime")
	private Date allocCreatedDateTime;

                
	@JsonProperty("alloc_createdDate")
	private Date allocCreatedDate;

                
	@JsonProperty("alloc_expirationDate")
	private Date allocExpirationDate;

                
	@JsonProperty("alloc_expirationDateColor")
	private String allocExpirationDateColor;
                
	@JsonProperty("alloc_signalDate")
	private Date allocSignalDate;

                
	@JsonProperty("alloc_changeDateTime")
	private Date allocChangeDateTime;

                
	@JsonProperty("alloc_limitDateType")
	private String allocLimitDateType;
                
	@JsonProperty("alloc_taskProgress")
	private String allocTaskProgress;
                 
	@JsonProperty("alloc_timeLimitType")
	private String allocTimeLimitType;
                
	@JsonProperty("alloc_timeLimitTypeCode")
	private String allocTimeLimitTypeCode;
                 
	@JsonProperty("tech_timeLimitStatus")
	private String techTimeLimitStatus;
                
	@JsonProperty("tech_statusDateTime")
	private Date techStatusDateTime;

                
	@JsonProperty("tech_createdDateTime")
	private Date techCreatedDateTime;

                
	@JsonProperty("tech_createdDate")
	private Date techCreatedDate;

                
	@JsonProperty("tech_expirationDate")
	private Date techExpirationDate;

                
	@JsonProperty("tech_expirationDateColor")
	private String techExpirationDateColor;
                
	@JsonProperty("tech_signalDate")
	private Date techSignalDate;

                
	@JsonProperty("tech_changeDateTime")
	private Date techChangeDateTime;

                
	@JsonProperty("tech_limitDateType")
	private String techLimitDateType;
                
	@JsonProperty("tech_taskProgress")
	private String techTaskProgress;
                 
	@JsonProperty("tech_timeLimitType")
	private String techTimeLimitType;
                
	@JsonProperty("tech_timeLimitTypeCode")
	private String techTimeLimitTypeCode;
                
	@JsonProperty("DateActionPerformed")
	private String dateActionPerformed;
                
	@JsonProperty("ActionPerformed")
	private String actionPerformed;
                
	@JsonProperty("NumberOfPages")
	private int numberOfPages ;
                
	@JsonProperty("NumberOfClaims")
	private int numberOfClaims ;
                
	@JsonProperty("Examiner1Fullname")
	private String firstExaminerFullName;

                
	@JsonProperty("Examiner2Fullname")
	private String secondExaminerFullName;

	@JsonProperty("ChairmanFullname")
	private String chairmanFullName;
                
	@JsonProperty("Proposed1stExaminerFullname")
	private String proposed1stExaminerFullName;
                
	@JsonProperty("ProposedExaminerFromSameDir")
	private boolean proposedExaminerFromSameDir;

	@JsonProperty("DatePreallocated")
	private Date datePreallocated;

	@JsonProperty("FullnamePreAllocatedBy")
	private String fullNamePreAllocatedBy;
                
	@JsonProperty("Preallocated")
	private boolean isPreallocated;

	@JsonProperty("MarkedToInspect")
	private String markedForInspection;
                
	@JsonProperty("DateMarked")
	private Date dateMarked;

	@JsonProperty("MarkedBy")
	private String markedBy;
                
	@JsonProperty("MarkedByFullname")
	private String markedByFullName;
                
	@JsonProperty("AssociatedFilingsPresent")
	private boolean isAssociatedFilingsPresent;

	@JsonProperty("RoleName")
	private String roleNameId;
                
	@JsonProperty("DateTimeMarked")
	private Date dateTimeMarked;
                
	@JsonProperty("InspectionComment")
	private String inspectionComment;

	public DossierSnippet() {}; 

	public DossierSnippet(String id) {
		this.jsonApiId = id;
	}

	public String getJsonApiId() {
		return this.jsonApiId;
	}
	
	public void setJsonApiId(String id) {
		this.jsonApiId = id;
	}
	
	public String geteTag() {
		return eTag;
	}

	public void seteTag(String eTag) {
		this.eTag = eTag;
	}

	public String getLalTaskId() {
		return lalTaskId;
	}

	public void setLalTaskId(String lalTaskId) {
		this.lalTaskId = lalTaskId;
	}

	public String getApplicantName() {
		return applicantName;
	}


	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}


	public String getApplicationNumber() {
		return applicationNumber;
	}


	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}


	public String getDossierNumber() {
		return dossierNumber;
	}


	public void setDossierNumber(String dossierNumber) {
		this.dossierNumber = dossierNumber;
	}


	public boolean isDossierIsRead() {
		return dossierIsRead;
	}


	public void setDossierIsRead(boolean dossierIsRead) {
		this.dossierIsRead = dossierIsRead;
	}


	public String getDossierType() {
		return dossierType;
	}


	public void setDossierType(String dossierType) {
		this.dossierType = dossierType;
	}


	public String getDossierPhase() {
		return dossierPhase;
	}


	public void setDossierPhase(String dossierPhase) {
		this.dossierPhase = dossierPhase;
	}


	public String getDossierPhaseLabel() {
		return dossierPhaseLabel;
	}


	public void setDossierPhaseLabel(String dossierPhaseLabel) {
		this.dossierPhaseLabel = dossierPhaseLabel;
	}


	public String getLeadClass() {
		return leadClass;
	}


	public void setLeadClass(String leadClass) {
		this.leadClass = leadClass;
	}


	public int getPriority() {
		return priority;
	}


	public void setPriority(int priority) {
		this.priority = priority;
	}


	public String getProceduralLanguage() {
		return proceduralLanguage;
	}


	public void setProceduralLanguage(String proceduralLanguage) {
		this.proceduralLanguage = proceduralLanguage;
	}


	public String getRanking() {
		return ranking;
	}


	public void setRanking(String ranking) {
		this.ranking = ranking;
	}


	public String getTechnicalAcceptanceType() {
		return technicalAcceptanceType;
	}


	public void setTechnicalAcceptanceType(String technicalAcceptanceType) {
		this.technicalAcceptanceType = technicalAcceptanceType;
	}


	public boolean isTechnicalAccepted() {
		return technicalAccepted;
	}


	public void setTechnicalAccepted(boolean technicalAccepted) {
		this.technicalAccepted = technicalAccepted;
	}


	public String getTitleOfInvention() {
		return titleOfInvention;
	}


	public void setTitleOfInvention(String titleOfInvention) {
		this.titleOfInvention = titleOfInvention;
	}


	public String getWoIndicator() {
		return woIndicator;
	}


	public void setWoIndicator(String woIndicator) {
		this.woIndicator = woIndicator;
	}


	public String getTaskStatusCode() {
		return taskStatusCode;
	}


	public void setTaskStatusCode(String taskStatusCode) {
		this.taskStatusCode = taskStatusCode;
	}


	public String getTaskName() {
		return taskName;
	}


	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}


	public String getWorkflowStatus() {
		return workflowStatus;
	}


	public void setWorkflowStatus(String workflowStatus) {
		this.workflowStatus = workflowStatus;
	}


	public String getWorkflowStatusCode() {
		return workflowStatusCode;
	}


	public void setWorkflowStatusCode(String workflowStatusCode) {
		this.workflowStatusCode = workflowStatusCode;
	}


	public int getTargetMonth() {
		return targetMonth;
	}


	public void setTargetMonth(int targetMonth) {
		this.targetMonth = targetMonth;
	}


	public String getTargetMonthColor() {
		return targetMonthColor;
	}


	public void setTargetMonthColor(String targetMonthColor) {
		this.targetMonthColor = targetMonthColor;
	}


	public int getCaseId() {
		return caseId;
	}


	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}


	public Date getLeadDate() {
		return leadDate;
	}


	public void setLeadDate(Date leadDate) {
		this.leadDate = leadDate;
	}


	public String getLeadDateType() {
		return leadDateType;
	}


	public void setLeadDateType(String leadDateType) {
		this.leadDateType = leadDateType;
	}


	public String getLeadDateColor() {
		return leadDateColor;
	}


	public void setLeadDateColor(String leadDateColor) {
		this.leadDateColor = leadDateColor;
	}


	public List<Sticker> getDossierIndicators() {
		return dossierIndicators;
	}


	public void setDossierIndicators(List<Sticker> dossierIndicators) {
		this.dossierIndicators = dossierIndicators;
	}


	public String getFirstExaminer() {
		return firstExaminer;
	}


	public void setFirstExaminer(String firstExaminer) {
		this.firstExaminer = firstExaminer;
	}


	public String getSecondExaminer() {
		return secondExaminer;
	}


	public void setSecondExaminer(String secondExaminer) {
		this.secondExaminer = secondExaminer;
	}


	public String getChairman() {
		return chairman;
	}


	public void setChairman(String chairman) {
		this.chairman = chairman;
	}


	public String getProposedFirstExaminer() {
		return proposedFirstExaminer;
	}


	public void setProposedFirstExaminer(String proposedFirstExaminer) {
		this.proposedFirstExaminer = proposedFirstExaminer;
	}


	public boolean iseDossier() {
		return eDossier;
	}


	public void seteDossier(boolean eDossier) {
		this.eDossier = eDossier;
	}


	public boolean isBlocked() {
		return blocked;
	}


	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}


	public String getSynchronizationStatus() {
		return synchronizationStatus;
	}


	public void setSynchronizationStatus(String synchronizationStatus) {
		this.synchronizationStatus = synchronizationStatus;
	}


	public boolean isShowAllocationTimeLimit() {
		return showAllocationTimeLimit;
	}


	public void setShowAllocationTimeLimit(boolean showAllocationTimeLimit) {
		this.showAllocationTimeLimit = showAllocationTimeLimit;
	}


	public boolean isShowTATimeLimit() {
		return showTATimeLimit;
	}


	public void setShowTATimeLimit(boolean showTATimeLimit) {
		this.showTATimeLimit = showTATimeLimit;
	}


	public boolean isShowLeadLimitDate() {
		return showLeadLimitDate;
	}


	public void setShowLeadLimitDate(boolean showLeadLimitDate) {
		this.showLeadLimitDate = showLeadLimitDate;
	}


	public String getAllocTimeLimitStatus() {
		return allocTimeLimitStatus;
	}


	public void setAllocTimeLimitStatus(String allocTimeLimitStatus) {
		this.allocTimeLimitStatus = allocTimeLimitStatus;
	}


	public Date getAllocStatusDateTime() {
		return allocStatusDateTime;
	}


	public void setAllocStatusDateTime(Date allocStatusDateTime) {
		this.allocStatusDateTime = allocStatusDateTime;
	}


	public Date getAllocCreatedDateTime() {
		return allocCreatedDateTime;
	}


	public void setAllocCreatedDateTime(Date allocCreatedDateTime) {
		this.allocCreatedDateTime = allocCreatedDateTime;
	}


	public Date getAllocCreatedDate() {
		return allocCreatedDate;
	}


	public void setAllocCreatedDate(Date allocCreatedDate) {
		this.allocCreatedDate = allocCreatedDate;
	}


	public Date getAllocExpirationDate() {
		return allocExpirationDate;
	}


	public void setAllocExpirationDate(Date allocExpirationDate) {
		this.allocExpirationDate = allocExpirationDate;
	}


	public String getAllocExpirationDateColor() {
		return allocExpirationDateColor;
	}


	public void setAllocExpirationDateColor(String allocExpirationDateColor) {
		this.allocExpirationDateColor = allocExpirationDateColor;
	}


	public Date getAllocSignalDate() {
		return allocSignalDate;
	}


	public void setAllocSignalDate(Date allocSignalDate) {
		this.allocSignalDate = allocSignalDate;
	}


	public Date getAllocChangeDateTime() {
		return allocChangeDateTime;
	}


	public void setAllocChangeDateTime(Date allocChangeDateTime) {
		this.allocChangeDateTime = allocChangeDateTime;
	}


	public String getAllocLimitDateType() {
		return allocLimitDateType;
	}


	public void setAllocLimitDateType(String allocLimitDateType) {
		this.allocLimitDateType = allocLimitDateType;
	}


	public String getAllocTaskProgress() {
		return allocTaskProgress;
	}


	public void setAllocTaskProgress(String allocTaskProgress) {
		this.allocTaskProgress = allocTaskProgress;
	}


	public String getAllocTimeLimitType() {
		return allocTimeLimitType;
	}


	public void setAllocTimeLimitType(String allocTimeLimitType) {
		this.allocTimeLimitType = allocTimeLimitType;
	}


	public String getAllocTimeLimitTypeCode() {
		return allocTimeLimitTypeCode;
	}


	public void setAllocTimeLimitTypeCode(String allocTimeLimitTypeCode) {
		this.allocTimeLimitTypeCode = allocTimeLimitTypeCode;
	}


	public String getTechTimeLimitStatus() {
		return techTimeLimitStatus;
	}


	public void setTechTimeLimitStatus(String techTimeLimitStatus) {
		this.techTimeLimitStatus = techTimeLimitStatus;
	}


	public Date getTechStatusDateTime() {
		return techStatusDateTime;
	}


	public void setTechStatusDateTime(Date techStatusDateTime) {
		this.techStatusDateTime = techStatusDateTime;
	}


	public Date getTechCreatedDateTime() {
		return techCreatedDateTime;
	}


	public void setTechCreatedDateTime(Date techCreatedDateTime) {
		this.techCreatedDateTime = techCreatedDateTime;
	}


	public Date getTechCreatedDate() {
		return techCreatedDate;
	}


	public void setTechCreatedDate(Date techCreatedDate) {
		this.techCreatedDate = techCreatedDate;
	}


	public Date getTechExpirationDate() {
		return techExpirationDate;
	}


	public void setTechExpirationDate(Date techExpirationDate) {
		this.techExpirationDate = techExpirationDate;
	}


	public String getTechExpirationDateColor() {
		return techExpirationDateColor;
	}


	public void setTechExpirationDateColor(String techExpirationDateColor) {
		this.techExpirationDateColor = techExpirationDateColor;
	}


	public Date getTechSignalDate() {
		return techSignalDate;
	}


	public void setTechSignalDate(Date techSignalDate) {
		this.techSignalDate = techSignalDate;
	}


	public Date getTechChangeDateTime() {
		return techChangeDateTime;
	}


	public void setTechChangeDateTime(Date techChangeDateTime) {
		this.techChangeDateTime = techChangeDateTime;
	}


	public String getTechLimitDateType() {
		return techLimitDateType;
	}


	public void setTechLimitDateType(String techLimitDateType) {
		this.techLimitDateType = techLimitDateType;
	}


	public String getTechTaskProgress() {
		return techTaskProgress;
	}


	public void setTechTaskProgress(String techTaskProgress) {
		this.techTaskProgress = techTaskProgress;
	}


	public String getTechTimeLimitType() {
		return techTimeLimitType;
	}


	public void setTechTimeLimitType(String techTimeLimitType) {
		this.techTimeLimitType = techTimeLimitType;
	}


	public String getTechTimeLimitTypeCode() {
		return techTimeLimitTypeCode;
	}


	public void setTechTimeLimitTypeCode(String techTimeLimitTypeCode) {
		this.techTimeLimitTypeCode = techTimeLimitTypeCode;
	}


	public String getDateActionPerformed() {
		return dateActionPerformed;
	}


	public void setDateActionPerformed(String dateActionPerformed) {
		this.dateActionPerformed = dateActionPerformed;
	}


	public String getActionPerformed() {
		return actionPerformed;
	}


	public void setActionPerformed(String actionPerformed) {
		this.actionPerformed = actionPerformed;
	}


	public int getNumberOfPages() {
		return numberOfPages;
	}


	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}


	public int getNumberOfClaims() {
		return numberOfClaims;
	}


	public void setNumberOfClaims(int numberOfClaims) {
		this.numberOfClaims = numberOfClaims;
	}


	public String getFirstExaminerFullName() {
		return firstExaminerFullName;
	}


	public void setFirstExaminerFullName(String firstExaminerFullName) {
		this.firstExaminerFullName = firstExaminerFullName;
	}


	public String getSecondExaminerFullName() {
		return secondExaminerFullName;
	}


	public void setSecondExaminerFullName(String secondExaminerFullName) {
		this.secondExaminerFullName = secondExaminerFullName;
	}


	public String getChairmanFullName() {
		return chairmanFullName;
	}


	public void setChairmanFullName(String chairmanFullName) {
		this.chairmanFullName = chairmanFullName;
	}


	public String getProposed1stExaminerFullName() {
		return proposed1stExaminerFullName;
	}


	public void setProposed1stExaminerFullName(String proposed1stExaminerFullName) {
		this.proposed1stExaminerFullName = proposed1stExaminerFullName;
	}


	public boolean isProposedExaminerFromSameDir() {
		return proposedExaminerFromSameDir;
	}


	public void setProposedExaminerFromSameDir(boolean proposedExaminerFromSameDir) {
		this.proposedExaminerFromSameDir = proposedExaminerFromSameDir;
	}


	public Date getDatePreallocated() {
		return datePreallocated;
	}


	public void setDatePreallocated(Date datePreallocated) {
		this.datePreallocated = datePreallocated;
	}


	public String getFullNamePreAllocatedBy() {
		return fullNamePreAllocatedBy;
	}


	public void setFullNamePreAllocatedBy(String fullNamePreAllocatedBy) {
		this.fullNamePreAllocatedBy = fullNamePreAllocatedBy;
	}


	public boolean isPreallocated() {
		return isPreallocated;
	}


	public void setPreallocated(boolean isPreallocated) {
		this.isPreallocated = isPreallocated;
	}


	public String getMarkedForInspection() {
		return markedForInspection;
	}


	public void setMarkedForInspection(String markedForInspection) {
		this.markedForInspection = markedForInspection;
	}


	public Date getDateMarked() {
		return dateMarked;
	}


	public void setDateMarked(Date dateMarked) {
		this.dateMarked = dateMarked;
	}


	public String getMarkedBy() {
		return markedBy;
	}


	public void setMarkedBy(String markedBy) {
		this.markedBy = markedBy;
	}


	public String getMarkedByFullName() {
		return markedByFullName;
	}


	public void setMarkedByFullName(String markedByFullName) {
		this.markedByFullName = markedByFullName;
	}


	public boolean isAssociatedFilingsPresent() {
		return isAssociatedFilingsPresent;
	}


	public void setAssociatedFilingsPresent(boolean isAssociatedFilingsPresent) {
		this.isAssociatedFilingsPresent = isAssociatedFilingsPresent;
	}


	public String getRoleNameId() {
		return roleNameId;
	}


	public void setRoleNameId(String roleNameId) {
		this.roleNameId = roleNameId;
	}


	public Date getDateTimeMarked() {
		return dateTimeMarked;
	}


	public void setDateTimeMarked(Date dateTimeMarked) {
		this.dateTimeMarked = dateTimeMarked;
	}


	public String getInspectionComment() {
		return inspectionComment;
	}


	public void setInspectionComment(String inspectionComment) {
		this.inspectionComment = inspectionComment;
	}
}
