package com.taobao.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.json.JSONWriter;
import com.taobao.api.response.AlitripTravelVisaApplicantUpdateResponse;

/**
 * TOP API: alitrip.travel.visa.applicant.update request
 * 
 * @author top auto create
 * @since 1.0, 2018.04.08
 */
public class AlitripTravelVisaApplicantUpdateRequest extends BaseTaobaoRequest<AlitripTravelVisaApplicantUpdateResponse> implements TaobaoUploadRequest<AlitripTravelVisaApplicantUpdateResponse> {

	
	

	/** 
	* 特殊必填，申请人基本信息（证件号，姓名，手机号）列表。当operType为1或2时必填
	 */
	private String applicantInfos;

	/** 
	* 特殊必填，签证申请人进度推进操作（目前只支持对单个申请人状态进行推进）。当operType为3时必填
	 */
	private String applicantOp;

	/** 
	* 特殊必填，pdf文件字节流。用于上传电子签pdf结果 或者 预约面试信pdf文件。
	 */
	private FileItem fileBytes;

	/** 
	* 必填，操作类型。1-上传新申请人基本信息（商家代填申请人），2-更新已有申请人基本信息，3-更新已有申请人的签证进度
	 */
	private Long operType;

	/** 
	* 必填，子订单id
	 */
	private String subOrderId;

	public void setApplicantInfos(String applicantInfos) {
		this.applicantInfos = applicantInfos;
	}

	public void setApplicantInfos(List<NormalVisaApplicantInfo> applicantInfos) {
		this.applicantInfos = new JSONWriter(false,true).write(applicantInfos);
	}

	public String getApplicantInfos() {
		return this.applicantInfos;
	}

	public void setApplicantOp(String applicantOp) {
		this.applicantOp = applicantOp;
	}

	public void setApplicantOp(NormalVisaApplicantOperation applicantOp) {
		this.applicantOp = new JSONWriter(false,true).write(applicantOp);
	}

	public String getApplicantOp() {
		return this.applicantOp;
	}

	public void setFileBytes(FileItem fileBytes) {
		this.fileBytes = fileBytes;
	}

	public FileItem getFileBytes() {
		return this.fileBytes;
	}

	public void setOperType(Long operType) {
		this.operType = operType;
	}

	public Long getOperType() {
		return this.operType;
	}

	public void setSubOrderId(String subOrderId) {
		this.subOrderId = subOrderId;
	}

	public String getSubOrderId() {
		return this.subOrderId;
	}

	public String getApiMethodName() {
		return "alitrip.travel.visa.applicant.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("applicant_infos", this.applicantInfos);
		txtParams.put("applicant_op", this.applicantOp);
		txtParams.put("oper_type", this.operType);
		txtParams.put("sub_order_id", this.subOrderId);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlitripTravelVisaApplicantUpdateResponse> getResponseClass() {
		return AlitripTravelVisaApplicantUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkObjectMaxListSize(applicantInfos, 50, "applicantInfos");
		RequestCheckUtils.checkNotEmpty(operType, "operType");
		RequestCheckUtils.checkNotEmpty(subOrderId, "subOrderId");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("file_bytes", this.fileBytes);
		return params;
	}
	
		/**
 * 特殊必填，申请人基本信息（证件号，姓名，手机号）列表。当operType为1或2时必填
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class NormalVisaApplicantInfo extends TaobaoObject {

	private static final long serialVersionUID = 4836373925656151592L;

	/**
		 * 可选，申请人ID。更新申请人基本信息时必填，新增申请人信息时不用填
		 */
		@ApiField("apply_id")
		private String applyId;
		/**
		 * 证件号（护照、入台证等），新增申请人时必填
		 */
		@ApiField("cert_no")
		private String certNo;
		/**
		 * 名，新增申请人时必填
		 */
		@ApiField("given_name")
		private String givenName;
		/**
		 * 手机号，新增申请人时必填
		 */
		@ApiField("mobile")
		private String mobile;
		/**
		 * 姓，新增申请人时必填
		 */
		@ApiField("surname")
		private String surname;
	

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
		public String getGivenName() {
			return this.givenName;
		}
		public void setGivenName(String givenName) {
			this.givenName = givenName;
		}
		public String getMobile() {
			return this.mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getSurname() {
			return this.surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}

}

	/**
 * 特殊必填，上传该申请人 签证结果寄回物流信息。当status值为1013（已寄回结果）时，必填
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class NormalVisaLogisticsInfo extends TaobaoObject {

	private static final long serialVersionUID = 8346685149827848268L;

	/**
		 * 必填，物流公司编码
		 */
		@ApiField("post_company_code")
		private String postCompanyCode;
		/**
		 * 必填，物流公司名称
		 */
		@ApiField("post_company_name")
		private String postCompanyName;
		/**
		 * 必填，物流号
		 */
		@ApiField("post_number")
		private String postNumber;
	

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

}

	/**
 * 特殊必填，上传该申请人 电子签结果。当该签证为电子签证且status值为1006（已收到签证结果）时 必填
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class NormalVisaEtaInfo extends TaobaoObject {

	private static final long serialVersionUID = 2498994373492135655L;

	/**
		 * 必填，电子签pdf文件名称。具体的pdf文件字节流信息请设置到父级参数的 fileBytes字段！！！
		 */
		@ApiField("file_name")
		private String fileName;
	

	public String getFileName() {
			return this.fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

}

	/**
 * 特殊必填，上传该申请人 预约面试信息。当status值为1007（已预约面试）时 必填
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class NormalVisaAppointmentInfo extends TaobaoObject {

	private static final long serialVersionUID = 2324263951923254178L;

	/**
		 * 必填，预约面试信pdf文件名称。具体的pdf文件字节流信息请设置到父级参数的 fileBytes字段！！！
		 */
		@ApiField("book_file_name")
		private String bookFileName;
		/**
		 * 必填，预约地点
		 */
		@ApiField("book_place")
		private String bookPlace;
		/**
		 * 必填，预约时间，格式：yyyy-MM-dd hh:mm:ss
		 */
		@ApiField("book_time")
		private String bookTime;
	

	public String getBookFileName() {
			return this.bookFileName;
		}
		public void setBookFileName(String bookFileName) {
			this.bookFileName = bookFileName;
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

}

	/**
 * 特殊必填，签证申请人进度推进操作（目前只支持对单个申请人状态进行推进）。当operType为3时必填
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class NormalVisaApplicantOperation extends TaobaoObject {

	private static final long serialVersionUID = 2418724289875553161L;

	/**
		 * 必填，申请人ID
		 */
		@ApiField("apply_id")
		private String applyId;
		/**
		 * 特殊必填，上传该申请人 预约面试信息。当status值为1007（已预约面试）时 必填
		 */
		@ApiField("appointment_info")
		private NormalVisaAppointmentInfo appointmentInfo;
		/**
		 * 特殊必填，上传该申请人 电子签结果。当该签证为电子签证且status值为1006（已收到签证结果）时 必填
		 */
		@ApiField("eta_info")
		private NormalVisaEtaInfo etaInfo;
		/**
		 * 特殊必填，上传该申请人 签证结果寄回物流信息。当status值为1013（已寄回结果）时，必填
		 */
		@ApiField("logistics_info")
		private NormalVisaLogisticsInfo logisticsInfo;
		/**
		 * 可选，备注
		 */
		@ApiField("remark")
		private String remark;
		/**
		 * 必填，申请人状态推进，本次操作需要推进到的目标状态。具体状态值枚举及推进流程详见：https://open.alitrip.com/docs/doc.htm?spm=a21tt.7629140.0.0.fYvMkZ&docType=1&articleId=108046&previewCode=9D5F931C2254C7B3FE16B8DB7F9CECB4
		 */
		@ApiField("status")
		private Long status;
	

	public String getApplyId() {
			return this.applyId;
		}
		public void setApplyId(String applyId) {
			this.applyId = applyId;
		}
		public NormalVisaAppointmentInfo getAppointmentInfo() {
			return this.appointmentInfo;
		}
		public void setAppointmentInfo(NormalVisaAppointmentInfo appointmentInfo) {
			this.appointmentInfo = appointmentInfo;
		}
		public NormalVisaEtaInfo getEtaInfo() {
			return this.etaInfo;
		}
		public void setEtaInfo(NormalVisaEtaInfo etaInfo) {
			this.etaInfo = etaInfo;
		}
		public NormalVisaLogisticsInfo getLogisticsInfo() {
			return this.logisticsInfo;
		}
		public void setLogisticsInfo(NormalVisaLogisticsInfo logisticsInfo) {
			this.logisticsInfo = logisticsInfo;
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