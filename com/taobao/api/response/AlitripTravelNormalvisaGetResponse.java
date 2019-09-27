package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.alitrip.travel.normalvisa.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlitripTravelNormalvisaGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6426399483237816851L;

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
 * 结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class NormalVisaInfo extends TaobaoObject {

	private static final long serialVersionUID = 4525693638366111765L;

	/**
		 * 数量
		 */
		@ApiField("amount")
		private Long amount;
		/**
		 * 单价
		 */
		@ApiField("auction_price")
		private String auctionPrice;
		/**
		 * 订单号
		 */
		@ApiField("biz_order_id")
		private Long bizOrderId;
		/**
		 * 买家昵称
		 */
		@ApiField("buyer_nick")
		private String buyerNick;
		/**
		 * 国家id，国家编码详见：https://open.alitrip.com/docs/doc.htm?spm=a21tt.7629140.0.0.retXmq&treeId=79&articleId=104840&docType=1
		 */
		@ApiField("country_id")
		private String countryId;
		/**
		 * 是否达到中止状态
		 */
		@ApiField("end_status")
		private Boolean endStatus;
		/**
		 * 是否需要商家代填
		 */
		@ApiField("need_fill_contact")
		private Boolean needFillContact;
		/**
		 * 1:贴纸签  2:电子签  3:面试
		 */
		@ApiField("normal_visa_type")
		private Long normalVisaType;
		/**
		 * 支付时间
		 */
		@ApiField("pay_time")
		private String payTime;
		/**
		 * 卖家昵称
		 */
		@ApiField("seller_nick")
		private String sellerNick;
		/**
		 * 无办理人信息：1001 办理人已填写：1002 已收到资料: 1003 已审核完成: 1004 已送签:1005 结果已返回: 1006 已预约面试: 1007 处理中:1008 已中止办理：1010
		 */
		@ApiField("status")
		private Long status;
		/**
		 * 无办理人信息：1001 办理人已填写：1002 已收到资料: 1003 已审核完成: 1004 已送签:1005 结果已返回: 1006 已预约面试: 1007 处理中:1008 已中止办理：1010
		 */
		@ApiField("status_desc")
		private String statusDesc;
		/**
		 * 标题
		 */
		@ApiField("title")
		private String title;
	

	public Long getAmount() {
			return this.amount;
		}
		public void setAmount(Long amount) {
			this.amount = amount;
		}
		public String getAuctionPrice() {
			return this.auctionPrice;
		}
		public void setAuctionPrice(String auctionPrice) {
			this.auctionPrice = auctionPrice;
		}
		public Long getBizOrderId() {
			return this.bizOrderId;
		}
		public void setBizOrderId(Long bizOrderId) {
			this.bizOrderId = bizOrderId;
		}
		public String getBuyerNick() {
			return this.buyerNick;
		}
		public void setBuyerNick(String buyerNick) {
			this.buyerNick = buyerNick;
		}
		public String getCountryId() {
			return this.countryId;
		}
		public void setCountryId(String countryId) {
			this.countryId = countryId;
		}
		public Boolean getEndStatus() {
			return this.endStatus;
		}
		public void setEndStatus(Boolean endStatus) {
			this.endStatus = endStatus;
		}
		public Boolean getNeedFillContact() {
			return this.needFillContact;
		}
		public void setNeedFillContact(Boolean needFillContact) {
			this.needFillContact = needFillContact;
		}
		public Long getNormalVisaType() {
			return this.normalVisaType;
		}
		public void setNormalVisaType(Long normalVisaType) {
			this.normalVisaType = normalVisaType;
		}
		public String getPayTime() {
			return this.payTime;
		}
		public void setPayTime(String payTime) {
			this.payTime = payTime;
		}
		public String getSellerNick() {
			return this.sellerNick;
		}
		public void setSellerNick(String sellerNick) {
			this.sellerNick = sellerNick;
		}
		public Long getStatus() {
			return this.status;
		}
		public void setStatus(Long status) {
			this.status = status;
		}
		public String getStatusDesc() {
			return this.statusDesc;
		}
		public void setStatusDesc(String statusDesc) {
			this.statusDesc = statusDesc;
		}
		public String getTitle() {
			return this.title;
		}
		public void setTitle(String title) {
			this.title = title;
		}

}

	/**
 * 结果
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class ResultSet extends TaobaoObject {

	private static final long serialVersionUID = 3443522528969229915L;

	/**
		 * 结果
		 */
		@ApiListField("results")
		@ApiField("normal_visa_info")
		private List<NormalVisaInfo> results;
		/**
		 * 结果数目
		 */
		@ApiField("total_results")
		private Long totalResults;
	

	public List<NormalVisaInfo> getResults() {
			return this.results;
		}
		public void setResults(List<NormalVisaInfo> results) {
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
