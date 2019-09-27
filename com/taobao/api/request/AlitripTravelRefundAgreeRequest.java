package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlitripTravelRefundAgreeResponse;

/**
 * TOP API: alitrip.travel.refund.agree request
 * 
 * @author top auto create
 * @since 1.0, 2018.02.28
 */
public class AlitripTravelRefundAgreeRequest extends BaseTaobaoRequest<AlitripTravelRefundAgreeResponse> {
	
	

	/** 
	* 退款id
	 */
	private Long refundId;

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

	public void setVersion(Long version) {
		this.version = version;
	}

	public Long getVersion() {
		return this.version;
	}

	public String getApiMethodName() {
		return "alitrip.travel.refund.agree";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("refund_id", this.refundId);
		txtParams.put("version", this.version);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlitripTravelRefundAgreeResponse> getResponseClass() {
		return AlitripTravelRefundAgreeResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(refundId, "refundId");
		RequestCheckUtils.checkNotEmpty(version, "version");
	}
	

}