package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.schema.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemSchemaUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4665148562912298654L;

	/** 
	 * 编辑商品返回的结果信息，暂时只返回 itemId
	 */
	@ApiField("update_result")
	private String updateResult;


	public void setUpdateResult(String updateResult) {
		this.updateResult = updateResult;
	}
	public String getUpdateResult( ) {
		return this.updateResult;
	}
	


}
