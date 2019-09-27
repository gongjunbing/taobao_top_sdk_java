package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.item.hscode.detail.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemHscodeDetailGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3557657335429992257L;

	/** 
	 * 返回的计量单位和销售单位
	 */
	@ApiListField("results")
	@ApiField("json")
	private List<String> results;


	public void setResults(List<String> results) {
		this.results = results;
	}
	public List<String> getResults( ) {
		return this.results;
	}
	


}
