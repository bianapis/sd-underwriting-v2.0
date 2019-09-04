package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentRequestOutputModel
 */
public class CRUnderwritingAssessmentRequestOutputModel   {
  private String underwritingAssessmentRequestActionTaskReference = null;

  private Object underwritingAssessmentRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Underwriting Assessment instance request service call 
   * @return underwritingAssessmentRequestActionTaskReference
  **/

  public String getUnderwritingAssessmentRequestActionTaskReference() {
    return underwritingAssessmentRequestActionTaskReference;
  }

  public void setUnderwritingAssessmentRequestActionTaskReference(String underwritingAssessmentRequestActionTaskReference) {
    this.underwritingAssessmentRequestActionTaskReference = underwritingAssessmentRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return underwritingAssessmentRequestActionTaskRecord
  **/

  public Object getUnderwritingAssessmentRequestActionTaskRecord() {
    return underwritingAssessmentRequestActionTaskRecord;
  }

  public void setUnderwritingAssessmentRequestActionTaskRecord(Object underwritingAssessmentRequestActionTaskRecord) {
    this.underwritingAssessmentRequestActionTaskRecord = underwritingAssessmentRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

