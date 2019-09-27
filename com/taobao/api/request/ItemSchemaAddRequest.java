package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemSchemaAddResponse;

/**
 * TOP API: taobao.item.schema.add request
 * 
 * @author top auto create
 * @since 1.0, 2017.12.12
 */
public class ItemSchemaAddRequest extends BaseTaobaoRequest<ItemSchemaAddResponse> {
	
	

	/** 
	* 当前发布的叶子类目
	 */
	private Long categoryId;

	/** 
	* 将需要发布的商品数据组装成的xml格式数据
	 */
	private String xmlData;

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setXmlData(String xmlData) {
		this.xmlData = xmlData;
	}

	public String getXmlData() {
		return this.xmlData;
	}

	public String getApiMethodName() {
		return "taobao.item.schema.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("category_id", this.categoryId);
		txtParams.put("xml_data", this.xmlData);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemSchemaAddResponse> getResponseClass() {
		return ItemSchemaAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(categoryId, "categoryId");
		RequestCheckUtils.checkNotEmpty(xmlData, "xmlData");
	}
	

}