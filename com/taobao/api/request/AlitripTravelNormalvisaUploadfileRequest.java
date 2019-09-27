package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.HashMap;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlitripTravelNormalvisaUploadfileResponse;

/**
 * TOP API: taobao.alitrip.travel.normalvisa.uploadfile request
 * 
 * @author top auto create
 * @since 1.0, 2017.11.29
 */
public class AlitripTravelNormalvisaUploadfileRequest extends BaseTaobaoRequest<AlitripTravelNormalvisaUploadfileResponse> implements TaobaoUploadRequest<AlitripTravelNormalvisaUploadfileResponse> {

	
	

	/** 
	* 订单id
	 */
	private Long bizOrderId;

	/** 
	* 文件
	 */
	private FileItem fileBytes;

	/** 
	* 文件名：注意文件名请保证和上传的文件一直
	 */
	private String fileName;

	public void setBizOrderId(Long bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public Long getBizOrderId() {
		return this.bizOrderId;
	}

	public void setFileBytes(FileItem fileBytes) {
		this.fileBytes = fileBytes;
	}

	public FileItem getFileBytes() {
		return this.fileBytes;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return this.fileName;
	}

	public String getApiMethodName() {
		return "taobao.alitrip.travel.normalvisa.uploadfile";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("biz_order_id", this.bizOrderId);
		txtParams.put("file_name", this.fileName);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlitripTravelNormalvisaUploadfileResponse> getResponseClass() {
		return AlitripTravelNormalvisaUploadfileResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(bizOrderId, "bizOrderId");
		RequestCheckUtils.checkNotEmpty(fileBytes, "fileBytes");
		RequestCheckUtils.checkNotEmpty(fileName, "fileName");
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("file_bytes", this.fileBytes);
		return params;
	}
	
	

}