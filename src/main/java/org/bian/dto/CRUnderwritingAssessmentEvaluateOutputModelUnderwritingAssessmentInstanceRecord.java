package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails;
import org.bian.dto.CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecordUnderwritingGuidelines;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecord
 */
public class CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecord   {
  private CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecordUnderwritingGuidelines underwritingGuidelines = null;

  private CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails proposedTransactionDetails = null;

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

  public CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails getProposedTransactionDetails() {
    return proposedTransactionDetails;
  }

  public void setProposedTransactionDetails(CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails proposedTransactionDetails) {
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

