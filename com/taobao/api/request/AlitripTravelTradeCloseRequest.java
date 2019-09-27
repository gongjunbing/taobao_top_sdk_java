package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlitripTravelTradeCloseResponse;

/**
 * TOP API: alitrip.travel.trade.close request
 * 
 * @author top auto create
 * @since 1.0, 2018.01.09
 */
public class AlitripTravelTradeCloseRequest extends BaseTaobaoRequest<AlitripTravelTradeCloseResponse> {
	
	

	/** 
	* 交易关闭原因
	 */
	private String closeReason;

	/** 
	* 订单关闭原因描述
	 */
	private String reasonDesc;

	/** 
	* 子订单编号
	 */
	private Long subOrderId;

	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public String getCloseReason() {
		return this.closeReason;
	}

	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}

	public String getReasonDesc() {
		return this.reasonDesc;
	}

	public void setSubOrderId(Long subOrderId) {
		this.subOrderId = subOrderId;
	}

	public Long getSubOrderId() {
		return this.subOrderId;
	}

	public String getApiMethodName() {
		return "alitrip.travel.trade.close";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("close_reason", this.closeReason);
		txtParams.put("reason_desc", this.reasonDesc);
		txtParams.put("sub_order_id", this.subOrderId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlitripTravelTradeCloseResponse> getResponseClass() {
		return AlitripTravelTradeCloseResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(closeReason, "closeReason");
		RequestCheckUtils.checkNotEmpty(subOrderId, "subOrderId");
	}
	

}