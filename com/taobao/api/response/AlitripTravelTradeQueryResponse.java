package com.taobao.api.response;

import java.util.List;
import java.util.Date;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alitrip.travel.trade.query response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlitripTravelTradeQueryResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8821871622436933214L;

	/** 
	 * 交易主订单详情
	 */
	@ApiField("first_result")
	private TopTripOrderResult firstResult;


	public void setFirstResult(TopTripOrderResult firstResult) {
		this.firstResult = firstResult;
	}
	public TopTripOrderResult getFirstResult( ) {
		return this.firstResult;
	}
	
	/**
 * 主订单支付信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class PayInfo extends TaobaoObject {

	private static final long serialVersionUID = 3456824117182152496L;

	/**
		 * 支付宝交易号
		 */
		@ApiField("alipay_no")
		private String alipayNo;
		/**
		 * 系统优惠金额（如打折，VIP，满就送等），精确到2位小数，单位：分。
		 */
		@ApiField("discount_fee")
		private Long discountFee;
		/**
		 * 订单付款时间
		 */
		@ApiField("pay_time")
		private Date payTime;
		/**
		 * 卖家实际收到的支付宝打款金额（由于子订单可以部分确认收货，这个金额会随着子订单的确认收货而不断增加，交易成功后等于买家实付款减去退款金额）。精确到2位小数;单位:分
		 */
		@ApiField("received_payment")
		private Long receivedPayment;
		/**
		 * 分阶段付款的已付金额
		 */
		@ApiField("step_paid_fee")
		private Long stepPaidFee;
		/**
		 * 分阶段付款的订单状态，目前有三返回状态FRONT_NOPAID_FINAL_NOPAID(定金未付尾款未付)，FRONT_PAID_FINAL_NOPAID(定金已付尾款未付)，FRONT_PAID_FINAL_PAID(定金和尾款都付)
		 */
		@ApiField("step_trade_status")
		private String stepTradeStatus;
	

	public String getAlipayNo() {
			return this.alipayNo;
		}
		public void setAlipayNo(String alipayNo) {
			this.alipayNo = alipayNo;
		}
		public Long getDiscountFee() {
			return this.discountFee;
		}
		public void setDiscountFee(Long discountFee) {
			this.discountFee = discountFee;
		}
		public Date getPayTime() {
			return this.payTime;
		}
		public void setPayTime(Date payTime) {
			this.payTime = payTime;
		}
		public Long getReceivedPayment() {
			return this.receivedPayment;
		}
		public void setReceivedPayment(Long receivedPayment) {
			this.receivedPayment = receivedPayment;
		}
		public Long getStepPaidFee() {
			return this.stepPaidFee;
		}
		public void setStepPaidFee(Long stepPaidFee) {
			this.stepPaidFee = stepPaidFee;
		}
		public String getStepTradeStatus() {
			return this.stepTradeStatus;
		}
		public void setStepTradeStatus(String stepTradeStatus) {
			this.stepTradeStatus = stepTradeStatus;
		}

}

	/**
 * 卖家信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class SellerInfo extends TaobaoObject {

	private static final long serialVersionUID = 4253894414926422138L;

	/**
		 * 卖家是否可以对订单进行评价
		 */
		@ApiField("seller_can_rate")
		private Boolean sellerCanRate;
		/**
		 * 卖家邮件地址
		 */
		@ApiField("seller_email")
		private String sellerEmail;
		/**
		 * 卖家备注旗帜（与淘宝网上订单的卖家备注旗帜对应，只有卖家才能查看该字段）红、黄、绿、蓝、紫 分别对应 1、2、3、4、5
		 */
		@ApiField("seller_flag")
		private Long sellerFlag;
		/**
		 * 卖家备注
		 */
		@ApiField("seller_memo")
		private String sellerMemo;
		/**
		 * 卖家姓名
		 */
		@ApiField("seller_name")
		private String sellerName;
		/**
		 * 卖家昵称
		 */
		@ApiField("seller_nick")
		private String sellerNick;
		/**
		 * 卖家联系方式
		 */
		@ApiField("seller_phone")
		private String sellerPhone;
		/**
		 * 卖家是否已评价。可选值:true(已评价),false(未评价)
		 */
		@ApiField("seller_rate")
		private Boolean sellerRate;
		/**
		 * 卖家店铺名称
		 */
		@ApiField("seller_shop")
		private String sellerShop;
	

	public Boolean getSellerCanRate() {
			return this.sellerCanRate;
		}
		public void setSellerCanRate(Boolean sellerCanRate) {
			this.sellerCanRate = sellerCanRate;
		}
		public String getSellerEmail() {
			return this.sellerEmail;
		}
		public void setSellerEmail(String sellerEmail) {
			this.sellerEmail = sellerEmail;
		}
		public Long getSellerFlag() {
			return this.sellerFlag;
		}
		public void setSellerFlag(Long sellerFlag) {
			this.sellerFlag = sellerFlag;
		}
		public String getSellerMemo() {
			return this.sellerMemo;
		}
		public void setSellerMemo(String sellerMemo) {
			this.sellerMemo = sellerMemo;
		}
		public String getSellerName() {
			return this.sellerName;
		}
		public void setSellerName(String sellerName) {
			this.sellerName = sellerName;
		}
		public String getSellerNick() {
			return this.sellerNick;
		}
		public void setSellerNick(String sellerNick) {
			this.sellerNick = sellerNick;
		}
		public String getSellerPhone() {
			return this.sellerPhone;
		}
		public void setSellerPhone(String sellerPhone) {
			this.sellerPhone = sellerPhone;
		}
		public Boolean getSellerRate() {
			return this.sellerRate;
		}
		public void setSellerRate(Boolean sellerRate) {
			this.sellerRate = sellerRate;
		}
		public String getSellerShop() {
			return this.sellerShop;
		}
		public void setSellerShop(String sellerShop) {
			this.sellerShop = sellerShop;
		}

}

	/**
 * 买家信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class BuyerInfo extends TaobaoObject {

	private static final long serialVersionUID = 3613749794329434459L;

	/**
		 * 买家邮件地址
		 */
		@ApiField("buyer_email")
		private String buyerEmail;
		/**
		 * 买家留言
		 */
		@ApiField("buyer_message")
		private String buyerMessage;
		/**
		 * 买家昵称
		 */
		@ApiField("buyer_nick")
		private String buyerNick;
		/**
		 * 买家联系方式
		 */
		@ApiField("buyer_phone")
		private String buyerPhone;
		/**
		 * 买家是否已评价
		 */
		@ApiField("buyer_rate")
		private Boolean buyerRate;
	

	public String getBuyerEmail() {
			return this.buyerEmail;
		}
		public void setBuyerEmail(String buyerEmail) {
			this.buyerEmail = buyerEmail;
		}
		public String getBuyerMessage() {
			return this.buyerMessage;
		}
		public void setBuyerMessage(String buyerMessage) {
			this.buyerMessage = buyerMessage;
		}
		public String getBuyerNick() {
			return this.buyerNick;
		}
		public void setBuyerNick(String buyerNick) {
			this.buyerNick = buyerNick;
		}
		public String getBuyerPhone() {
			return this.buyerPhone;
		}
		public void setBuyerPhone(String buyerPhone) {
			this.buyerPhone = buyerPhone;
		}
		public Boolean getBuyerRate() {
			return this.buyerRate;
		}
		public void setBuyerRate(Boolean buyerRate) {
			this.buyerRate = buyerRate;
		}

}

	/**
 * 主、子订单优惠信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class PromotionDetail extends TaobaoObject {

	private static final long serialVersionUID = 7344593554194987444L;

	/**
		 * 优惠金额（免运费、限时打折时为空）,单位：分
		 */
		@ApiField("discount_fee")
		private String discountFee;
		/**
		 * 交易的主订单或子订单号
		 */
		@ApiField("id")
		private Long id;
		/**
		 * 优惠活动的描述
		 */
		@ApiField("promotion_desc")
		private String promotionDesc;
		/**
		 * 优惠id，(由营销工具id、优惠活动id和优惠详情id组成，结构为：营销工具id-优惠活动id_优惠详情id，如mjs-123024_211143）
		 */
		@ApiField("promotion_id")
		private String promotionId;
		/**
		 * 优惠信息的名称
		 */
		@ApiField("promotion_name")
		private String promotionName;
	

	public String getDiscountFee() {
			return this.discountFee;
		}
		public void setDiscountFee(String discountFee) {
			this.discountFee = discountFee;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getPromotionDesc() {
			return this.promotionDesc;
		}
		public void setPromotionDesc(String promotionDesc) {
			this.promotionDesc = promotionDesc;
		}
		public String getPromotionId() {
			return this.promotionId;
		}
		public void setPromotionId(String promotionId) {
			this.promotionId = promotionId;
		}
		public String getPromotionName() {
			return this.promotionName;
		}
		public void setPromotionName(String promotionName) {
			this.promotionName = promotionName;
		}

}

	/**
 * 购买的商品信息（商品、sku信息，单价、数量、出行日期等信息）
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class BuyItemInfo extends TaobaoObject {

	private static final long serialVersionUID = 6756152411556473968L;

	/**
		 * 商品类目相关的扩展信息。KV对形式，多个KV对以英文封号分隔，k1:v1;k2:v2。各类目支持的枚举key详见：https://open.alitrip.com/docs/doc.htm?docType=1&articleId=107548
		 */
		@ApiField("category_ext_infos")
		private String categoryExtInfos;
		/**
		 * 商品所属叶子类目id
		 */
		@ApiField("category_id")
		private Long categoryId;
		/**
		 * 商品id
		 */
		@ApiField("item_id")
		private Long itemId;
		/**
		 * 商品标题
		 */
		@ApiField("item_title")
		private String itemTitle;
		/**
		 * 购买的数量
		 */
		@ApiField("num")
		private Long num;
		/**
		 * 商家自定义的商品编码
		 */
		@ApiField("out_product_id")
		private String outProductId;
		/**
		 * sku_id对应的商家自定义sku编码（即商品上套餐的外部商家编码）
		 */
		@ApiField("out_sku_id")
		private String outSkuId;
		/**
		 * 商品价格
		 */
		@ApiField("price")
		private Long price;
		/**
		 * 用户所购买的商品上sku的id
		 */
		@ApiField("sku_id")
		private Long skuId;
		/**
		 * 用户所购买的Sku信息。包含商品套餐名称（对于门票商品即指票种），出游人群信息等
		 */
		@ApiField("sku_properties")
		private String skuProperties;
		/**
		 * 出行结束日期，如果没有出行结束日期，则该值为空。（对于wifi/电话卡商品 指激活/租用结束日期；对于流量充值商品 指结束使用日期）
		 */
		@ApiField("trip_end_date")
		private Date tripEndDate;
		/**
		 * 出行开始日期。（对于wifi/电话卡商品 指激活/租用日期；对于门票商品 指入园日期；对于流量充值商品 指开始使用日期）
		 */
		@ApiField("trip_start_date")
		private Date tripStartDate;
	

	public String getCategoryExtInfos() {
			return this.categoryExtInfos;
		}
		public void setCategoryExtInfos(String categoryExtInfos) {
			this.categoryExtInfos = categoryExtInfos;
		}
		public Long getCategoryId() {
			return this.categoryId;
		}
		public void setCategoryId(Long categoryId) {
			this.categoryId = categoryId;
		}
		public Long getItemId() {
			return this.itemId;
		}
		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}
		public String getItemTitle() {
			return this.itemTitle;
		}
		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}
		public Long getNum() {
			return this.num;
		}
		public void setNum(Long num) {
			this.num = num;
		}
		public String getOutProductId() {
			return this.outProductId;
		}
		public void setOutProductId(String outProductId) {
			this.outProductId = outProductId;
		}
		public String getOutSkuId() {
			return this.outSkuId;
		}
		public void setOutSkuId(String outSkuId) {
			this.outSkuId = outSkuId;
		}
		public Long getPrice() {
			return this.price;
		}
		public void setPrice(Long price) {
			this.price = price;
		}
		public Long getSkuId() {
			return this.skuId;
		}
		public void setSkuId(Long skuId) {
			this.skuId = skuId;
		}
		public String getSkuProperties() {
			return this.skuProperties;
		}
		public void setSkuProperties(String skuProperties) {
			this.skuProperties = skuProperties;
		}
		public Date getTripEndDate() {
			return this.tripEndDate;
		}
		public void setTripEndDate(Date tripEndDate) {
			this.tripEndDate = tripEndDate;
		}
		public Date getTripStartDate() {
			return this.tripStartDate;
		}
		public void setTripStartDate(Date tripStartDate) {
			this.tripStartDate = tripStartDate;
		}

}

	/**
 * 联系人/取件人信息。通用联系人信息，没有配置度假出行人模板的商品订单（如wifi电话卡等类目），从这里获取联系人或取件人信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class TravellerInfo extends TaobaoObject {

	private static final long serialVersionUID = 7119144917766472619L;

	/**
		 * 出生日期，格式yyyy-mm-dd
		 */
		@ApiField("birthday")
		private String birthday;
		/**
		 * 证件号码
		 */
		@ApiField("credential_no")
		private String credentialNo;
		/**
		 * 证件类型。0:身份证 1:护照 2:学生证3:军官证 4:回乡证 5:台胞证 6:港澳通行证 10:警官证 11:士兵证 12:台湾通行证
		 */
		@ApiField("credential_type")
		private Long credentialType;
		/**
		 * 联系电子邮箱
		 */
		@ApiField("email")
		private String email;
		/**
		 * 预留，KV对形式，商家自定义的个性化出行人信息。目前支持的Key列表如下：overseaPhoneNumber（国外手机号），emergencyPhoneNumber（紧急联系方式），memo（备注）
		 */
		@ApiField("extend_attributes")
		private String extendAttributes;
		/**
		 * 名（拼音）
		 */
		@ApiField("given_name_pinyin")
		private String givenNamePinyin;
		/**
		 * 证件签发国
		 */
		@ApiField("issue_country")
		private String issueCountry;
		/**
		 * 证件签发地
		 */
		@ApiField("issue_place")
		private String issuePlace;
		/**
		 * 姓名
		 */
		@ApiField("name")
		private String name;
		/**
		 * 姓名（拼音）
		 */
		@ApiField("name_pinyin")
		private String namePinyin;
		/**
		 * 国籍
		 */
		@ApiField("nationality")
		private String nationality;
		/**
		 * 联系电话
		 */
		@ApiField("phone")
		private String phone;
		/**
		 * 具体收件地址（对于需要物流的实物商品）
		 */
		@ApiField("post_address")
		private String postAddress;
		/**
		 * 收件区域
		 */
		@ApiField("post_area")
		private String postArea;
		/**
		 * 收件市（对于需要物流的实物商品）
		 */
		@ApiField("post_city")
		private String postCity;
		/**
		 * 收件省（对于需要物流的实物商品）
		 */
		@ApiField("post_province")
		private String postProvince;
		/**
		 * 性别。0-男，1-女
		 */
		@ApiField("sex")
		private Long sex;
		/**
		 * 姓（拼音）
		 */
		@ApiField("surname_pinyin")
		private String surnamePinyin;
		/**
		 * 证件有效期
		 */
		@ApiField("valid_date")
		private String validDate;
	

	public String getBirthday() {
			return this.birthday;
		}
		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}
		public String getCredentialNo() {
			return this.credentialNo;
		}
		public void setCredentialNo(String credentialNo) {
			this.credentialNo = credentialNo;
		}
		public Long getCredentialType() {
			return this.credentialType;
		}
		public void setCredentialType(Long credentialType) {
			this.credentialType = credentialType;
		}
		public String getEmail() {
			return this.email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getExtendAttributes() {
			return this.extendAttributes;
		}
		public void setExtendAttributes(String extendAttributes) {
			this.extendAttributes = extendAttributes;
		}
		public String getGivenNamePinyin() {
			return this.givenNamePinyin;
		}
		public void setGivenNamePinyin(String givenNamePinyin) {
			this.givenNamePinyin = givenNamePinyin;
		}
		public String getIssueCountry() {
			return this.issueCountry;
		}
		public void setIssueCountry(String issueCountry) {
			this.issueCountry = issueCountry;
		}
		public String getIssuePlace() {
			return this.issuePlace;
		}
		public void setIssuePlace(String issuePlace) {
			this.issuePlace = issuePlace;
		}
		public String getName() {
			return this.name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getNamePinyin() {
			return this.namePinyin;
		}
		public void setNamePinyin(String namePinyin) {
			this.namePinyin = namePinyin;
		}
		public String getNationality() {
			return this.nationality;
		}
		public void setNationality(String nationality) {
			this.nationality = nationality;
		}
		public String getPhone() {
			return this.phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getPostAddress() {
			return this.postAddress;
		}
		public void setPostAddress(String postAddress) {
			this.postAddress = postAddress;
		}
		public String getPostArea() {
			return this.postArea;
		}
		public void setPostArea(String postArea) {
			this.postArea = postArea;
		}
		public String getPostCity() {
			return this.postCity;
		}
		public void setPostCity(String postCity) {
			this.postCity = postCity;
		}
		public String getPostProvince() {
			return this.postProvince;
		}
		public void setPostProvince(String postProvince) {
			this.postProvince = postProvince;
		}
		public Long getSex() {
			return this.sex;
		}
		public void setSex(Long sex) {
			this.sex = sex;
		}
		public String getSurnamePinyin() {
			return this.surnamePinyin;
		}
		public void setSurnamePinyin(String surnamePinyin) {
			this.surnamePinyin = surnamePinyin;
		}
		public String getValidDate() {
			return this.validDate;
		}
		public void setValidDate(String validDate) {
			this.validDate = validDate;
		}

}

	/**
 * 主订单包含的各个子订单信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class SubOrderInfo extends TaobaoObject {

	private static final long serialVersionUID = 7855465191952585215L;

	/**
		 * 卖家手工调整金额，单位：分
		 */
		@ApiField("adjust_fee")
		private Long adjustFee;
		/**
		 * 订单所属业务类型。0-未知，1-度假（自由行，跟团游），2-普通签证，3-门票，4-wifi，7-当地玩乐，9-邮轮，10-用车，12-电话卡，17-流量充值，18-港澳签注，20-旅行租赁
		 */
		@ApiField("biz_type")
		private Long bizType;
		/**
		 * 购买的商品信息（商品、sku信息，单价、数量、出行日期等信息）
		 */
		@ApiField("buy_item_info")
		private BuyItemInfo buyItemInfo;
		/**
		 * 二次确认状态
		 */
		@ApiField("confirm_status")
		private Long confirmStatus;
		/**
		 * 联系人/取件人信息。通用联系人信息，没有配置度假出行人模板的商品订单（如wifi电话卡等类目），从这里获取联系人或取件人信息
		 */
		@ApiField("contactor")
		private TravellerInfo contactor;
		/**
		 * 子订单优惠金额（如打折，VIP，满就送等），不包含带资优惠（如红包、旅行券）。单位：分
		 */
		@ApiField("discount_fee")
		private Long discountFee;
		/**
		 * 子订单交易结束时间。交易成功时间(更新交易状态为成功的同时更新)/确认收货时间或者交易关闭时间
		 */
		@ApiField("end_time")
		private Date endTime;
		/**
		 * 子订单超时自动关单（卖家未能及时发货）时间
		 */
		@ApiField("expire_time")
		private Date expireTime;
		/**
		 * 子订单扩展属性。KV对结构。每个KV对间使用分号隔开。如：k1:v1;k2:v2
		 */
		@ApiField("extend_attributes")
		private String extendAttributes;
		/**
		 * 订单类型。1、普通订单，2、二次确认订单，3、二次预约订单
		 */
		@ApiField("order_type")
		private Long orderType;
		/**
		 * 买家实付金额。单位：分
		 */
		@ApiField("payment")
		private Long payment;
		/**
		 * 订单处理时间 精确到秒
		 */
		@ApiField("process_time")
		private String processTime;
		/**
		 * 子订单退款编号。如果子订单没有发生退款，则该值为空
		 */
		@ApiField("refund_id")
		private Long refundId;
		/**
		 * 退款状态。WAIT_SELLER_AGREE(买家已经申请退款，等待卖家同意);WAIT_BUYER_RETURN_GOODS(卖家已经同意退款，等待买家退货);WAIT_SELLER_CONFIRM_GOODS(买家已经退货，等待卖家确认收货);SELLER_REFUSE_BUYER(卖家拒绝退款);CLOSED(退款关闭);SUCCESS(退款成功)
		 */
		@ApiField("refund_status")
		private String refundStatus;
		/**
		 * 子订单状态
		 */
		@ApiField("status")
		private String status;
		/**
		 * 子订单id
		 */
		@ApiField("sub_order_id")
		private Long subOrderId;
		/**
		 * string类型子订单id
		 */
		@ApiField("sub_order_id_string")
		private String subOrderIdString;
		/**
		 * 应付金额（商品价格 * 商品数量 + 手工调整金额 - 子订单优惠金额），大于等于payment，因为可能包含了带资优惠（如红包、旅行券）。单位：分
		 */
		@ApiField("total_fee")
		private Long totalFee;
		/**
		 * 出行人信息
		 */
		@ApiListField("travellers")
		@ApiField("traveller_info")
		private List<TravellerInfo> travellers;
	

	public Long getAdjustFee() {
			return this.adjustFee;
		}
		public void setAdjustFee(Long adjustFee) {
			this.adjustFee = adjustFee;
		}
		public Long getBizType() {
			return this.bizType;
		}
		public void setBizType(Long bizType) {
			this.bizType = bizType;
		}
		public BuyItemInfo getBuyItemInfo() {
			return this.buyItemInfo;
		}
		public void setBuyItemInfo(BuyItemInfo buyItemInfo) {
			this.buyItemInfo = buyItemInfo;
		}
		public Long getConfirmStatus() {
			return this.confirmStatus;
		}
		public void setConfirmStatus(Long confirmStatus) {
			this.confirmStatus = confirmStatus;
		}
		public TravellerInfo getContactor() {
			return this.contactor;
		}
		public void setContactor(TravellerInfo contactor) {
			this.contactor = contactor;
		}
		public Long getDiscountFee() {
			return this.discountFee;
		}
		public void setDiscountFee(Long discountFee) {
			this.discountFee = discountFee;
		}
		public Date getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public Date getExpireTime() {
			return this.expireTime;
		}
		public void setExpireTime(Date expireTime) {
			this.expireTime = expireTime;
		}
		public String getExtendAttributes() {
			return this.extendAttributes;
		}
		public void setExtendAttributes(String extendAttributes) {
			this.extendAttributes = extendAttributes;
		}
		public Long getOrderType() {
			return this.orderType;
		}
		public void setOrderType(Long orderType) {
			this.orderType = orderType;
		}
		public Long getPayment() {
			return this.payment;
		}
		public void setPayment(Long payment) {
			this.payment = payment;
		}
		public String getProcessTime() {
			return this.processTime;
		}
		public void setProcessTime(String processTime) {
			this.processTime = processTime;
		}
		public Long getRefundId() {
			return this.refundId;
		}
		public void setRefundId(Long refundId) {
			this.refundId = refundId;
		}
		public String getRefundStatus() {
			return this.refundStatus;
		}
		public void setRefundStatus(String refundStatus) {
			this.refundStatus = refundStatus;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Long getSubOrderId() {
			return this.subOrderId;
		}
		public void setSubOrderId(Long subOrderId) {
			this.subOrderId = subOrderId;
		}
		public String getSubOrderIdString() {
			return this.subOrderIdString;
		}
		public void setSubOrderIdString(String subOrderIdString) {
			this.subOrderIdString = subOrderIdString;
		}
		public Long getTotalFee() {
			return this.totalFee;
		}
		public void setTotalFee(Long totalFee) {
			this.totalFee = totalFee;
		}
		public List<TravellerInfo> getTravellers() {
			return this.travellers;
		}
		public void setTravellers(List<TravellerInfo> travellers) {
			this.travellers = travellers;
		}

}

	/**
 * 交易主订单详情
 *
 * @author top auto create
 * @since 1.0, null
 */
public static class TopTripOrderResult extends TaobaoObject {

	private static final long serialVersionUID = 6728161388435827931L;

	/**
		 * 买家信息
		 */
		@ApiField("buyer_info")
		private BuyerInfo buyerInfo;
		/**
		 * 订单创建时间
		 */
		@ApiField("created_time")
		private Date createdTime;
		/**
		 * 交易结束时间。交易成功时间(更新交易状态为成功的同时更新)/确认收货时间或者交易关闭时间
		 */
		@ApiField("end_time")
		private Date endTime;
		/**
		 * 订单修改时间
		 */
		@ApiField("modified_time")
		private Date modifiedTime;
		/**
		 * 主订单id
		 */
		@ApiField("order_id")
		private Long orderId;
		/**
		 * string类型订单id
		 */
		@ApiField("order_id_string")
		private String orderIdString;
		/**
		 * 该笔订单是否押金合并支付订单（即该主订单是否已包含押金订单金额）
		 */
		@ApiField("order_with_depo")
		private Boolean orderWithDepo;
		/**
		 * 主订单支付信息
		 */
		@ApiField("pay_info")
		private PayInfo payInfo;
		/**
		 * 订单邮费，需要邮寄的实体商品才有
		 */
		@ApiField("post_fee")
		private Long postFee;
		/**
		 * 主、子订单优惠信息
		 */
		@ApiListField("promotion_details")
		@ApiField("promotion_detail")
		private List<PromotionDetail> promotionDetails;
		/**
		 * 卖家信息
		 */
		@ApiField("seller_info")
		private SellerInfo sellerInfo;
		/**
		 * 主订单状态。交易状态。可选值: TRADE_NO_CREATE_PAY(没有创建支付宝交易)；WAIT_BUYER_PAY(等待买家付款)；SELLER_CONSIGNED_PART(卖家部分发货)；WAIT_SELLER_SEND_GOODS(等待卖家发货,即:买家已付款)；WAIT_BUYER_CONFIRM_GOODS(等待买家确认收货,即:卖家已发货)；TRADE_FINISHED(交易成功)；TRADE_CLOSED(付款以后用户退款成功，交易自动关闭)；TRADE_CLOSED_BY_TAOBAO(付款以前，卖家或买家主动关闭交易)；PAY_PENDING(国际信用卡支付付款确认中);
		 */
		@ApiField("status")
		private String status;
		/**
		 * 主订单包含的各个子订单信息
		 */
		@ApiListField("sub_orders")
		@ApiField("sub_order_info")
		private List<SubOrderInfo> subOrders;
		/**
		 * 交易类型列表，fixed(一口价);auction(拍卖);guarantee_trade(一口价、拍卖);auto_delivery(自动发货);cod(货到付款);external_trade(统一外部交易);instant_trade(即时交易);b2c_cod(大商家货到付款);nopaid(即时到帐);eticket(电子凭证订单);step(分阶段付款)
		 */
		@ApiField("type")
		private String type;
	

	public BuyerInfo getBuyerInfo() {
			return this.buyerInfo;
		}
		public void setBuyerInfo(BuyerInfo buyerInfo) {
			this.buyerInfo = buyerInfo;
		}
		public Date getCreatedTime() {
			return this.createdTime;
		}
		public void setCreatedTime(Date createdTime) {
			this.createdTime = createdTime;
		}
		public Date getEndTime() {
			return this.endTime;
		}
		public void setEndTime(Date endTime) {
			this.endTime = endTime;
		}
		public Date getModifiedTime() {
			return this.modifiedTime;
		}
		public void setModifiedTime(Date modifiedTime) {
			this.modifiedTime = modifiedTime;
		}
		public Long getOrderId() {
			return this.orderId;
		}
		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}
		public String getOrderIdString() {
			return this.orderIdString;
		}
		public void setOrderIdString(String orderIdString) {
			this.orderIdString = orderIdString;
		}
		public Boolean getOrderWithDepo() {
			return this.orderWithDepo;
		}
		public void setOrderWithDepo(Boolean orderWithDepo) {
			this.orderWithDepo = orderWithDepo;
		}
		public PayInfo getPayInfo() {
			return this.payInfo;
		}
		public void setPayInfo(PayInfo payInfo) {
			this.payInfo = payInfo;
		}
		public Long getPostFee() {
			return this.postFee;
		}
		public void setPostFee(Long postFee) {
			this.postFee = postFee;
		}
		public List<PromotionDetail> getPromotionDetails() {
			return this.promotionDetails;
		}
		public void setPromotionDetails(List<PromotionDetail> promotionDetails) {
			this.promotionDetails = promotionDetails;
		}
		public SellerInfo getSellerInfo() {
			return this.sellerInfo;
		}
		public void setSellerInfo(SellerInfo sellerInfo) {
			this.sellerInfo = sellerInfo;
		}
		public String getStatus() {
			return this.status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public List<SubOrderInfo> getSubOrders() {
			return this.subOrders;
		}
		public void setSubOrders(List<SubOrderInfo> subOrders) {
			this.subOrders = subOrders;
		}
		public String getType() {
			return this.type;
		}
		public void setType(String type) {
			this.type = type;
		}

}



}
