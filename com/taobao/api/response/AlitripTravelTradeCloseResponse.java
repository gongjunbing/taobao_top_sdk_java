package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alitrip.travel.trade.close response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlitripTravelTradeCloseResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6424682687164276797L;

	/** 
	 * 交易关闭是否成功
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
