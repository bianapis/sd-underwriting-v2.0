package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentEvaluateOutputModel
 */
public class CRUnderwritingAssessmentEvaluateOutputModel   {
  private String underwritingAssessmentInstanceReference = null;

  private String underwritingAssessmentEvaluateActionReference = null;

  private Object underwritingAssessmentEvaluateActionRecord = null;

  private String underwritingAssessmentInstanceStatus = null;

  private CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecord underwritingAssessmentInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Underwriting Assessment instance 
   * @return underwritingAssessmentInstanceReference
  **/

  public String getUnderwritingAssessmentInstanceReference() {
    return underwritingAssessmentInstanceReference;
  }

  public void setUnderwritingAssessmentInstanceReference(String underwritingAssessmentInstanceReference) {
    this.underwritingAssessmentInstanceReference = underwritingAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return underwritingAssessmentEvaluateActionReference
  **/

  public String getUnderwritingAssessmentEvaluateActionReference() {
    return underwritingAssessmentEvaluateActionReference;
  }

  public void setUnderwritingAssessmentEvaluateActionReference(String underwritingAssessmentEvaluateActionReference) {
    this.underwritingAssessmentEvaluateActionReference = underwritingAssessmentEvaluateActionReference;
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

  public CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecord getUnderwritingAssessmentInstanceRecord() {
    return underwritingAssessmentInstanceRecord;
  }

  public void setUnderwritingAssessmentInstanceRecord(CRUnderwritingAssessmentEvaluateOutputModelUnderwritingAssessmentInstanceRecord underwritingAssessmentInstanceRecord) {
    this.underwritingAssessmentInstanceRecord = underwritingAssessmentInstanceRecord;
  }


}

