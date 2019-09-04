package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceAnalysis
 */
public class CRUnderwritingAssessmentRetrieveOutputModelUnderwritingAssessmentInstanceAnalysis   {
  private String underwritingAssessmentInstanceAnalysisData = null;

  private String underwritingAssessmentInstanceAnalysisReportType = null;

  private Object underwritingAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return underwritingAssessmentInstanceAnalysisData
  **/

  public String getUnderwritingAssessmentInstanceAnalysisData() {
    return underwritingAssessmentInstanceAnalysisData;
  }

  public void setUnderwritingAssessmentInstanceAnalysisData(String underwritingAssessmentInstanceAnalysisData) {
    this.underwritingAssessmentInstanceAnalysisData = underwritingAssessmentInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return underwritingAssessmentInstanceAnalysisReportType
  **/

  public String getUnderwritingAssessmentInstanceAnalysisReportType() {
    return underwritingAssessmentInstanceAnalysisReportType;
  }

  public void setUnderwritingAssessmentInstanceAnalysisReportType(String underwritingAssessmentInstanceAnalysisReportType) {
    this.underwritingAssessmentInstanceAnalysisReportType = underwritingAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return underwritingAssessmentInstanceAnalysisReport
  **/

  public Object getUnderwritingAssessmentInstanceAnalysisReport() {
    return underwritingAssessmentInstanceAnalysisReport;
  }

  public void setUnderwritingAssessmentInstanceAnalysisReport(Object underwritingAssessmentInstanceAnalysisReport) {
    this.underwritingAssessmentInstanceAnalysisReport = underwritingAssessmentInstanceAnalysisReport;
  }


}

