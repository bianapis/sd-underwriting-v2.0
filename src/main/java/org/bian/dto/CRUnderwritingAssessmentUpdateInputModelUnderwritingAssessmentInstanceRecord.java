package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRUnderwritingAssessmentUpdateInputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentUpdateInputModelUnderwritingAssessmentInstanceRecord
 */
public class CRUnderwritingAssessmentUpdateInputModelUnderwritingAssessmentInstanceRecord   {
  private CRUnderwritingAssessmentUpdateInputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails proposedTransactionDetails = null;


  /**
   * Get proposedTransactionDetails
   * @return proposedTransactionDetails
  **/

  public CRUnderwritingAssessmentUpdateInputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails getProposedTransactionDetails() {
    return proposedTransactionDetails;
  }

  public void setProposedTransactionDetails(CRUnderwritingAssessmentUpdateInputModelUnderwritingAssessmentInstanceRecordProposedTransactionDetails proposedTransactionDetails) {
    this.proposedTransactionDetails = proposedTransactionDetails;
  }


}

