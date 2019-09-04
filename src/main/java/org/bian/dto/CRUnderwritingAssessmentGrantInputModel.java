package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRUnderwritingAssessmentGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentGrantInputModel
 */
public class CRUnderwritingAssessmentGrantInputModel   {
  private String underwritingServicingSessionReference = null;

  private String underwritingAssessmentInstanceReference = null;

  private Object underwritingAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRUnderwritingAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRUnderwritingAssessmentGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRUnderwritingAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

