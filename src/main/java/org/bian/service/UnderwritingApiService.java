/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface UnderwritingApiService {

	SDUnderwritingActivateOutputModel activate(SDUnderwritingActivateInputModel request);
	
	SDUnderwritingConfigureOutputModel configure(String sdReferenceId, SDUnderwritingConfigureInputModel request);
	
	CRUnderwritingAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRUnderwritingAssessmentEvaluateInputModel request);
	
	CRUnderwritingAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRUnderwritingAssessmentExchangeInputModel request);
	
	CRUnderwritingAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRUnderwritingAssessmentExecuteInputModel request);
	
	SDUnderwritingFeedbackOutputModel feedback(String sdReferenceId, SDUnderwritingFeedbackInputModel request);
	
	CRUnderwritingAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRUnderwritingAssessmentGrantInputModel request);
	
	CRUnderwritingAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRUnderwritingAssessmentRequestInputModel request);
	
	SDUnderwritingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRUnderwritingAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	CRUnderwritingAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRUnderwritingAssessmentUpdateInputModel request);
	
}
