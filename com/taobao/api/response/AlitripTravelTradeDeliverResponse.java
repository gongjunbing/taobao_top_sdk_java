package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alitrip.travel.trade.deliver response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlitripTravelTradeDeliverResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5898414272973355117L;

	/** 
	 * 发货是否成功
	 */
	@ApiField("first_result")
	private Boolean firstResult;


	public void setFirstResult(Boolean firstResult) {
		this.firstResult = firstResult;
	}
	public Boolean getFirstResult( ) {
		return this.firstResult;
	}
	


}
