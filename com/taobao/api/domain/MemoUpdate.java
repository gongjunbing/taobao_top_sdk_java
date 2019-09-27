package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 备注修改返回值
 *
 * @author top auto create
 * @since 1.0, null
 */
public class MemoUpdate extends TaobaoObject {

	private static final long serialVersionUID = 5512256823917881544L;

	/**
	 * 关闭订单时间
	 */
	@ApiField("modified")
	private Date modified;

	/**
	 * 交易ID
	 */
	@ApiField("tid")
	private Long tid;


	public Date getModified() {
		return this.modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

}
