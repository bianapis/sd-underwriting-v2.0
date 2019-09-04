package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRUnderwritingAssessmentExchangeInputModelUnderwritingAssessmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentExchangeInputModel
 */
public class CRUnderwritingAssessmentExchangeInputModel   {
  private String underwritingServicingSessionReference = null;

  private String underwritingAssessmentInstanceReference = null;

  private Object underwritingAssessmentExchangeActionTaskRecord = null;

  private CRUnderwritingAssessmentExchangeInputModelUnderwritingAssessmentExchangeActionRequest underwritingAssessmentExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return underwritingAssessmentExchangeActionTaskRecord
  **/

  public Object getUnderwritingAssessmentExchangeActionTaskRecord() {
    return underwritingAssessmentExchangeActionTaskRecord;
  }

  public void setUnderwritingAssessmentExchangeActionTaskRecord(Object underwritingAssessmentExchangeActionTaskRecord) {
    this.underwritingAssessmentExchangeActionTaskRecord = underwritingAssessmentExchangeActionTaskRecord;
  }


  /**
   * Get underwritingAssessmentExchangeActionRequest
   * @return underwritingAssessmentExchangeActionRequest
  **/

  public CRUnderwritingAssessmentExchangeInputModelUnderwritingAssessmentExchangeActionRequest getUnderwritingAssessmentExchangeActionRequest() {
    return underwritingAssessmentExchangeActionRequest;
  }

  public void setUnderwritingAssessmentExchangeActionRequest(CRUnderwritingAssessmentExchangeInputModelUnderwritingAssessmentExchangeActionRequest underwritingAssessmentExchangeActionRequest) {
    this.underwritingAssessmentExchangeActionRequest = underwritingAssessmentExchangeActionRequest;
  }


}

