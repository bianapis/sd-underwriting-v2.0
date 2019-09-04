package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRUnderwritingAssessmentRetrieveInputModelUnderwritingAssessmentInstanceAnalysis;
import org.bian.dto.CRUnderwritingAssessmentRetrieveInputModelUnderwritingAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentRetrieveInputModel
 */
public class CRUnderwritingAssessmentRetrieveInputModel   {
  private Object underwritingAssessmentRetrieveActionTaskRecord = null;

  private String underwritingAssessmentRetrieveActionRequest = null;

  private CRUnderwritingAssessmentRetrieveInputModelUnderwritingAssessmentInstanceReportRecord underwritingAssessmentInstanceReportRecord = null;

  private CRUnderwritingAssessmentRetrieveInputModelUnderwritingAssessmentInstanceAnalysis underwritingAssessmentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return underwritingAssessmentRetrieveActionRequest
  **/

  public String getUnderwritingAssessmentRetrieveActionRequest() {
    return underwritingAssessmentRetrieveActionRequest;
  }

  public void setUnderwritingAssessmentRetrieveActionRequest(String underwritingAssessmentRetrieveActionRequest) {
    this.underwritingAssessmentRetrieveActionRequest = underwritingAssessmentRetrieveActionRequest;
  }


  /**
   * Get underwritingAssessmentInstanceReportRecord
   * @return underwritingAssessmentInstanceReportRecord
  **/

  public CRUnderwritingAssessmentRetrieveInputModelUnderwritingAssessmentInstanceReportRecord getUnderwritingAssessmentInstanceReportRecord() {
    return underwritingAssessmentInstanceReportRecord;
  }

  public void setUnderwritingAssessmentInstanceReportRecord(CRUnderwritingAssessmentRetrieveInputModelUnderwritingAssessmentInstanceReportRecord underwritingAssessmentInstanceReportRecord) {
    this.underwritingAssessmentInstanceReportRecord = underwritingAssessmentInstanceReportRecord;
  }


  /**
   * Get underwritingAssessmentInstanceAnalysis
   * @return underwritingAssessmentInstanceAnalysis
  **/

  public CRUnderwritingAssessmentRetrieveInputModelUnderwritingAssessmentInstanceAnalysis getUnderwritingAssessmentInstanceAnalysis() {
    return underwritingAssessmentInstanceAnalysis;
  }

  public void setUnderwritingAssessmentInstanceAnalysis(CRUnderwritingAssessmentRetrieveInputModelUnderwritingAssessmentInstanceAnalysis underwritingAssessmentInstanceAnalysis) {
    this.underwritingAssessmentInstanceAnalysis = underwritingAssessmentInstanceAnalysis;
  }


}

