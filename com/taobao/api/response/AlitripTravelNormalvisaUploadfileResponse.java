package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.util.json.JSONValidatingReader;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.alitrip.travel.normalvisa.uploadfile response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlitripTravelNormalvisaUploadfileResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3463436363189126112L;

	/** 
	 * 结果：包含results则代表成功保存
	 */
	@ApiField("result")
	private ResultSet result;


	public void setResult(ResultSet result) {
		this.result = result;
	}
	public ResultSet getResult( ) {
		return this.result;
	}
	
	/**
 * 结果：包含results则代表成功保存
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ResultSet extends TaobaoObject {

	private static final long serialVersionUID = 2418972985684959681L;

	/**
		 * 错误码
		 */
		@ApiField("error_code")
		private String errorCode;
		/**
		 * 错误信息
		 */
		@ApiField("error_msg")
		private String errorMsg;
		/**
		 * 异常
		 */
		@ApiField("exception")
		private String exception;
		/**
		 * 是否包含下一个
		 */
		@ApiField("has_next")
		private Boolean hasNext;
		/**
		 * 结果列表
		 */
		@ApiListField("results")
		@ApiField("boolean")
		private List<Boolean> results;
		/**
		 * 数量
		 */
		@ApiField("total_results")
		private Long totalResults;
	

	public String getErrorCode() {
			return this.errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorMsg() {
			return this.errorMsg;
		}
		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}
		public String getException() {
			return this.exception;
		}
		public void setException(String exception) {
			this.exception = exception;
		}
		public void setExceptionString(String exception) {
			this.exception = exception;
		}
		
		public Boolean getHasNext() {
			return this.hasNext;
		}
		public void setHasNext(Boolean hasNext) {
			this.hasNext = hasNext;
		}
		public List<Boolean> getResults() {
			return this.results;
		}
		public void setResults(List<Boolean> results) {
			this.results = results;
		}
		public Long getTotalResults() {
			return this.totalResults;
		}
		public void setTotalResults(Long totalResults) {
			this.totalResults = totalResults;
		}

}



}
