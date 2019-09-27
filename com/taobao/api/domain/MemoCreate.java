package com.taobao.api.domain;

import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 添加交易备注返回值
 *
 * @author top auto create
 * @since 1.0, null
 */
public class MemoCreate extends TaobaoObject {

	private static final long serialVersionUID = 5219269461678393776L;

	/**
	 * 备注添加时间
	 */
	@ApiField("created")
	private Date created;

	/**
	 * 交易ID
	 */
	@ApiField("tid")
	private Long tid;


	public Date getCreated() {
		return this.created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Long getTid() {
		return this.tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

}
