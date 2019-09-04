package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRUnderwritingAssessmentExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentExecuteInputModel
 */
public class CRUnderwritingAssessmentExecuteInputModel   {
  private String underwritingServicingSessionReference = null;

  private String underwritingAssessmentInstanceReference = null;

  private Object underwritingAssessmentExecuteActionTaskRecord = null;

  private CRUnderwritingAssessmentExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return underwritingAssessmentExecuteActionTaskRecord
  **/

  public Object getUnderwritingAssessmentExecuteActionTaskRecord() {
    return underwritingAssessmentExecuteActionTaskRecord;
  }

  public void setUnderwritingAssessmentExecuteActionTaskRecord(Object underwritingAssessmentExecuteActionTaskRecord) {
    this.underwritingAssessmentExecuteActionTaskRecord = underwritingAssessmentExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRUnderwritingAssessmentExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRUnderwritingAssessmentExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

