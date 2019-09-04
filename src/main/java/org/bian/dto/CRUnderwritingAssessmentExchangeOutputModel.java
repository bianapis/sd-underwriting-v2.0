package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentExchangeOutputModel
 */
public class CRUnderwritingAssessmentExchangeOutputModel   {
  private String underwritingAssessmentExchangeActionTaskReference = null;

  private Object underwritingAssessmentExchangeActionTaskRecord = null;

  private String underwritingAssessmentExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Underwriting Assessment instance exchange service call 
   * @return underwritingAssessmentExchangeActionTaskReference
  **/

  public String getUnderwritingAssessmentExchangeActionTaskReference() {
    return underwritingAssessmentExchangeActionTaskReference;
  }

  public void setUnderwritingAssessmentExchangeActionTaskReference(String underwritingAssessmentExchangeActionTaskReference) {
    this.underwritingAssessmentExchangeActionTaskReference = underwritingAssessmentExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return underwritingAssessmentExchangeActionResponse
  **/

  public String getUnderwritingAssessmentExchangeActionResponse() {
    return underwritingAssessmentExchangeActionResponse;
  }

  public void setUnderwritingAssessmentExchangeActionResponse(String underwritingAssessmentExchangeActionResponse) {
    this.underwritingAssessmentExchangeActionResponse = underwritingAssessmentExchangeActionResponse;
  }


}

