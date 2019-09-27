package com.taobao.api.response;

import com.taobao.api.domain.MemoUpdate;
import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.alitrip.travel.trade.memo.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlitripTravelTradeMemoUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5191111347384787195L;

	/** 
	 * 修改交易备注返回值
	 */
	@ApiField("memo_update")
	private MemoUpdate memoUpdate;


	public void setMemoUpdate(MemoUpdate memoUpdate) {
		this.memoUpdate = memoUpdate;
	}
	public MemoUpdate getMemoUpdate( ) {
		return this.memoUpdate;
	}
	


}
