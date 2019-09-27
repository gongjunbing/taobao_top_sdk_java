package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.TmallItemHscodeDetailGetResponse;

/**
 * TOP API: tmall.item.hscode.detail.get request
 * 
 * @author top auto create
 * @since 1.0, 2017.08.02
 */
public class TmallItemHscodeDetailGetRequest extends BaseTaobaoRequest<TmallItemHscodeDetailGetResponse> {
	
	

	/** 
	* hscode
	 */
	private String hscode;

	public void setHscode(String hscode) {
		this.hscode = hscode;
	}

	public String getHscode() {
		return this.hscode;
	}

	public String getApiMethodName() {
		return "tmall.item.hscode.detail.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("hscode", this.hscode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<TmallItemHscodeDetailGetResponse> getResponseClass() {
		return TmallItemHscodeDetailGetResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(hscode, "hscode");
	}
	

}