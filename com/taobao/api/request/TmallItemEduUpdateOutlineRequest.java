package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallItemEduUpdateOutlineResponse;

/**
 * TOP API: tmall.item.edu.update.outline request
 * 
 * @author top auto create
 * @since 1.0, 2017.08.18
 */
public class TmallItemEduUpdateOutlineRequest extends BaseTaobaoRequest<TmallItemEduUpdateOutlineResponse> {
	
	

	/** 
	* 宝贝Id
	 */
	private Long itemId;

	/** 
	* 课程大纲json
	 */
	private String outlineInfo;

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setOutlineInfo(String outlineInfo) {
		this.outlineInfo = outlineInfo;
	}

	public String getOutlineInfo() {
		return this.outlineInfo;
	}

	public String getApiMethodName() {
		return "tmall.item.edu.update.outline";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("item_id", this.itemId);
		txtParams.put("outline_info", this.outlineInfo);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemEduUpdateOutlineResponse> getResponseClass() {
		return TmallItemEduUpdateOutlineResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(itemId, "itemId");
		RequestCheckUtils.checkNotEmpty(outlineInfo, "outlineInfo");
	}
	

}