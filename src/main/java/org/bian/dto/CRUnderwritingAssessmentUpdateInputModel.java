package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRUnderwritingAssessmentUpdateInputModelUnderwritingAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentUpdateInputModel
 */
public class CRUnderwritingAssessmentUpdateInputModel   {
  private String underwritingServicingSessionReference = null;

  private String underwritingAssessmentInstanceReference = null;

  private CRUnderwritingAssessmentUpdateInputModelUnderwritingAssessmentInstanceRecord underwritingAssessmentInstanceRecord = null;

  private Object underwritingAssessmentUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get underwritingAssessmentInstanceRecord
   * @return underwritingAssessmentInstanceRecord
  **/

  public CRUnderwritingAssessmentUpdateInputModelUnderwritingAssessmentInstanceRecord getUnderwritingAssessmentInstanceRecord() {
    return underwritingAssessmentInstanceRecord;
  }

  public void setUnderwritingAssessmentInstanceRecord(CRUnderwritingAssessmentUpdateInputModelUnderwritingAssessmentInstanceRecord underwritingAssessmentInstanceRecord) {
    this.underwritingAssessmentInstanceRecord = underwritingAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return underwritingAssessmentUpdateActionTaskRecord
  **/

  public Object getUnderwritingAssessmentUpdateActionTaskRecord() {
    return underwritingAssessmentUpdateActionTaskRecord;
  }

  public void setUnderwritingAssessmentUpdateActionTaskRecord(Object underwritingAssessmentUpdateActionTaskRecord) {
    this.underwritingAssessmentUpdateActionTaskRecord = underwritingAssessmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

