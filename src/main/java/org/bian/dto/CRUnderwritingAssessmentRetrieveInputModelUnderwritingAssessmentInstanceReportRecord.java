package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRUnderwritingAssessmentRetrieveInputModelUnderwritingAssessmentInstanceReportRecord
 */
public class CRUnderwritingAssessmentRetrieveInputModelUnderwritingAssessmentInstanceReportRecord   {
  private String underwritingAssessmentInstanceReportReference = null;

  private String underwritingAssessmentInstanceReportType = null;

  private String underwritingAssessmentInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return underwritingAssessmentInstanceReportReference
  **/

  public String getUnderwritingAssessmentInstanceReportReference() {
    return underwritingAssessmentInstanceReportReference;
  }

  public void setUnderwritingAssessmentInstanceReportReference(String underwritingAssessmentInstanceReportReference) {
    this.underwritingAssessmentInstanceReportReference = underwritingAssessmentInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return underwritingAssessmentInstanceReportParameters
  **/

  public String getUnderwritingAssessmentInstanceReportParameters() {
    return underwritingAssessmentInstanceReportParameters;
  }

  public void setUnderwritingAssessmentInstanceReportParameters(String underwritingAssessmentInstanceReportParameters) {
    this.underwritingAssessmentInstanceReportParameters = underwritingAssessmentInstanceReportParameters;
  }


}

