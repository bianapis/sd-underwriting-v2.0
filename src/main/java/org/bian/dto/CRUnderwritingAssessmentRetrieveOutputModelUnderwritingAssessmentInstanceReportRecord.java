package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceReportRecord
 */
public class CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceReportRecord   {
  private String underwritingAssessmentInstanceReportData = null;

  private String underwritingAssessmentInstanceReportType = null;

  private Object underwritingAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return underwritingAssessmentInstanceReportData
  **/

  public String getUnderwritingAssessmentInstanceReportData() {
    return underwritingAssessmentInstanceReportData;
  }

  public void setUnderwritingAssessmentInstanceReportData(String underwritingAssessmentInstanceReportData) {
    this.underwritingAssessmentInstanceReportData = underwritingAssessmentInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return underwritingAssessmentInstanceReportType
  **/

  public String getUnderwritingAssessmentInstanceReportType() {
    return underwritingAssessmentInstanceReportType;
  }

  public void setUnderwritingAssessmentInstanceReportType(String underwritingAssessmentInstanceReportType) {
    this.underwritingAssessmentInstanceReportType = underwritingAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return underwritingAssessmentInstanceReport
  **/

  public Object getUnderwritingAssessmentInstanceReport() {
    return underwritingAssessmentInstanceReport;
  }

  public void setUnderwritingAssessmentInstanceReport(Object underwritingAssessmentInstanceReport) {
    this.underwritingAssessmentInstanceReport = underwritingAssessmentInstanceReport;
  }


}

