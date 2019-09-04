package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRUnderwritingAssessmentGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentGrantOutputModel
 */
public class CRUnderwritingAssessmentGrantOutputModel   {
  private String underwritingAssessmentGrantActionTaskReference = null;

  private Object underwritingAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRUnderwritingAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Underwriting Assessment instance grant service call 
   * @return underwritingAssessmentGrantActionTaskReference
  **/

  public String getUnderwritingAssessmentGrantActionTaskReference() {
    return underwritingAssessmentGrantActionTaskReference;
  }

  public void setUnderwritingAssessmentGrantActionTaskReference(String underwritingAssessmentGrantActionTaskReference) {
    this.underwritingAssessmentGrantActionTaskReference = underwritingAssessmentGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return underwritingAssessmentGrantActionTaskRecord
  **/

  public Object getUnderwritingAssessmentGrantActionTaskRecord() {
    return underwritingAssessmentGrantActionTaskRecord;
  }

  public void setUnderwritingAssessmentGrantActionTaskRecord(Object underwritingAssessmentGrantActionTaskRecord) {
    this.underwritingAssessmentGrantActionTaskRecord = underwritingAssessmentGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRUnderwritingAssessmentGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRUnderwritingAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

