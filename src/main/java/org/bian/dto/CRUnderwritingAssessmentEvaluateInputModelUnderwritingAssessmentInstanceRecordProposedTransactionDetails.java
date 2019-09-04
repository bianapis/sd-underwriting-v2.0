package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentEvaluateInputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails
 */
public class CRUnderwritingAssessmentEvaluateInputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails   {
  private String productInstanceReference = null;

  private String proposedLoanTerms = null;

  private String proposedLoanAmount = null;

  private String loanPurpose = null;

  private String customerReference = null;

  private String customerReferenceDetails = null;

  private String customerProductEligibilityTerms = null;

  private String customerEmploymentHistory = null;

  private String customerIncomeStatement = null;

  private String customerDebtStatement = null;

  private String customerAssetStatement = null;

  private String customerCreditAssessment = null;

  private String customerProductServicePaymentHistory = null;

  private String collateralItemReference = null;

  private String collateralItemType = null;

  private String collateralItemValuation = null;

  private String documentReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The associated product instance for the underwriting decision 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The proposed loan terms 
   * @return proposedLoanTerms
  **/

  public String getProposedLoanTerms() {
    return proposedLoanTerms;
  }

  public void setProposedLoanTerms(String proposedLoanTerms) {
    this.proposedLoanTerms = proposedLoanTerms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The proposed loan amount 
   * @return proposedLoanAmount
  **/

  public String getProposedLoanAmount() {
    return proposedLoanAmount;
  }

  public void setProposedLoanAmount(String proposedLoanAmount) {
    this.proposedLoanAmount = proposedLoanAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The purpose for the loan (e.g. mortgage for primary residence/rental) 
   * @return loanPurpose
  **/

  public String getLoanPurpose() {
    return loanPurpose;
  }

  public void setLoanPurpose(String loanPurpose) {
    this.loanPurpose = loanPurpose;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the applying customer 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference details known about the customer 
   * @return customerReferenceDetails
  **/

  public String getCustomerReferenceDetails() {
    return customerReferenceDetails;
  }

  public void setCustomerReferenceDetails(String customerReferenceDetails) {
    this.customerReferenceDetails = customerReferenceDetails;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the terms under which the customer eligible for the loan 
   * @return customerProductEligibilityTerms
  **/

  public String getCustomerProductEligibilityTerms() {
    return customerProductEligibilityTerms;
  }

  public void setCustomerProductEligibilityTerms(String customerProductEligibilityTerms) {
    this.customerProductEligibilityTerms = customerProductEligibilityTerms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The customer's employment record 
   * @return customerEmploymentHistory
  **/

  public String getCustomerEmploymentHistory() {
    return customerEmploymentHistory;
  }

  public void setCustomerEmploymentHistory(String customerEmploymentHistory) {
    this.customerEmploymentHistory = customerEmploymentHistory;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The customers historical income statement (for individuals) 
   * @return customerIncomeStatement
  **/

  public String getCustomerIncomeStatement() {
    return customerIncomeStatement;
  }

  public void setCustomerIncomeStatement(String customerIncomeStatement) {
    this.customerIncomeStatement = customerIncomeStatement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Covers bank and known non-bank managed debts 
   * @return customerDebtStatement
  **/

  public String getCustomerDebtStatement() {
    return customerDebtStatement;
  }

  public void setCustomerDebtStatement(String customerDebtStatement) {
    this.customerDebtStatement = customerDebtStatement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Covers bank and known non-bank managed assets 
   * @return customerAssetStatement
  **/

  public String getCustomerAssetStatement() {
    return customerAssetStatement;
  }

  public void setCustomerAssetStatement(String customerAssetStatement) {
    this.customerAssetStatement = customerAssetStatement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the bank's credit assessment of the customer 
   * @return customerCreditAssessment
  **/

  public String getCustomerCreditAssessment() {
    return customerCreditAssessment;
  }

  public void setCustomerCreditAssessment(String customerCreditAssessment) {
    this.customerCreditAssessment = customerCreditAssessment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to product reports covering payment history 
   * @return customerProductServicePaymentHistory
  **/

  public String getCustomerProductServicePaymentHistory() {
    return customerProductServicePaymentHistory;
  }

  public void setCustomerProductServicePaymentHistory(String customerProductServicePaymentHistory) {
    this.customerProductServicePaymentHistory = customerProductServicePaymentHistory;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customers collateral holdings that are available 
   * @return collateralItemReference
  **/

  public String getCollateralItemReference() {
    return collateralItemReference;
  }

  public void setCollateralItemReference(String collateralItemReference) {
    this.collateralItemReference = collateralItemReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of collateral 
   * @return collateralItemType
  **/

  public String getCollateralItemType() {
    return collateralItemType;
  }

  public void setCollateralItemType(String collateralItemType) {
    this.collateralItemType = collateralItemType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The valuation of the collateral (applying the required loan to asset ratio) 
   * @return collateralItemValuation
  **/

  public String getCollateralItemValuation() {
    return collateralItemValuation;
  }

  public void setCollateralItemValuation(String collateralItemValuation) {
    this.collateralItemValuation = collateralItemValuation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated documents of significance 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


}

