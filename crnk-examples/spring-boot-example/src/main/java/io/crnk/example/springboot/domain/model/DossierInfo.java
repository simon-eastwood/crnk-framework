
package io.crnk.example.springboot.domain.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.core.resource.annotations.JsonApiToMany;
import io.crnk.core.resource.annotations.JsonApiToOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;



@JsonApiResource(type = "dossierinfo")
public class DossierInfo {

	@JsonApiId
	private String applicationNumberId; // the applicationNUmber is the Id but json-api will always call this "id" in the JSON


	//	public dossierInfoIndicators: Array<DossierInfoIndicator> = [];
	// private  timeLimits: Array<DossierTimeLimit> = [];
//	public events: Array<DossierEvent> = [];
//	public involvements: Array<DossierInvolvement> = [];

	@JsonProperty
	private String applicationNumber; // shadow copy to make mapping in client easier

	// keep a shadow copy of the id
	public String getApplicationNumberId () {
		return applicationNumberId;
	}

	public void setApplicationNumberId (String applicationNumber) {
		this.applicationNumberId = applicationNumber;
		this.applicationNumber = applicationNumber;
	}


	@JsonApiToOne(opposite = "dossierInfo")
	private Dossier dossier;



	@JsonProperty
	private String lalTaskId;
	@JsonProperty
	private String dossierNumber;
	@JsonProperty
	private String dossierPhase;
	@JsonProperty
	private String dossierPhaseLabel;
	@JsonProperty
	private String doublureIndicator;
	@JsonProperty
	private String filingLanguage;
	@JsonProperty
	private String leadClass;
	@JsonProperty
	private String leadDate;
	@JsonProperty
	private String leadDateType;

	@JsonProperty
	private String leadDateState; // actually an enum, but hopefully this is good enough for stubs


	@JsonProperty
	private String priority;

	@JsonProperty
	private String proceduralLanguage;
	@JsonProperty
	private String procedureType;
	@JsonProperty
	private String procedureLabel;
	@JsonProperty
	private String ranking;
	@JsonProperty
	private Date receivingDate;
	@JsonProperty
	private int targetMonth;
	@JsonProperty
	private String targetMonthState;  // actually TimeLimitState;
	@JsonProperty
	private String workflowStatusType;
	@JsonProperty
	private String workflowStatusLabel;
	@JsonProperty
	private String caseId;
	@JsonProperty
	private String taskTypeCode;
	@JsonProperty
	private String taskStatusCode;
	@JsonProperty
	private String taskStatusLabel;
	@JsonProperty
	private String titleOfInvention;
	@JsonProperty
	private String workflowStatusCode;
	@JsonProperty
	private String internalStatus;
	@JsonProperty
	private boolean technicallyAccepted;
	@JsonProperty
	private String technicalAcceptanceType;
	@JsonProperty
	private String director;
	@JsonProperty
	private String directorate;
	@JsonProperty
	private String directorateName;
	@JsonProperty
	private String directorCode;
	@JsonProperty
	private String sisUnit;
	@JsonProperty
	private String sisUnitCode;
	@JsonProperty
	private boolean eDossier;
	@JsonProperty
	private String dossierType;
	@JsonProperty
	private Date dateOfFiling;
	@JsonProperty
	private boolean dossierRead;
	// private stickers: Sticker[] = [];
	@JsonProperty
	private Date a2Limit;
	@JsonProperty
	private int numberOfClaims;

	// Biblio fields:
	@JsonProperty
	private String applicationTitle;
	@JsonProperty
	private String drawingUrl;
	@JsonProperty
	private String applicant;
	@JsonProperty
	private String representative;
	@JsonProperty
	private String leadClassOrigin;
	@JsonProperty
	private String[] familyMemberApplicationNumbers;
	@JsonProperty
	private String[] publicationNumbers; // actually PublicationNumber[];
	@JsonProperty
	private String[] priorityClaims;
	@JsonProperty
	private String[] divisionals;
	@JsonProperty
	private String[] ipcClasses;
	@JsonProperty
	private String[] dossierClasses;

	// private associatedFilings: DossierAssociateFiling[];
	@JsonProperty
	private String[] ipcClassesDescription;
	@JsonProperty
	private String[] dossierClassTypes;
	@JsonProperty
	private Date datePreallocated;
	@JsonProperty
	private String fullNamePreAllocatedBy;
	@JsonProperty
	private boolean isPreallocated;
	@JsonProperty
	private String markedForInspection;
	@JsonProperty
	private String markedBy;
	@JsonProperty
	private String markedByFullName;
	@JsonProperty
	private Date dateMarked;
	@JsonProperty
	private String[] dossierClassOrigin;
	@JsonProperty
	private String inspectionComment;
	@JsonProperty
	private int numberOfPages;
	@JsonProperty
	private Date dateTimeMarked;


	public DossierInfo() {
	}

	public DossierInfo(String aNumber) {
		this.setApplicationNumberId(aNumber);
	}

	public String getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		throw new RuntimeException("cant set shadow id");
	}

	public String getLalTaskId() {
		return lalTaskId;
	}

	public void setLalTaskId(String lalTaskId) {
		this.lalTaskId = lalTaskId;
	}

	public String getDossierNumber() {
		return dossierNumber;
	}

	public void setDossierNumber(String dossierNumber) {
		this.dossierNumber = dossierNumber;
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

	public String getDoublureIndicator() {
		return doublureIndicator;
	}

	public void setDoublureIndicator(String doublureIndicator) {
		this.doublureIndicator = doublureIndicator;
	}

	public String getFilingLanguage() {
		return filingLanguage;
	}

	public void setFilingLanguage(String filingLanguage) {
		this.filingLanguage = filingLanguage;
	}

	public String getLeadClass() {
		return leadClass;
	}

	public void setLeadClass(String leadClass) {
		this.leadClass = leadClass;
	}

	public String getLeadDate() {
		return leadDate;
	}

	public void setLeadDate(String leadDate) {
		this.leadDate = leadDate;
	}

	public String getLeadDateType() {
		return leadDateType;
	}

	public void setLeadDateType(String leadDateType) {
		this.leadDateType = leadDateType;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Date getDateTimeMarked() {
		return dateTimeMarked;
	}

	public void setDateTimeMarked(Date dateTimeMarked) {
		this.dateTimeMarked = dateTimeMarked;
	}

	public String getLeadDateState() {
		return leadDateState;
	}

	public void setLeadDateState(String leadDateState) {
		this.leadDateState = leadDateState;
	}

	public String getProceduralLanguage() {
		return proceduralLanguage;
	}

	public void setProceduralLanguage(String proceduralLanguage) {
		this.proceduralLanguage = proceduralLanguage;
	}

	public String getProcedureType() {
		return procedureType;
	}

	public void setProcedureType(String procedureType) {
		this.procedureType = procedureType;
	}

	public String getProcedureLabel() {
		return procedureLabel;
	}

	public void setProcedureLabel(String procedureLabel) {
		this.procedureLabel = procedureLabel;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	public Date getReceivingDate() {
		return receivingDate;
	}

	public void setReceivingDate(Date receivingDate) {
		this.receivingDate = receivingDate;
	}

	public int getTargetMonth() {
		return targetMonth;
	}

	public void setTargetMonth(int targetMonth) {
		this.targetMonth = targetMonth;
	}

	public String getTargetMonthState() {
		return targetMonthState;
	}

	public void setTargetMonthState(String targetMonthState) {
		this.targetMonthState = targetMonthState;
	}

	public String getWorkflowStatusType() {
		return workflowStatusType;
	}

	public void setWorkflowStatusType(String workflowStatusType) {
		this.workflowStatusType = workflowStatusType;
	}

	public String getWorkflowStatusLabel() {
		return workflowStatusLabel;
	}

	public void setWorkflowStatusLabel(String workflowStatusLabel) {
		this.workflowStatusLabel = workflowStatusLabel;
	}

	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getTaskTypeCode() {
		return taskTypeCode;
	}

	public void setTaskTypeCode(String taskTypeCode) {
		this.taskTypeCode = taskTypeCode;
	}

	public String getTaskStatusCode() {
		return taskStatusCode;
	}

	public void setTaskStatusCode(String taskStatusCode) {
		this.taskStatusCode = taskStatusCode;
	}

	public String getTaskStatusLabel() {
		return taskStatusLabel;
	}

	public void setTaskStatusLabel(String taskStatusLabel) {
		this.taskStatusLabel = taskStatusLabel;
	}

	public String getTitleOfInvention() {
		return titleOfInvention;
	}

	public void setTitleOfInvention(String titleOfInvention) {
		this.titleOfInvention = titleOfInvention;
	}

	public String getWorkflowStatusCode() {
		return workflowStatusCode;
	}

	public void setWorkflowStatusCode(String workflowStatusCode) {
		this.workflowStatusCode = workflowStatusCode;
	}

	public String getInternalStatus() {
		return internalStatus;
	}

	public void setInternalStatus(String internalStatus) {
		this.internalStatus = internalStatus;
	}

	public boolean isTechnicallyAccepted() {
		return technicallyAccepted;
	}

	public void setTechnicallyAccepted(boolean technicallyAccepted) {
		this.technicallyAccepted = technicallyAccepted;
	}

	public String getTechnicalAcceptanceType() {
		return technicalAcceptanceType;
	}

	public void setTechnicalAcceptanceType(String technicalAcceptanceType) {
		this.technicalAcceptanceType = technicalAcceptanceType;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDirectorate() {
		return directorate;
	}

	public void setDirectorate(String directorate) {
		this.directorate = directorate;
	}

	public String getDirectorateName() {
		return directorateName;
	}

	public void setDirectorateName(String directorateName) {
		this.directorateName = directorateName;
	}

	public String getDirectorCode() {
		return directorCode;
	}

	public void setDirectorCode(String directorCode) {
		this.directorCode = directorCode;
	}

	public String getSisUnit() {
		return sisUnit;
	}

	public void setSisUnit(String sisUnit) {
		this.sisUnit = sisUnit;
	}

	public String getSisUnitCode() {
		return sisUnitCode;
	}

	public void setSisUnitCode(String sisUnitCode) {
		this.sisUnitCode = sisUnitCode;
	}

	public boolean iseDossier() {
		return eDossier;
	}

	public void seteDossier(boolean eDossier) {
		this.eDossier = eDossier;
	}

	public String getDossierType() {
		return dossierType;
	}

	public void setDossierType(String dossierType) {
		this.dossierType = dossierType;
	}

	public Date getDateOfFiling() {
		return dateOfFiling;
	}

	public void setDateOfFiling(Date dateOfFiling) {
		this.dateOfFiling = dateOfFiling;
	}

	public boolean isDossierRead() {
		return dossierRead;
	}

	public void setDossierRead(boolean dossierRead) {
		this.dossierRead = dossierRead;
	}

	public Date getA2Limit() {
		return a2Limit;
	}

	public void setA2Limit(Date a2Limit) {
		this.a2Limit = a2Limit;
	}

	public int getNumberOfClaims() {
		return numberOfClaims;
	}

	public void setNumberOfClaims(int numberOfClaims) {
		this.numberOfClaims = numberOfClaims;
	}

	public String getApplicationTitle() {
		return applicationTitle;
	}

	public void setApplicationTitle(String applicationTitle) {
		this.applicationTitle = applicationTitle;
	}

	public String getDrawingUrl() {
		return drawingUrl;
	}

	public void setDrawingUrl(String drawingUrl) {
		this.drawingUrl = drawingUrl;
	}

	public String getApplicant() {
		return applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public String getRepresentative() {
		return representative;
	}

	public void setRepresentative(String representative) {
		this.representative = representative;
	}

	public String getLeadClassOrigin() {
		return leadClassOrigin;
	}

	public void setLeadClassOrigin(String leadClassOrigin) {
		this.leadClassOrigin = leadClassOrigin;
	}

	public String[] getFamilyMemberApplicationNumbers() {
		return familyMemberApplicationNumbers;
	}

	public void setFamilyMemberApplicationNumbers(String[] familyMemberApplicationNumbers) {
		this.familyMemberApplicationNumbers = familyMemberApplicationNumbers;
	}

	public String[] getPublicationNumbers() {
		return publicationNumbers;
	}

	public void setPublicationNumbers(String[] publicationNumbers) {
		this.publicationNumbers = publicationNumbers;
	}

	public String[] getPriorityClaims() {
		return priorityClaims;
	}

	public void setPriorityClaims(String[] priorityClaims) {
		this.priorityClaims = priorityClaims;
	}

	public String[] getDivisionals() {
		return divisionals;
	}

	public void setDivisionals(String[] divisionals) {
		this.divisionals = divisionals;
	}

	public String[] getIpcClasses() {
		return ipcClasses;
	}

	public void setIpcClasses(String[] ipcClasses) {
		this.ipcClasses = ipcClasses;
	}

	public String[] getDossierClasses() {
		return dossierClasses;
	}

	public void setDossierClasses(String[] dossierClasses) {
		this.dossierClasses = dossierClasses;
	}

	public String[] getIpcClassesDescription() {
		return ipcClassesDescription;
	}

	public void setIpcClassesDescription(String[] ipcClassesDescription) {
		this.ipcClassesDescription = ipcClassesDescription;
	}

	public String[] getDossierClassTypes() {
		return dossierClassTypes;
	}

	public void setDossierClassTypes(String[] dossierClassTypes) {
		this.dossierClassTypes = dossierClassTypes;
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

	public Date getDateMarked() {
		return dateMarked;
	}

	public void setDateMarked(Date dateMarked) {
		this.dateMarked = dateMarked;
	}

	public String[] getDossierClassOrigin() {
		return dossierClassOrigin;
	}

	public void setDossierClassOrigin(String[] dossierClassOrigin) {
		this.dossierClassOrigin = dossierClassOrigin;
	}

	public String getInspectionComment() {
		return inspectionComment;
	}

	public void setInspectionComment(String inspectionComment) {
		this.inspectionComment = inspectionComment;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
}
