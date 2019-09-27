package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlitripTravelTradeDeliverResponse;

/**
 * TOP API: alitrip.travel.trade.deliver request
 * 
 * @author top auto create
 * @since 1.0, 2018.01.23
 */
public class AlitripTravelTradeDeliverRequest extends BaseTaobaoRequest<AlitripTravelTradeDeliverResponse> {
	
	

	/** 
	* 子订单id
	 */
	private Long subOrderId;

	public void setSubOrderId(Long subOrderId) {
		this.subOrderId = subOrderId;
	}

	public Long getSubOrderId() {
		return this.subOrderId;
	}

	public String getApiMethodName() {
		return "alitrip.travel.trade.deliver";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("sub_order_id", this.subOrderId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlitripTravelTradeDeliverResponse> getResponseClass() {
		return AlitripTravelTradeDeliverResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(subOrderId, "subOrderId");
	}
	

}