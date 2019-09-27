package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlitripTravelNormalvisaGetcompanyResponse;

/**
 * TOP API: taobao.alitrip.travel.normalvisa.getcompany request
 * 
 * @author top auto create
 * @since 1.0, 2017.11.29
 */
public class AlitripTravelNormalvisaGetcompanyRequest extends BaseTaobaoRequest<AlitripTravelNormalvisaGetcompanyResponse> {
	
	

	/** 
	* true：取5个重要的物流公司 false：取所有的物流公司
	 */
	private Boolean param0;

	public void setParam0(Boolean param0) {
		this.param0 = param0;
	}

	public Boolean getParam0() {
		return this.param0;
	}

	public String getApiMethodName() {
		return "taobao.alitrip.travel.normalvisa.getcompany";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("param0", this.param0);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlitripTravelNormalvisaGetcompanyResponse> getResponseClass() {
		return AlitripTravelNormalvisaGetcompanyResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(param0, "param0");
	}
	

}