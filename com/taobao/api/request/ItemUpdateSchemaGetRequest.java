package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemUpdateSchemaGetResponse;

/**
 * TOP API: taobao.item.update.schema.get request
 * 
 * @author top auto create
 * @since 1.0, 2015.03.05
 */
public class ItemUpdateSchemaGetRequest extends BaseTaobaoRequest<ItemUpdateSchemaGetResponse> {
	
	

	/** 
	* 商品类目id
	 */
	private Long categoryId;

	/** 
	* 商品id
	 */
	private Long itemId;

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public String getApiMethodName() {
		return "taobao.item.update.schema.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("category_id", this.categoryId);
		txtParams.put("item_id", this.itemId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemUpdateSchemaGetResponse> getResponseClass() {
		return ItemUpdateSchemaGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
	}
	

}