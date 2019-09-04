package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRUnderwritingAssessmentUpdateInputModelUnderwritingAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentUpdateOutputModel
 */
public class CRUnderwritingAssessmentUpdateOutputModel   {
  private CRUnderwritingAssessmentUpdateInputModelUnderwritingAssessmentInstanceRecord underwritingAssessmentInstanceRecord = null;

  private String underwritingAssessmentUpdateActionTaskReference = null;

  private Object underwritingAssessmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return underwritingAssessmentUpdateActionTaskReference
  **/

  public String getUnderwritingAssessmentUpdateActionTaskReference() {
    return underwritingAssessmentUpdateActionTaskReference;
  }

  public void setUnderwritingAssessmentUpdateActionTaskReference(String underwritingAssessmentUpdateActionTaskReference) {
    this.underwritingAssessmentUpdateActionTaskReference = underwritingAssessmentUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

