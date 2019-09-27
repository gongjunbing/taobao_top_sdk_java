package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: tmall.item.edu.update.outline response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmallItemEduUpdateOutlineResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7515283542153163989L;

	/** 
	 * error
	 */
	@ApiField("error")
	private Boolean error;

	/** 
	 * errorCode
	 */
	@ApiField("errorcode")
	private String errorcode;

	/** 
	 * errorMsg
	 */
	@ApiField("errormsg")
	private String errormsg;

	/** 
	 * result
	 */
	@ApiField("result")
	private String result;


	public void setError(Boolean error) {
		this.error = error;
	}
	public Boolean getError( ) {
		return this.error;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	public String getErrorcode( ) {
		return this.errorcode;
	}

	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
	public String getErrormsg( ) {
		return this.errormsg;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}
	


}
