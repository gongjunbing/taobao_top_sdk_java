package com.taobao.api.response;

import com.taobao.api.internal.util.json.JSONValidatingReader;
import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.alitrip.travel.normalvisa.getcompany response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlitripTravelNormalvisaGetcompanyResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3773177487159565531L;

	/** 
	 * 结果，有返回代表成功
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
 * 物流公司列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class LogisticsCompanyUnitTopVo extends TaobaoObject {

	private static final long serialVersionUID = 1285255368336775325L;

	/**
		 * 物流公司代码
		 */
		@ApiField("company_code")
		private String companyCode;
		/**
		 * 物流公司名
		 */
		@ApiField("company_name")
		private String companyName;
	

	public String getCompanyCode() {
			return this.companyCode;
		}
		public void setCompanyCode(String companyCode) {
			this.companyCode = companyCode;
		}
		public String getCompanyName() {
			return this.companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

}

	/**
 * 结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class LogisticsCompanyInfo extends TaobaoObject {

	private static final long serialVersionUID = 6143831759746885426L;

	/**
		 * 物流公司列表
		 */
		@ApiListField("logistics_company_unit_top_v_o_list")
		@ApiField("logistics_company_unit_top_vo")
		private List<LogisticsCompanyUnitTopVo> logisticsCompanyUnitTopVOList;
	

	public List<LogisticsCompanyUnitTopVo> getLogisticsCompanyUnitTopVOList() {
			return this.logisticsCompanyUnitTopVOList;
		}
		public void setLogisticsCompanyUnitTopVOList(List<LogisticsCompanyUnitTopVo> logisticsCompanyUnitTopVOList) {
			this.logisticsCompanyUnitTopVOList = logisticsCompanyUnitTopVOList;
		}

}

	/**
 * 结果，有返回代表成功
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ResultSet extends TaobaoObject {

	private static final long serialVersionUID = 4464556165154266232L;

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
		 * 结果
		 */
		@ApiListField("results")
		@ApiField("logistics_company_info")
		private List<LogisticsCompanyInfo> results;
		/**
		 * 结果数
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
		public List<LogisticsCompanyInfo> getResults() {
			return this.results;
		}
		public void setResults(List<LogisticsCompanyInfo> results) {
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
