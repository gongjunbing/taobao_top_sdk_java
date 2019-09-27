package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlitripTravelTradeQueryResponse;

/**
 * TOP API: alitrip.travel.trade.query request
 * 
 * @author top auto create
 * @since 1.0, 2018.05.03
 */
public class AlitripTravelTradeQueryRequest extends BaseTaobaoRequest<AlitripTravelTradeQueryResponse> {
	
	

	/** 
	* 主订单id
	 */
	private Long orderId;

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public String getApiMethodName() {
		return "alitrip.travel.trade.query";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("order_id", this.orderId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlitripTravelTradeQueryResponse> getResponseClass() {
		return AlitripTravelTradeQueryResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(orderId, "orderId");
	}
	

}