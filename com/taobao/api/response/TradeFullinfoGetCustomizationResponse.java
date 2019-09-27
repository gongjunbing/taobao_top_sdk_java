package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.Trade;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trade.fullinfo.get.customization response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TradeFullinfoGetCustomizationResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4884665818822322699L;

	/** 
	 * 交易主订单信息
	 */
	@ApiField("trade")
	private Trade trade;


	public void setTrade(Trade trade) {
		this.trade = trade;
	}
	public Trade getTrade( ) {
		return this.trade;
	}
	


}
