package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alitrip.travel.refund.agree response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlitripTravelRefundAgreeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3688583652997741368L;

	/** 
	 * 退款id
	 */
	@ApiField("first_result")
	private String firstResult;


	public void setFirstResult(String firstResult) {
		this.firstResult = firstResult;
	}
	public String getFirstResult( ) {
		return this.firstResult;
	}
	


}
