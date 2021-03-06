package com.opl.retail.api.model.loans.teaser.primaryview;

import java.util.List;

import com.opl.retail.api.model.loans.AchievementDetailRequest;
import com.opl.retail.api.model.loans.CreditRatingOrganizationDetailResponse;
import com.opl.retail.api.model.loans.DirectorBackgroundDetailResponse;
import com.opl.retail.api.model.loans.ExistingProductDetailRequest;
import com.opl.retail.api.model.loans.FinanceMeansDetailResponse;
import com.opl.retail.api.model.loans.FinancialArrangementsDetailResponse;
import com.opl.retail.api.model.loans.FutureFinancialEstimatesDetailRequest;
import com.opl.retail.api.model.loans.OwnershipDetailResponse;
import com.opl.retail.api.model.loans.PromotorBackgroundDetailResponse;
import com.opl.retail.api.model.loans.ProposedProductDetailRequest;
import com.opl.retail.api.model.loans.SecurityCorporateDetailRequest;
import com.opl.retail.api.model.loans.TotalCostOfProjectResponse;
import com.opl.retail.api.model.loans.retail.PastFinancialEstimatesDetailRequest;
import com.opl.retail.api.model.loans.retail.ReferenceRetailDetailsRequest;

public class TermLoanPrimaryViewResponse {

	private String organisationName;
	private String aboutUs;
	private String panNo;
	private String websiteAddress;
	private String city;
	private String regOfficeCity;
	private String addOfficeCity;
	private String country;
	private String regOfficecountry;
	private String addOfficecountry;
	private String state;
	private String regOfficestate;
	private String addOfficestate;
	private String constitution;
	private String establishmentMonth;
	private Integer establishmentYear;
	private String groupName;
	private String keyVericalFunding;
	private String projectBrief;
	private String currencyDenomination;
	private String LoanType;
	private String dateOfProposal;
	private String isCreditRatingAvailable;
	private Double tenure;
	private Double amount;
	private Double totalCostOfEstimate;
	private List<?> matchesList;
	private Double sharePriceFace;
	private Double sharePriceMarket;
	private String loanAmount;

	private List<ProposedProductDetailRequest> proposedProductDetailRequestList;
	private List<AchievementDetailRequest> AchievementDetailList;
	private List<CreditRatingOrganizationDetailResponse> CreditRatingOrganizationDetailResponse;
	private List<OwnershipDetailResponse> ownershipDetailResponseList;
	private List<PromotorBackgroundDetailResponse> promotorBackgroundDetailResponseList;
	private List<PastFinancialEstimatesDetailRequest> pastFinancialEstimatesDetailRequestList;
	private List<FutureFinancialEstimatesDetailRequest> futureFinancialEstimatesDetailRequestList;
	private List<ExistingProductDetailRequest> existingProductDetailRequestList;
	private List<SecurityCorporateDetailRequest> securityCorporateDetailRequestList;
	private List<FinancialArrangementsDetailResponse> financialArrangementsDetailResponseList;
	private List<DirectorBackgroundDetailResponse> directorBackgroundDetailResponses;
	private List<ReferenceRetailDetailsRequest> referenceRetailDetailsRequests;
	private List<FinanceMeansDetailResponse> financeMeansDetailResponseList;
	private List<TotalCostOfProjectResponse> totalCostOfProjectResponseList;

	private List<?> industrySector;

	private List<Object> brochureList;
	private List<Object> certificateList;
	private List<Object> panCardList;
	private List<Object> profilePic;

	private List<String> shortTermRating;
	private List<String> longTermRating;
	private String gstin;
	private String haveCollateralSecurity;
    private String collateralSecurityAmount;
	
	

	/**
	 * @return the haveCollateralSecurity
	 */
	public String getHaveCollateralSecurity() {
		return haveCollateralSecurity;
	}

	/**
	 * @param haveCollateralSecurity the haveCollateralSecurity to set
	 */
	public void setHaveCollateralSecurity(String haveCollateralSecurity) {
		this.haveCollateralSecurity = haveCollateralSecurity;
	}

	/**
	 * @return the collateralSecurityAmount
	 */
	public String getCollateralSecurityAmount() {
		return collateralSecurityAmount;
	}

	/**
	 * @param collateralSecurityAmount the collateralSecurityAmount to set
	 */
	public void setCollateralSecurityAmount(String collateralSecurityAmount) {
		this.collateralSecurityAmount = collateralSecurityAmount;
	}

	/**
	 * @return the gstin
	 */
	public String getGstin() {
		return gstin;
	}

	/**
	 * @param gstin the gstin to set
	 */
	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public List<?> getIndustrySector() {
		return industrySector;
	}

	public void setIndustrySector(List<?> industrySector) {
		this.industrySector = industrySector;
	}

	public String getOrganisationName() {
		return organisationName;
	}

	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}

	public String getAboutUs() {
		return aboutUs;
	}

	public void setAboutUs(String aboutUs) {
		this.aboutUs = aboutUs;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getWebsiteAddress() {
		return websiteAddress;
	}

	public void setWebsiteAddress(String websiteAddress) {
		this.websiteAddress = websiteAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getConstitution() {
		return constitution;
	}

	public void setConstitution(String constitution) {
		this.constitution = constitution;
	}

	public String getEstablishmentMonth() {
		return establishmentMonth;
	}

	public void setEstablishmentMonth(String establishmentMonth) {
		this.establishmentMonth = establishmentMonth;
	}

	public Integer getEstablishmentYear() {
		return establishmentYear;
	}

	public void setEstablishmentYear(Integer establishmentYear) {
		this.establishmentYear = establishmentYear;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getKeyVericalFunding() {
		return keyVericalFunding;
	}

	public void setKeyVericalFunding(String keyVericalFunding) {
		this.keyVericalFunding = keyVericalFunding;
	}

	public String getProjectBrief() {
		return projectBrief;
	}

	public void setProjectBrief(String projectBrief) {
		this.projectBrief = projectBrief;
	}

	public String getCurrencyDenomination() {
		return currencyDenomination;
	}

	public void setCurrencyDenomination(String currencyDenomination) {
		this.currencyDenomination = currencyDenomination;
	}

	public String getLoanType() {
		return LoanType;
	}

	public void setLoanType(String loanType) {
		LoanType = loanType;
	}

	public String getDateOfProposal() {
		return dateOfProposal;
	}

	public void setDateOfProposal(String dateOfProposal) {
		this.dateOfProposal = dateOfProposal;
	}

	public String getIsCreditRatingAvailable() {
		return isCreditRatingAvailable;
	}

	public void setIsCreditRatingAvailable(String isCreditRatingAvailable) {
		this.isCreditRatingAvailable = isCreditRatingAvailable;
	}

	public List<ProposedProductDetailRequest> getProposedProductDetailRequestList() {
		return proposedProductDetailRequestList;
	}

	public void setProposedProductDetailRequestList(
			List<ProposedProductDetailRequest> proposedProductDetailRequestList) {
		this.proposedProductDetailRequestList = proposedProductDetailRequestList;
	}

	public List<AchievementDetailRequest> getAchievementDetailList() {
		return AchievementDetailList;
	}

	public void setAchievementDetailList(List<AchievementDetailRequest> achievementDetailList) {
		AchievementDetailList = achievementDetailList;
	}

	public List<CreditRatingOrganizationDetailResponse> getCreditRatingOrganizationDetailResponse() {
		return CreditRatingOrganizationDetailResponse;
	}

	public void setCreditRatingOrganizationDetailResponse(
			List<CreditRatingOrganizationDetailResponse> creditRatingOrganizationDetailResponse) {
		CreditRatingOrganizationDetailResponse = creditRatingOrganizationDetailResponse;
	}

	public List<OwnershipDetailResponse> getOwnershipDetailResponseList() {
		return ownershipDetailResponseList;
	}

	public void setOwnershipDetailResponseList(List<OwnershipDetailResponse> ownershipDetailResponseList) {
		this.ownershipDetailResponseList = ownershipDetailResponseList;
	}

	public List<PromotorBackgroundDetailResponse> getPromotorBackgroundDetailResponseList() {
		return promotorBackgroundDetailResponseList;
	}

	public void setPromotorBackgroundDetailResponseList(
			List<PromotorBackgroundDetailResponse> promotorBackgroundDetailResponseList) {
		this.promotorBackgroundDetailResponseList = promotorBackgroundDetailResponseList;
	}

	public List<PastFinancialEstimatesDetailRequest> getPastFinancialEstimatesDetailRequestList() {
		return pastFinancialEstimatesDetailRequestList;
	}

	public void setPastFinancialEstimatesDetailRequestList(
			List<PastFinancialEstimatesDetailRequest> pastFinancialEstimatesDetailRequestList) {
		this.pastFinancialEstimatesDetailRequestList = pastFinancialEstimatesDetailRequestList;
	}

	public List<FutureFinancialEstimatesDetailRequest> getFutureFinancialEstimatesDetailRequestList() {
		return futureFinancialEstimatesDetailRequestList;
	}

	public void setFutureFinancialEstimatesDetailRequestList(
			List<FutureFinancialEstimatesDetailRequest> futureFinancialEstimatesDetailRequestList) {
		this.futureFinancialEstimatesDetailRequestList = futureFinancialEstimatesDetailRequestList;
	}

	public List<ExistingProductDetailRequest> getExistingProductDetailRequestList() {
		return existingProductDetailRequestList;
	}

	public void setExistingProductDetailRequestList(
			List<ExistingProductDetailRequest> existingProductDetailRequestList) {
		this.existingProductDetailRequestList = existingProductDetailRequestList;
	}

	public List<SecurityCorporateDetailRequest> getSecurityCorporateDetailRequestList() {
		return securityCorporateDetailRequestList;
	}

	public void setSecurityCorporateDetailRequestList(
			List<SecurityCorporateDetailRequest> securityCorporateDetailRequestList) {
		this.securityCorporateDetailRequestList = securityCorporateDetailRequestList;
	}

	public List<FinancialArrangementsDetailResponse> getFinancialArrangementsDetailResponseList() {
		return financialArrangementsDetailResponseList;
	}

	public void setFinancialArrangementsDetailResponseList(
			List<FinancialArrangementsDetailResponse> financialArrangementsDetailResponseList) {
		this.financialArrangementsDetailResponseList = financialArrangementsDetailResponseList;
	}

	public List<Object> getBrochureList() {
		return brochureList;
	}

	public void setBrochureList(List<Object> brochureList) {
		this.brochureList = brochureList;
	}

	public List<Object> getCertificateList() {
		return certificateList;
	}

	public void setCertificateList(List<Object> certificateList) {
		this.certificateList = certificateList;
	}

	public List<Object> getPanCardList() {
		return panCardList;
	}

	public void setPanCardList(List<Object> panCardList) {
		this.panCardList = panCardList;
	}

	public List<Object> getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(List<Object> profilePic) {
		this.profilePic = profilePic;
	}

	public Double getTenure() {
		return tenure;
	}

	public void setTenure(Double tenure) {
		this.tenure = tenure;
	}

	public List<FinanceMeansDetailResponse> getFinanceMeansDetailResponseList() {
		return financeMeansDetailResponseList;
	}

	public void setFinanceMeansDetailResponseList(List<FinanceMeansDetailResponse> financeMeansDetailResponseList) {
		this.financeMeansDetailResponseList = financeMeansDetailResponseList;
	}

	public List<TotalCostOfProjectResponse> getTotalCostOfProjectResponseList() {
		return totalCostOfProjectResponseList;
	}

	public void setTotalCostOfProjectResponseList(List<TotalCostOfProjectResponse> totalCostOfProjectResponseList) {
		this.totalCostOfProjectResponseList = totalCostOfProjectResponseList;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public List<String> getShortTermRating() {
		return shortTermRating;
	}

	public void setShortTermRating(List<String> shortTermRating) {
		this.shortTermRating = shortTermRating;
	}

	public List<String> getLongTermRating() {
		return longTermRating;
	}

	public void setLongTermRating(List<String> longTermRating) {
		this.longTermRating = longTermRating;
	}

	public List<?> getMatchesList() {
		return matchesList;
	}

	public void setMatchesList(List<?> matchesList) {
		this.matchesList = matchesList;
	}

	public Double getTotalCostOfEstimate() {
		return totalCostOfEstimate;
	}

	public void setTotalCostOfEstimate(Double totalCostOfEstimate) {
		this.totalCostOfEstimate = totalCostOfEstimate;
	}

	public String getRegOfficeCity() {
		return regOfficeCity;
	}

	public void setRegOfficeCity(String regOfficeCity) {
		this.regOfficeCity = regOfficeCity;
	}

	public String getAddOfficeCity() {
		return addOfficeCity;
	}

	public void setAddOfficeCity(String addOfficeCity) {
		this.addOfficeCity = addOfficeCity;
	}

	public String getRegOfficecountry() {
		return regOfficecountry;
	}

	public void setRegOfficecountry(String regOfficecountry) {
		this.regOfficecountry = regOfficecountry;
	}

	public String getAddOfficecountry() {
		return addOfficecountry;
	}

	public void setAddOfficecountry(String addOfficecountry) {
		this.addOfficecountry = addOfficecountry;
	}

	public String getRegOfficestate() {
		return regOfficestate;
	}

	public void setRegOfficestate(String regOfficestate) {
		this.regOfficestate = regOfficestate;
	}

	public String getAddOfficestate() {
		return addOfficestate;
	}

	public void setAddOfficestate(String addOfficestate) {
		this.addOfficestate = addOfficestate;
	}

	public List<DirectorBackgroundDetailResponse> getDirectorBackgroundDetailResponses() {
		return directorBackgroundDetailResponses;
	}

	public void setDirectorBackgroundDetailResponses(
			List<DirectorBackgroundDetailResponse> directorBackgroundDetailResponses) {
		this.directorBackgroundDetailResponses = directorBackgroundDetailResponses;
	}

	public Double getSharePriceFace() {
		return sharePriceFace;
	}

	public void setSharePriceFace(Double sharePriceFace) {
		this.sharePriceFace = sharePriceFace;
	}

	public Double getSharePriceMarket() {
		return sharePriceMarket;
	}

	public void setSharePriceMarket(Double sharePriceMarket) {
		this.sharePriceMarket = sharePriceMarket;
	}

	public List<ReferenceRetailDetailsRequest> getReferenceRetailDetailsRequests() {
		return referenceRetailDetailsRequests;
	}

	public void setReferenceRetailDetailsRequests(List<ReferenceRetailDetailsRequest> referenceRetailDetailsRequests) {
		this.referenceRetailDetailsRequests = referenceRetailDetailsRequests;
	}

	public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
}
