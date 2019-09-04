package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecordUnderwritingGuidelines;
import org.bian.dto.CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceRecord
 */
public class CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceRecord   {
  private CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecordUnderwritingGuidelines underwritingGuidelines = null;

  private CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails proposedTransactionDetails = null;

  private String underwritingAssessmentDecision = null;

  private String underwritingAssessmentWorkProduct = null;


  /**
   * Get underwritingGuidelines
   * @return underwritingGuidelines
  **/

  public CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecordUnderwritingGuidelines getUnderwritingGuidelines() {
    return underwritingGuidelines;
  }

  public void setUnderwritingGuidelines(CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecordUnderwritingGuidelines underwritingGuidelines) {
    this.underwritingGuidelines = underwritingGuidelines;
  }


  /**
   * Get proposedTransactionDetails
   * @return proposedTransactionDetails
  **/

  public CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails getProposedTransactionDetails() {
    return proposedTransactionDetails;
  }

  public void setProposedTransactionDetails(CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails proposedTransactionDetails) {
    this.proposedTransactionDetails = proposedTransactionDetails;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the underwriting decision 
   * @return underwritingAssessmentDecision
  **/

  public String getUnderwritingAssessmentDecision() {
    return underwritingAssessmentDecision;
  }

  public void setUnderwritingAssessmentDecision(String underwritingAssessmentDecision) {
    this.underwritingAssessmentDecision = underwritingAssessmentDecision;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the task 
   * @return underwritingAssessmentWorkProduct
  **/

  public String getUnderwritingAssessmentWorkProduct() {
    return underwritingAssessmentWorkProduct;
  }

  public void setUnderwritingAssessmentWorkProduct(String underwritingAssessmentWorkProduct) {
    this.underwritingAssessmentWorkProduct = underwritingAssessmentWorkProduct;
  }


}

