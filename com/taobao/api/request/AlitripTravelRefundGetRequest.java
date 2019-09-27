package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlitripTravelRefundGetResponse;

/**
 * TOP API: alitrip.travel.refund.get request
 * 
 * @author top auto create
 * @since 1.0, 2017.11.29
 */
public class AlitripTravelRefundGetRequest extends BaseTaobaoRequest<AlitripTravelRefundGetResponse> {
	
	

	/** 
	* 退款id
	 */
	private Long refundId;

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public Long getRefundId() {
		return this.refundId;
	}

	public String getApiMethodName() {
		return "alitrip.travel.refund.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("refund_id", this.refundId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlitripTravelRefundGetResponse> getResponseClass() {
		return AlitripTravelRefundGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(refundId, "refundId");
	}
	

}