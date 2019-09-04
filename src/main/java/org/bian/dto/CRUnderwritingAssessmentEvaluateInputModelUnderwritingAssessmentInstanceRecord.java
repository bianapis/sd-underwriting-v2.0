package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRUnderwritingAssessmentEvaluateInputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentEvaluateInputModelUnderwritingAssessmentInstanceRecord
 */
public class CRUnderwritingAssessmentEvaluateInputModelUnderwritingAssessmentInstanceRecord   {
  private CRUnderwritingAssessmentEvaluateInputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails proposedTransactionDetails = null;


  /**
   * Get proposedTransactionDetails
   * @return proposedTransactionDetails
  **/

  public CRUnderwritingAssessmentEvaluateInputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails getProposedTransactionDetails() {
    return proposedTransactionDetails;
  }

  public void setProposedTransactionDetails(CRUnderwritingAssessmentEvaluateInputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails proposedTransactionDetails) {
    this.proposedTransactionDetails = proposedTransactionDetails;
  }


}

