package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRUnderwritingAssessmentRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentRequestInputModel
 */
public class CRUnderwritingAssessmentRequestInputModel   {
  private String underwritingServicingSessionReference = null;

  private String underwritingAssessmentInstanceReference = null;

  private Object underwritingAssessmentRequestActionTaskRecord = null;

  private CRUnderwritingAssessmentRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRUnderwritingAssessmentRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRUnderwritingAssessmentRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

