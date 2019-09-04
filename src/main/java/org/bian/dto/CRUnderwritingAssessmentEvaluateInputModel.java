package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRUnderwritingAssessmentEvaluateInputModelUnderwritingAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentEvaluateInputModel
 */
public class CRUnderwritingAssessmentEvaluateInputModel   {
  private String underwritingServicingSessionReference = null;

  private Object underwritingAssessmentEvaluateActionRecord = null;

  private String underwritingAssessmentInstanceStatus = null;

  private CRUnderwritingAssessmentEvaluateInputModelUnderwritingAssessmentInstanceRecord underwritingAssessmentInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return underwritingServicingSessionReference
  **/

  public String getUnderwritingServicingSessionReference() {
    return underwritingServicingSessionReference;
  }

  public void setUnderwritingServicingSessionReference(String underwritingServicingSessionReference) {
    this.underwritingServicingSessionReference = underwritingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return underwritingAssessmentEvaluateActionRecord
  **/

  public Object getUnderwritingAssessmentEvaluateActionRecord() {
    return underwritingAssessmentEvaluateActionRecord;
  }

  public void setUnderwritingAssessmentEvaluateActionRecord(Object underwritingAssessmentEvaluateActionRecord) {
    this.underwritingAssessmentEvaluateActionRecord = underwritingAssessmentEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Underwriting Assessment instance (e.g. initialised, pending, active) 
   * @return underwritingAssessmentInstanceStatus
  **/

  public String getUnderwritingAssessmentInstanceStatus() {
    return underwritingAssessmentInstanceStatus;
  }

  public void setUnderwritingAssessmentInstanceStatus(String underwritingAssessmentInstanceStatus) {
    this.underwritingAssessmentInstanceStatus = underwritingAssessmentInstanceStatus;
  }


  /**
   * Get underwritingAssessmentInstanceRecord
   * @return underwritingAssessmentInstanceRecord
  **/

  public CRUnderwritingAssessmentEvaluateInputModelUnderwritingAssessmentInstanceRecord getUnderwritingAssessmentInstanceRecord() {
    return underwritingAssessmentInstanceRecord;
  }

  public void setUnderwritingAssessmentInstanceRecord(CRUnderwritingAssessmentEvaluateInputModelUnderwritingAssessmentInstanceRecord underwritingAssessmentInstanceRecord) {
    this.underwritingAssessmentInstanceRecord = underwritingAssessmentInstanceRecord;
  }


}

