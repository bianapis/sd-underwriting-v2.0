package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceAnalysis;
import org.bian.dto.CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceRecord;
import org.bian.dto.CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentRetrieveOutputModel
 */
public class CRUnderwritingAssessmentRetrieveOutputModel   {
  private CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceRecord underwritingAssessmentInstanceRecord = null;

  private String underwritingAssessmentRetrieveActionTaskReference = null;

  private Object underwritingAssessmentRetrieveActionTaskRecord = null;

  private String underwritingAssessmentRetrieveActionResponse = null;

  private CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceReportRecord underwritingAssessmentInstanceReportRecord = null;

  private CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceAnalysis underwritingAssessmentInstanceAnalysis = null;


  /**
   * Get underwritingAssessmentInstanceRecord
   * @return underwritingAssessmentInstanceRecord
  **/

  public CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceRecord getUnderwritingAssessmentInstanceRecord() {
    return underwritingAssessmentInstanceRecord;
  }

  public void setUnderwritingAssessmentInstanceRecord(CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceRecord underwritingAssessmentInstanceRecord) {
    this.underwritingAssessmentInstanceRecord = underwritingAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Underwriting Assessment instance retrieve service call 
   * @return underwritingAssessmentRetrieveActionTaskReference
  **/

  public String getUnderwritingAssessmentRetrieveActionTaskReference() {
    return underwritingAssessmentRetrieveActionTaskReference;
  }

  public void setUnderwritingAssessmentRetrieveActionTaskReference(String underwritingAssessmentRetrieveActionTaskReference) {
    this.underwritingAssessmentRetrieveActionTaskReference = underwritingAssessmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return underwritingAssessmentRetrieveActionTaskRecord
  **/

  public Object getUnderwritingAssessmentRetrieveActionTaskRecord() {
    return underwritingAssessmentRetrieveActionTaskRecord;
  }

  public void setUnderwritingAssessmentRetrieveActionTaskRecord(Object underwritingAssessmentRetrieveActionTaskRecord) {
    this.underwritingAssessmentRetrieveActionTaskRecord = underwritingAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return underwritingAssessmentRetrieveActionResponse
  **/

  public String getUnderwritingAssessmentRetrieveActionResponse() {
    return underwritingAssessmentRetrieveActionResponse;
  }

  public void setUnderwritingAssessmentRetrieveActionResponse(String underwritingAssessmentRetrieveActionResponse) {
    this.underwritingAssessmentRetrieveActionResponse = underwritingAssessmentRetrieveActionResponse;
  }


  /**
   * Get underwritingAssessmentInstanceReportRecord
   * @return underwritingAssessmentInstanceReportRecord
  **/

  public CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceReportRecord getUnderwritingAssessmentInstanceReportRecord() {
    return underwritingAssessmentInstanceReportRecord;
  }

  public void setUnderwritingAssessmentInstanceReportRecord(CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceReportRecord underwritingAssessmentInstanceReportRecord) {
    this.underwritingAssessmentInstanceReportRecord = underwritingAssessmentInstanceReportRecord;
  }


  /**
   * Get underwritingAssessmentInstanceAnalysis
   * @return underwritingAssessmentInstanceAnalysis
  **/

  public CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceAnalysis getUnderwritingAssessmentInstanceAnalysis() {
    return underwritingAssessmentInstanceAnalysis;
  }

  public void setUnderwritingAssessmentInstanceAnalysis(CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceAnalysis underwritingAssessmentInstanceAnalysis) {
    this.underwritingAssessmentInstanceAnalysis = underwritingAssessmentInstanceAnalysis;
  }


}

