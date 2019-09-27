package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.ItemSchemaUpdateResponse;

/**
 * TOP API: taobao.item.schema.update request
 * 
 * @author top auto create
 * @since 1.0, 2016.03.16
 */
public class ItemSchemaUpdateRequest extends BaseTaobaoRequest<ItemSchemaUpdateResponse> {
	
	

	/** 
	* 如果重新选择类目后，传入重新选择的叶子类目id
	 */
	private Long categoryId;

	/** 
	* 是否增量更新。为true只改xml_data里传入的值。为false时，将根据xml_data的数据对原始宝贝数据进行全量覆盖,这个参数暂时不支持
	 */
	private Boolean incremental;

	/** 
	* 编辑商品的商品id
	 */
	private Long itemId;

	/** 
	* 编辑商品时候的修改内容
	 */
	private String xmlData;

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setIncremental(Boolean incremental) {
		this.incremental = incremental;
	}

	public Boolean getIncremental() {
		return this.incremental;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setXmlData(String xmlData) {
		this.xmlData = xmlData;
	}

	public String getXmlData() {
		return this.xmlData;
	}

	public String getApiMethodName() {
		return "taobao.item.schema.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("category_id", this.categoryId);
		txtParams.put("incremental", this.incremental);
		txtParams.put("item_id", this.itemId);
		txtParams.put("xml_data", this.xmlData);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<ItemSchemaUpdateResponse> getResponseClass() {
		return ItemSchemaUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkNotEmpty(xmlData, "xmlData");
	}
	

}