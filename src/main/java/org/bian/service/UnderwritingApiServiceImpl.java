/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class UnderwritingApiServiceImpl implements UnderwritingApiService {

	public SDUnderwritingActivateOutputModel activate(SDUnderwritingActivateInputModel request){
		return JsonReader.read("activate-SDUnderwritingActivateOutputModel.json",new TypeReference<SDUnderwritingActivateOutputModel>(){});
	}
	
	public SDUnderwritingConfigureOutputModel configure(String sdReferenceId, SDUnderwritingConfigureInputModel request){
		return JsonReader.read("configure-SDUnderwritingConfigureOutputModel.json",new TypeReference<SDUnderwritingConfigureOutputModel>(){});
	}
	
	public CRUnderwritingAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRUnderwritingAssessmentEvaluateInputModel request){
		return JsonReader.read("evaluate-CRUnderwritingAssessmentEvaluateOutputModel.json",new TypeReference<CRUnderwritingAssessmentEvaluateOutputModel>(){});
	}
	
	public CRUnderwritingAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRUnderwritingAssessmentExchangeInputModel request){
		return JsonReader.read("exchange-CRUnderwritingAssessmentExchangeOutputModel.json",new TypeReference<CRUnderwritingAssessmentExchangeOutputModel>(){});
	}
	
	public CRUnderwritingAssessmentExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRUnderwritingAssessmentExecuteInputModel request){
		return JsonReader.read("execute-CRUnderwritingAssessmentExecuteOutputModel.json",new TypeReference<CRUnderwritingAssessmentExecuteOutputModel>(){});
	}
	
	public SDUnderwritingFeedbackOutputModel feedback(String sdReferenceId, SDUnderwritingFeedbackInputModel request){
		return JsonReader.read("feedback-SDUnderwritingFeedbackOutputModel.json",new TypeReference<SDUnderwritingFeedbackOutputModel>(){});
	}
	
	public CRUnderwritingAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRUnderwritingAssessmentGrantInputModel request){
		return JsonReader.read("grant-CRUnderwritingAssessmentGrantOutputModel.json",new TypeReference<CRUnderwritingAssessmentGrantOutputModel>(){});
	}
	
	public CRUnderwritingAssessmentRequestOutputModel request(String sdReferenceId, String crReferenceId, CRUnderwritingAssessmentRequestInputModel request){
		return JsonReader.read("request-CRUnderwritingAssessmentRequestOutputModel.json",new TypeReference<CRUnderwritingAssessmentRequestOutputModel>(){});
	}
	
	public SDUnderwritingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDUnderwritingRetrieveOutputModel.json",new TypeReference<SDUnderwritingRetrieveOutputModel>(){});
	}
	
	public CRUnderwritingAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRUnderwritingAssessmentRetrieveOutputModel.json",new TypeReference<CRUnderwritingAssessmentRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CRUnderwritingAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRUnderwritingAssessmentUpdateInputModel request){
		return JsonReader.read("update-CRUnderwritingAssessmentUpdateOutputModel.json",new TypeReference<CRUnderwritingAssessmentUpdateOutputModel>(){});
	}
	
}
