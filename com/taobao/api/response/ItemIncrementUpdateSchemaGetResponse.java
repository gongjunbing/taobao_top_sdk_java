package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.increment.update.schema.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemIncrementUpdateSchemaGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2523785614938126575L;

	/** 
	 * 返回的结果集
	 */
	@ApiField("update_rules")
	private String updateRules;


	public void setUpdateRules(String updateRules) {
		this.updateRules = updateRules;
	}
	public String getUpdateRules( ) {
		return this.updateRules;
	}
	


}
