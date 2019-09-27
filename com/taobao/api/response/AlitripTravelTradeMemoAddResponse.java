package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.MemoCreate;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.alitrip.travel.trade.memo.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlitripTravelTradeMemoAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3585564167295449559L;

	/** 
	 * 交易添加备注返回值
	 */
	@ApiField("memo_add")
	private MemoCreate memoAdd;


	public void setMemoAdd(MemoCreate memoAdd) {
		this.memoAdd = memoAdd;
	}
	public MemoCreate getMemoAdd( ) {
		return this.memoAdd;
	}
	


}
