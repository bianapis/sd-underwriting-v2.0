package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecordUnderwritingGuidelines
 */
public class CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecordUnderwritingGuidelines   {
  private String requiredCustomerEmploymentHistoryDetails = null;

  private String requiredCustomerDebtAssetStatement = null;

  private String requiredCustomerCreditAssessment = null;

  private String requiredCollateralCoverage = null;

  private String requiredCustomerProductServicePaymentHistory = null;

  private String requiredCustomerDocuments = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Outlines the employment details required 
   * @return requiredCustomerEmploymentHistoryDetails
  **/

  public String getRequiredCustomerEmploymentHistoryDetails() {
    return requiredCustomerEmploymentHistoryDetails;
  }

  public void setRequiredCustomerEmploymentHistoryDetails(String requiredCustomerEmploymentHistoryDetails) {
    this.requiredCustomerEmploymentHistoryDetails = requiredCustomerEmploymentHistoryDetails;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Outlines the type of debt/asset details required 
   * @return requiredCustomerDebtAssetStatement
  **/

  public String getRequiredCustomerDebtAssetStatement() {
    return requiredCustomerDebtAssetStatement;
  }

  public void setRequiredCustomerDebtAssetStatement(String requiredCustomerDebtAssetStatement) {
    this.requiredCustomerDebtAssetStatement = requiredCustomerDebtAssetStatement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Outlines the required credit assessment details required 
   * @return requiredCustomerCreditAssessment
  **/

  public String getRequiredCustomerCreditAssessment() {
    return requiredCustomerCreditAssessment;
  }

  public void setRequiredCustomerCreditAssessment(String requiredCustomerCreditAssessment) {
    this.requiredCustomerCreditAssessment = requiredCustomerCreditAssessment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Outlines the details of collateral required 
   * @return requiredCollateralCoverage
  **/

  public String getRequiredCollateralCoverage() {
    return requiredCollateralCoverage;
  }

  public void setRequiredCollateralCoverage(String requiredCollateralCoverage) {
    this.requiredCollateralCoverage = requiredCollateralCoverage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Outlines the extent of the product usage history required 
   * @return requiredCustomerProductServicePaymentHistory
  **/

  public String getRequiredCustomerProductServicePaymentHistory() {
    return requiredCustomerProductServicePaymentHistory;
  }

  public void setRequiredCustomerProductServicePaymentHistory(String requiredCustomerProductServicePaymentHistory) {
    this.requiredCustomerProductServicePaymentHistory = requiredCustomerProductServicePaymentHistory;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Lists required documentation (e.g. for proof of identity, assets, collateral) 
   * @return requiredCustomerDocuments
  **/

  public String getRequiredCustomerDocuments() {
    return requiredCustomerDocuments;
  }

  public void setRequiredCustomerDocuments(String requiredCustomerDocuments) {
    this.requiredCustomerDocuments = requiredCustomerDocuments;
  }


}

