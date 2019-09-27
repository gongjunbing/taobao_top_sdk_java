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
import com.taobao.api.response.AlitripTravelNormalvisaStoreuserResponse;

/**
 * TOP API: taobao.alitrip.travel.normalvisa.storeuser request
 * 
 * @author top auto create
 * @since 1.0, 2017.07.24
 */
public class AlitripTravelNormalvisaStoreuserRequest extends BaseTaobaoRequest<AlitripTravelNormalvisaStoreuserResponse> {
	
	

	/** 
	* 订单id
	 */
	private Long bizOrderId;

	/** 
	* 列表：签证人信息列表
	 */
	private String normalVisaUserUnitList;

	public void setBizOrderId(Long bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public Long getBizOrderId() {
		return this.bizOrderId;
	}

	public void setNormalVisaUserUnitList(String normalVisaUserUnitList) {
		this.normalVisaUserUnitList = normalVisaUserUnitList;
	}

	public void setNormalVisaUserUnitList(List<NormalVisaUserUnit> normalVisaUserUnitList) {
		this.normalVisaUserUnitList = new JSONWriter(false,true).write(normalVisaUserUnitList);
	}

	public String getNormalVisaUserUnitList() {
		return this.normalVisaUserUnitList;
	}

	public String getApiMethodName() {
		return "taobao.alitrip.travel.normalvisa.storeuser";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_order_id", this.bizOrderId);
		txtParams.put("normal_visa_user_unit_list", this.normalVisaUserUnitList);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlitripTravelNormalvisaStoreuserResponse> getResponseClass() {
		return AlitripTravelNormalvisaStoreuserResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(bizOrderId, "bizOrderId");
		RequestCheckUtils.checkObjectMaxListSize(normalVisaUserUnitList, 100, "normalVisaUserUnitList");
	}
	
	/**
 * 列表：签证人信息列表
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class NormalVisaUserUnit extends TaobaoObject {

	private static final long serialVersionUID = 6735834235133939757L;

	/**
		 * 名
		 */
		@ApiField("first_name")
		private String firstName;
		/**
		 * 姓
		 */
		@ApiField("last_name")
		private String lastName;
		/**
		 * 护照号
		 */
		@ApiField("passport_number")
		private String passportNumber;
	

	public String getFirstName() {
			return this.firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return this.lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getPassportNumber() {
			return this.passportNumber;
		}
		public void setPassportNumber(String passportNumber) {
			this.passportNumber = passportNumber;
		}

}


}