package com.taobao.api.response;

import java.util.Date;
import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.files.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class FilesGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1769948243884564664L;

	/** 
	 * results
	 */
	@ApiListField("results")
	@ApiField("top_download_record_do")
	private List<TopDownloadRecordDo> results;


	public void setResults(List<TopDownloadRecordDo> results) {
		this.results = results;
	}
	public List<TopDownloadRecordDo> getResults( ) {
		return this.results;
	}
	
	/**
 * results
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class TopDownloadRecordDo extends TaobaoObject {

	private static final long serialVersionUID = 1857121856313436672L;

	/**
		 * 文件创建时间
		 */
		@ApiField("created")
		private Date created;
		/**
		 * 下载链接状态。1:未下载。2:已下载
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 下载链接
		 */
		@ApiField("url")
		private String url;
	

	public Date getCreated() {
			return this.created;
		}
		public void setCreated(Date created) {
			this.created = created;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getUrl() {
			return this.url;
		}
		public void setUrl(String url) {
			this.url = url;
		}

}



}
