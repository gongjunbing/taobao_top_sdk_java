package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.schema.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemSchemaAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5473711325383166392L;

	/** 
	 * 返回的结果
	 */
	@ApiField("add_result")
	private String addResult;


	public void setAddResult(String addResult) {
		this.addResult = addResult;
	}
	public String getAddResult( ) {
		return this.addResult;
	}
	


}
