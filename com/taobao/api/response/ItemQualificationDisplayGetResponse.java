package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.DisplayQualifications;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.item.qualification.display.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ItemQualificationDisplayGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8448664716786177252L;

	/** 
	 * 返回资质采集配置
	 */
	@ApiField("display_conf")
	private DisplayQualifications displayConf;


	public void setDisplayConf(DisplayQualifications displayConf) {
		this.displayConf = displayConf;
	}
	public DisplayQualifications getDisplayConf( ) {
		return this.displayConf;
	}
	


}
