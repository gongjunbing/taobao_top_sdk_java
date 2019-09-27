package com.taobao.api.response;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alitrip.travel.refund.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlitripTravelRefundGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 6558632978357254368L;

	/** 
	 * 退款数据模型
	 */
	@ApiField("first_result")
	private TopRefundDo firstResult;


	public void setFirstResult(TopRefundDo firstResult) {
		this.firstResult = firstResult;
	}
	public TopRefundDo getFirstResult( ) {
		return this.firstResult;
	}
	
	/**
 * 留言备忘List
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class TopRefundMemo extends TaobaoObject {

	private static final long serialVersionUID = 6798887753656755191L;

	/**
		 * 买家退款描述
		 */
		@ApiField("buyer_refund_desc")
		private String buyerRefundDesc;
		/**
		 * 买家退款原因
		 */
		@ApiField("buyer_refund_reason")
		private String buyerRefundReason;
		/**
		 * memo创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * memo内容
		 */
		@ApiField("memo")
		private String memo;
		/**
		 * 操作角色（1-买家；2-卖家；3-小二；4-系统超时；5-买家确认服务完成；6-系统被动关闭退款单）
		 */
		@ApiField("operator_role")
		private Long operatorRole;
		/**
		 * 子订单id
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 退款id
		 */
		@ApiField("refund_id")
		private Long refundId;
		/**
		 * 卖家拒绝退款理由
		 */
		@ApiField("seller_refuse_reason")
		private String sellerRefuseReason;
	

	public String getBuyerRefundDesc() {
			return this.buyerRefundDesc;
		}
		public void setBuyerRefundDesc(String buyerRefundDesc) {
			this.buyerRefundDesc = buyerRefundDesc;
		}
		public String getBuyerRefundReason() {
			return this.buyerRefundReason;
		}
		public void setBuyerRefundReason(String buyerRefundReason) {
			this.buyerRefundReason = buyerRefundReason;
		}
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public String getMemo() {
			return this.memo;
		}
		public void setMemo(String memo) {
			this.memo = memo;
		}
		public Long getOperatorRole() {
			return this.operatorRole;
		}
		public void setOperatorRole(Long operatorRole) {
			this.operatorRole = operatorRole;
		}
		public Long getOrderId() {
			return this.orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public Long getRefundId() {
			return this.refundId;
		}
		public void setRefundId(Long refundId) {
			this.refundId = refundId;
		}
		public String getSellerRefuseReason() {
			return this.sellerRefuseReason;
		}
		public void setSellerRefuseReason(String sellerRefuseReason) {
			this.sellerRefuseReason = sellerRefuseReason;
		}

}

	/**
 * 退款数据模型
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class TopRefundDo extends TaobaoObject {

	private static final long serialVersionUID = 4561595697933152829L;

	/**
		 * 买家昵称
		 */
		@ApiField("buyer_nick")
		private String buyerNick;
		/**
		 * 退款类型（1-售中，2-售后）
		 */
		@ApiField("dispute_type")
		private Long disputeType;
		/**
		 * 是否紧急退款单
		 */
		@ApiField("emergency")
		private Boolean emergency;
		/**
		 * 退款单创建时间
		 */
		@ApiField("gmt_create")
		private Date gmtCreate;
		/**
		 * 退款单修改时间
		 */
		@ApiField("gmt_modified")
		private Date gmtModified;
		/**
		 * 留言备忘List
		 */
		@ApiListField("memo_list")
		@ApiField("top_refund_memo")
		private List<TopRefundMemo> memoList;
		/**
		 * 子订单id
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * 退款原因id
		 */
		@ApiField("reason_id")
		private Long reasonId;
		/**
		 * 退款原因文案
		 */
		@ApiField("reason_text")
		private String reasonText;
		/**
		 * 退款描述
		 */
		@ApiField("refund_desc")
		private String refundDesc;
		/**
		 * 退款金额（单位分）
		 */
		@ApiField("refund_fee")
		private Long refundFee;
		/**
		 * 退款id
		 */
		@ApiField("refund_id")
		private Long refundId;
		/**
		 * 退款状态（1表示“买家已申请退款，等待卖家同意”；4表示“退款关闭”；5表示“退款成功”；6表示“卖家拒绝退款”）
		 */
		@ApiField("refund_status")
		private Long refundStatus;
		/**
		 * 卖家昵称
		 */
		@ApiField("seller_nick")
		private String sellerNick;
		/**
		 * 超时时间（退款状态为1时，表示卖家不处理，自动同意退款的时间点；退款状态为6时，表示买家不修改，自动取消退款的时间点）
		 */
		@ApiField("timeout_time")
		private Date timeoutTime;
		/**
		 * 买家实付款（单位分）
		 */
		@ApiField("total_fee")
		private Long totalFee;
		/**
		 * 版本号
		 */
		@ApiField("version")
		private Long version;
	

	public String getBuyerNick() {
			return this.buyerNick;
		}
		public void setBuyerNick(String buyerNick) {
			this.buyerNick = buyerNick;
		}
		public Long getDisputeType() {
			return this.disputeType;
		}
		public void setDisputeType(Long disputeType) {
			this.disputeType = disputeType;
		}
		public Boolean getEmergency() {
			return this.emergency;
		}
		public void setEmergency(Boolean emergency) {
			this.emergency = emergency;
		}
		public Date getGmtCreate() {
			return this.gmtCreate;
		}
		public void setGmtCreate(Date gmtCreate) {
			this.gmtCreate = gmtCreate;
		}
		public Date getGmtModified() {
			return this.gmtModified;
		}
		public void setGmtModified(Date gmtModified) {
			this.gmtModified = gmtModified;
		}
		public List<TopRefundMemo> getMemoList() {
			return this.memoList;
		}
		public void setMemoList(List<TopRefundMemo> memoList) {
			this.memoList = memoList;
		}
		public Long getOrderId() {
			return this.orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public Long getReasonId() {
			return this.reasonId;
		}
		public void setReasonId(Long reasonId) {
			this.reasonId = reasonId;
		}
		public String getReasonText() {
			return this.reasonText;
		}
		public void setReasonText(String reasonText) {
			this.reasonText = reasonText;
		}
		public String getRefundDesc() {
			return this.refundDesc;
		}
		public void setRefundDesc(String refundDesc) {
			this.refundDesc = refundDesc;
		}
		public Long getRefundFee() {
			return this.refundFee;
		}
		public void setRefundFee(Long refundFee) {
			this.refundFee = refundFee;
		}
		public Long getRefundId() {
			return this.refundId;
		}
		public void setRefundId(Long refundId) {
			this.refundId = refundId;
		}
		public Long getRefundStatus() {
			return this.refundStatus;
		}
		public void setRefundStatus(Long refundStatus) {
			this.refundStatus = refundStatus;
		}
		public String getSellerNick() {
			return this.sellerNick;
		}
		public void setSellerNick(String sellerNick) {
			this.sellerNick = sellerNick;
		}
		public Date getTimeoutTime() {
			return this.timeoutTime;
		}
		public void setTimeoutTime(Date timeoutTime) {
			this.timeoutTime = timeoutTime;
		}
		public Long getTotalFee() {
			return this.totalFee;
		}
		public void setTotalFee(Long totalFee) {
			this.totalFee = totalFee;
		}
		public Long getVersion() {
			return this.version;
		}
		public void setVersion(Long version) {
			this.version = version;
		}

}



}
