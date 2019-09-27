package com.taobao.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.AlitripTravelNormalvisaUpdatepersonstautsResponse;

/**
 * TOP API: taobao.alitrip.travel.normalvisa.updatepersonstauts request
 * 
 * @author top auto create
 * @since 1.0, 2018.01.08
 */
public class AlitripTravelNormalvisaUpdatepersonstautsRequest extends BaseTaobaoRequest<AlitripTravelNormalvisaUpdatepersonstautsResponse> {
	
	

	/** 
	* 订单号
	 */
	private Long bizOrderId;

	/** 
	* 更新信息
	 */
	private String normalVisaUpdateUnitList;

	public void setBizOrderId(Long bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public Long getBizOrderId() {
		return this.bizOrderId;
	}

	public void setNormalVisaUpdateUnitList(String normalVisaUpdateUnitList) {
		this.normalVisaUpdateUnitList = normalVisaUpdateUnitList;
	}

	public void setNormalVisaUpdateUnitList(List<NormalVisaUpdateUnit> normalVisaUpdateUnitList) {
		this.normalVisaUpdateUnitList = new JSONWriter(false,true).write(normalVisaUpdateUnitList);
	}

	public String getNormalVisaUpdateUnitList() {
		return this.normalVisaUpdateUnitList;
	}

	public String getApiMethodName() {
		return "taobao.alitrip.travel.normalvisa.updatepersonstauts";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_order_id", this.bizOrderId);
		txtParams.put("normal_visa_update_unit_list", this.normalVisaUpdateUnitList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlitripTravelNormalvisaUpdatepersonstautsResponse> getResponseClass() {
		return AlitripTravelNormalvisaUpdatepersonstautsResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizOrderId, "bizOrderId");
		RequestCheckUtils.checkObjectMaxListSize(normalVisaUpdateUnitList, 100, "normalVisaUpdateUnitList");
	}
	
	/**
 * 更新信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class NormalVisaUpdateUnit extends TaobaoObject {

	private static final long serialVersionUID = 6844297131783998876L;

	/**
		 * 订单号
		 */
		@ApiField("biz_order_id")
		private Long bizOrderId;
		/**
		 * 预约地点
		 */
		@ApiField("book_place")
		private String bookPlace;
		/**
		 * 预约时间
		 */
		@ApiField("book_time")
		private String bookTime;
		/**
		 * 用户id
		 */
		@ApiField("person_visa_id")
		private Long personVisaId;
		/**
		 * 物流公司编码
		 */
		@ApiField("post_company_code")
		private String postCompanyCode;
		/**
		 * 物流公司名称
		 */
		@ApiField("post_company_name")
		private String postCompanyName;
		/**
		 * 物流单号
		 */
		@ApiField("post_number")
		private String postNumber;
		/**
		 * 备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 状态：无办理人信息（1001），办理人已填写（1002），已收到资料（1003），已审核完成（1004），已送签（1005），结果已返回（1006），已预约面试（1007  ），处理中（1008），买家已填写反馈信息（1009），已中止办理（1010）
		 */
		@ApiField("status")
		private Long status;
	

	public Long getBizOrderId() {
			return this.bizOrderId;
		}
		public void setBizOrderId(Long bizOrderId) {
			this.bizOrderId = bizOrderId;
		}
		public String getBookPlace() {
			return this.bookPlace;
		}
		public void setBookPlace(String bookPlace) {
			this.bookPlace = bookPlace;
		}
		public String getBookTime() {
			return this.bookTime;
		}
		public void setBookTime(String bookTime) {
			this.bookTime = bookTime;
		}
		public Long getPersonVisaId() {
			return this.personVisaId;
		}
		public void setPersonVisaId(Long personVisaId) {
			this.personVisaId = personVisaId;
		}
		public String getPostCompanyCode() {
			return this.postCompanyCode;
		}
		public void setPostCompanyCode(String postCompanyCode) {
			this.postCompanyCode = postCompanyCode;
		}
		public String getPostCompanyName() {
			return this.postCompanyName;
		}
		public void setPostCompanyName(String postCompanyName) {
			this.postCompanyName = postCompanyName;
		}
		public String getPostNumber() {
			return this.postNumber;
		}
		public void setPostNumber(String postNumber) {
			this.postNumber = postNumber;
		}
		public String getRemark() {
			return this.remark;
		}
		public void setRemark(String remark) {
			this.remark = remark;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}

}


}