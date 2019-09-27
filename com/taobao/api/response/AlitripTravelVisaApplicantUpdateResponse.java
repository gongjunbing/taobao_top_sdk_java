package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alitrip.travel.visa.applicant.update response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlitripTravelVisaApplicantUpdateResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6774332289379979845L;

	/** 
	 * 该订单上已经上传的申请人列表信息
	 */
	@ApiListField("applicants")
	@ApiField("normal_visa_applicant_info")
	private List<NormalVisaApplicantInfo> applicants;

	/** 
	 * 申请人状态更新是否成功
	 */
	@ApiField("update_result")
	private Boolean updateResult;


	public void setApplicants(List<NormalVisaApplicantInfo> applicants) {
		this.applicants = applicants;
	}
	public List<NormalVisaApplicantInfo> getApplicants( ) {
		return this.applicants;
	}

	public void setUpdateResult(Boolean updateResult) {
		this.updateResult = updateResult;
	}
	public Boolean getUpdateResult( ) {
		return this.updateResult;
	}
	
	/**
 * 该订单上已经上传的申请人列表信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class NormalVisaApplicantInfo extends TaobaoObject {

	private static final long serialVersionUID = 8651661577267841613L;

	/**
		 * 申请人id
		 */
		@ApiField("apply_id")
		private String applyId;
		/**
		 * 申请人护照号
		 */
		@ApiField("cert_no")
		private String certNo;
	

	public String getApplyId() {
			return this.applyId;
		}
		public void setApplyId(String applyId) {
			this.applyId = applyId;
		}
		public String getCertNo() {
			return this.certNo;
		}
		public void setCertNo(String certNo) {
			this.certNo = certNo;
		}

}



}
