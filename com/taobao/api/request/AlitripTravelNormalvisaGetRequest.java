package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlitripTravelNormalvisaGetResponse;

/**
 * TOP API: taobao.alitrip.travel.normalvisa.get request
 * 
 * @author top auto create
 * @since 1.0, 2018.02.28
 */
public class AlitripTravelNormalvisaGetRequest extends BaseTaobaoRequest<AlitripTravelNormalvisaGetResponse> {
	
	

	/** 
	* 订单号
	 */
	private Long bizOrderId;

	public void setBizOrderId(Long bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public Long getBizOrderId() {
		return this.bizOrderId;
	}

	public String getApiMethodName() {
		return "taobao.alitrip.travel.normalvisa.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_order_id", this.bizOrderId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlitripTravelNormalvisaGetResponse> getResponseClass() {
		return AlitripTravelNormalvisaGetResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}