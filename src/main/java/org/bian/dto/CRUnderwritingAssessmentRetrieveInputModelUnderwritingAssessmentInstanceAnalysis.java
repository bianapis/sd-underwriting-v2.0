package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentRetrieveInputModelUnderwritingAssessmentInstanceAnalysis
 */
public class CRUnderwritingAssessmentRetrieveInputModelUnderwritingAssessmentInstanceAnalysis   {
  private String underwritingAssessmentInstanceAnalysisReference = null;

  private String underwritingAssessmentInstanceAnalysisReportType = null;

  private String underwritingAssessmentInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return underwritingAssessmentInstanceAnalysisReference
  **/

  public String getUnderwritingAssessmentInstanceAnalysisReference() {
    return underwritingAssessmentInstanceAnalysisReference;
  }

  public void setUnderwritingAssessmentInstanceAnalysisReference(String underwritingAssessmentInstanceAnalysisReference) {
    this.underwritingAssessmentInstanceAnalysisReference = underwritingAssessmentInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return underwritingAssessmentInstanceAnalysisParameters
  **/

  public String getUnderwritingAssessmentInstanceAnalysisParameters() {
    return underwritingAssessmentInstanceAnalysisParameters;
  }

  public void setUnderwritingAssessmentInstanceAnalysisParameters(String underwritingAssessmentInstanceAnalysisParameters) {
    this.underwritingAssessmentInstanceAnalysisParameters = underwritingAssessmentInstanceAnalysisParameters;
  }


}

