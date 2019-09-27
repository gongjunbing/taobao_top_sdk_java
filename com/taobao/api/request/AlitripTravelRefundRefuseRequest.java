package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlitripTravelRefundRefuseResponse;

/**
 * TOP API: alitrip.travel.refund.refuse request
 * 
 * @author top auto create
 * @since 1.0, 2017.11.10
 */
public class AlitripTravelRefundRefuseRequest extends BaseTaobaoRequest<AlitripTravelRefundRefuseResponse> {
	
	

	/** 
	* 退款id
	 */
	private Long refundId;

	/** 
	* 服务已完成
	 */
	private String refuseReason;

	/** 
	* 版本号
	 */
	private Long version;

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public Long getRefundId() {
		return this.refundId;
	}

	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public String getRefuseReason() {
		return this.refuseReason;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Long getVersion() {
		return this.version;
	}

	public String getApiMethodName() {
		return "alitrip.travel.refund.refuse";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("refund_id", this.refundId);
		txtParams.put("refuse_reason", this.refuseReason);
		txtParams.put("version", this.version);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlitripTravelRefundRefuseResponse> getResponseClass() {
		return AlitripTravelRefundRefuseResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(refundId, "refundId");
		RequestCheckUtils.checkNotEmpty(refuseReason, "refuseReason");
		RequestCheckUtils.checkNotEmpty(version, "version");
	}
	

}