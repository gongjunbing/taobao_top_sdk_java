package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlitripTravelNormalvisaGetdetailResponse;

/**
 * TOP API: taobao.alitrip.travel.normalvisa.getdetail request
 * 
 * @author top auto create
 * @since 1.0, 2017.07.28
 */
public class AlitripTravelNormalvisaGetdetailRequest extends BaseTaobaoRequest<AlitripTravelNormalvisaGetdetailResponse> {
	
	

	/** 
	* 订单id
	 */
	private Long bizOrderId;

	public void setBizOrderId(Long bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public Long getBizOrderId() {
		return this.bizOrderId;
	}

	public String getApiMethodName() {
		return "taobao.alitrip.travel.normalvisa.getdetail";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_order_id", this.bizOrderId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlitripTravelNormalvisaGetdetailResponse> getResponseClass() {
		return AlitripTravelNormalvisaGetdetailResponse.class;
	}

	public void check() throws ApiRuleException {
	}
	

}