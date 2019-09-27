package com.taobao.api.response;

import com.taobao.api.internal.util.json.JSONValidatingReader;
import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.alitrip.travel.normalvisa.getdetail response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlitripTravelNormalvisaGetdetailResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8496713725363386743L;

	/** 
	 * 结果
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
 * 用户信息数组
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class NormalVisaPersonDetailVo extends TaobaoObject {

	private static final long serialVersionUID = 6891276989944438864L;

	/**
		 * 订单号
		 */
		@ApiField("biz_order_id")
		private Long bizOrderId;
		/**
		 * 证件信息
		 */
		@ApiField("credential_card_infor")
		private String credentialCardInfor;
		/**
		 * 证件号
		 */
		@ApiField("credential_card_no")
		private String credentialCardNo;
		/**
		 * 当前状态：无办理人信息：1001 办理人已填写：1002 已收到资料: 1003 已审核完成: 1004 已送签:1005 结果已返回: 1006 已预约面试: 1007 处理中:1008 已中止办理：1010
		 */
		@ApiField("current_status")
		private Long currentStatus;
		/**
		 * 当前状态：1001,1002,1003,1004,1005,1006,1007,1008,1010
		 */
		@ApiField("current_status_desc")
		private String currentStatusDesc;
		/**
		 * 是否达到最终状态
		 */
		@ApiField("disabled")
		private Boolean disabled;
		/**
		 * 中止状态
		 */
		@ApiField("finish_status")
		private Long finishStatus;
		/**
		 * 中止状态
		 */
		@ApiField("finish_status_desc")
		private String finishStatusDesc;
		/**
		 * 是否包含结束状态
		 */
		@ApiField("has_finish_status")
		private Boolean hasFinishStatus;
		/**
		 * 是否有下个状态
		 */
		@ApiField("has_next_status")
		private Boolean hasNextStatus;
		/**
		 * 姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 下一个状态：无办理人信息：1001 办理人已填写：1002 已收到资料: 1003 已审核完成: 1004 已送签:1005 结果已返回: 1006 已预约面试: 1007 处理中:1008 已中止办理：1010
		 */
		@ApiField("next_current_status")
		private Long nextCurrentStatus;
		/**
		 * 下一个状态描述：无办理人信息：1001 办理人已填写：1002 已收到资料: 1003 已审核完成: 1004 已送签:1005 结果已返回: 1006 已预约面试: 1007 处理中:1008 已中止办理：1010
		 */
		@ApiField("next_current_status_desc")
		private String nextCurrentStatusDesc;
		/**
		 * 是否出签，为空则买家没有反馈，1 表示出签，0 表示拒签，-1 表示未办理
		 */
		@ApiField("pass")
		private Long pass;
		/**
		 * 用户id
		 */
		@ApiField("person_visa_id")
		private Long personVisaId;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
	

	public Long getBizOrderId() {
			return this.bizOrderId;
		}
		public void setBizOrderId(Long bizOrderId) {
			this.bizOrderId = bizOrderId;
		}
		public String getCredentialCardInfor() {
			return this.credentialCardInfor;
		}
		public void setCredentialCardInfor(String credentialCardInfor) {
			this.credentialCardInfor = credentialCardInfor;
		}
		public String getCredentialCardNo() {
			return this.credentialCardNo;
		}
		public void setCredentialCardNo(String credentialCardNo) {
			this.credentialCardNo = credentialCardNo;
		}
		public Long getCurrentStatus() {
			return this.currentStatus;
		}
		public void setCurrentStatus(Long currentStatus) {
			this.currentStatus = currentStatus;
		}
		public String getCurrentStatusDesc() {
			return this.currentStatusDesc;
		}
		public void setCurrentStatusDesc(String currentStatusDesc) {
			this.currentStatusDesc = currentStatusDesc;
		}
		public Boolean getDisabled() {
			return this.disabled;
		}
		public void setDisabled(Boolean disabled) {
			this.disabled = disabled;
		}
		public Long getFinishStatus() {
			return this.finishStatus;
		}
		public void setFinishStatus(Long finishStatus) {
			this.finishStatus = finishStatus;
		}
		public String getFinishStatusDesc() {
			return this.finishStatusDesc;
		}
		public void setFinishStatusDesc(String finishStatusDesc) {
			this.finishStatusDesc = finishStatusDesc;
		}
		public Boolean getHasFinishStatus() {
			return this.hasFinishStatus;
		}
		public void setHasFinishStatus(Boolean hasFinishStatus) {
			this.hasFinishStatus = hasFinishStatus;
		}
		public Boolean getHasNextStatus() {
			return this.hasNextStatus;
		}
		public void setHasNextStatus(Boolean hasNextStatus) {
			this.hasNextStatus = hasNextStatus;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getNextCurrentStatus() {
			return this.nextCurrentStatus;
		}
		public void setNextCurrentStatus(Long nextCurrentStatus) {
			this.nextCurrentStatus = nextCurrentStatus;
		}
		public String getNextCurrentStatusDesc() {
			return this.nextCurrentStatusDesc;
		}
		public void setNextCurrentStatusDesc(String nextCurrentStatusDesc) {
			this.nextCurrentStatusDesc = nextCurrentStatusDesc;
		}
		public Long getPass() {
			return this.pass;
		}
		public void setPass(Long pass) {
			this.pass = pass;
		}
		public Long getPersonVisaId() {
			return this.personVisaId;
		}
		public void setPersonVisaId(Long personVisaId) {
			this.personVisaId = personVisaId;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}

}

	/**
 * 结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class NormalVisaDetailInfo extends TaobaoObject {

	private static final long serialVersionUID = 8216694757941116879L;

	/**
		 * 结束状态
		 */
		@ApiField("end_status")
		private Long endStatus;
		/**
		 * 结束状态描述
		 */
		@ApiField("end_status_desc")
		private String endStatusDesc;
		/**
		 * 用户信息数组
		 */
		@ApiListField("n_visa_detail_person_result_v_o_list")
		@ApiField("normal_visa_person_detail_vo")
		private List<NormalVisaPersonDetailVo> nVisaDetailPersonResultVOList;
		/**
		 * 1:贴纸签 2:电子签 3:面试
		 */
		@ApiField("visa_type")
		private Long visaType;
	

	public Long getEndStatus() {
			return this.endStatus;
		}
		public void setEndStatus(Long endStatus) {
			this.endStatus = endStatus;
		}
		public String getEndStatusDesc() {
			return this.endStatusDesc;
		}
		public void setEndStatusDesc(String endStatusDesc) {
			this.endStatusDesc = endStatusDesc;
		}
		public List<NormalVisaPersonDetailVo> getnVisaDetailPersonResultVOList() {
			return this.nVisaDetailPersonResultVOList;
		}
		public void setnVisaDetailPersonResultVOList(List<NormalVisaPersonDetailVo> nVisaDetailPersonResultVOList) {
			this.nVisaDetailPersonResultVOList = nVisaDetailPersonResultVOList;
		}
		public Long getVisaType() {
			return this.visaType;
		}
		public void setVisaType(Long visaType) {
			this.visaType = visaType;
		}

}

	/**
 * 结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ResultSet extends TaobaoObject {

	private static final long serialVersionUID = 8168448639752336251L;

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
		@ApiField("normal_visa_detail_info")
		private List<NormalVisaDetailInfo> results;
		/**
		 * 结果
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
		public List<NormalVisaDetailInfo> getResults() {
			return this.results;
		}
		public void setResults(List<NormalVisaDetailInfo> results) {
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
