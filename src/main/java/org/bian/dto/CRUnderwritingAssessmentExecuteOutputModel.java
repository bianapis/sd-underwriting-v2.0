package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentExecuteOutputModel
 */
public class CRUnderwritingAssessmentExecuteOutputModel   {
  private String underwritingAssessmentExecuteActionTaskReference = null;

  private Object underwritingAssessmentExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Underwriting Assessment instance execute service call 
   * @return underwritingAssessmentExecuteActionTaskReference
  **/

  public String getUnderwritingAssessmentExecuteActionTaskReference() {
    return underwritingAssessmentExecuteActionTaskReference;
  }

  public void setUnderwritingAssessmentExecuteActionTaskReference(String underwritingAssessmentExecuteActionTaskReference) {
    this.underwritingAssessmentExecuteActionTaskReference = underwritingAssessmentExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

