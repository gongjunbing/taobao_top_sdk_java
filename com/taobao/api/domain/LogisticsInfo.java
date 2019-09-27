package com.taobao.api.domain;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;


/**
 * 子单物流发货信息
 *
 * @author top auto create
 * @since 1.0, null
 */
public class LogisticsInfo extends TaobaoObject {

	private static final long serialVersionUID = 2696645484594487185L;

	/**
	 * 发货类型CN=菜鸟发货，SC的商家仓发货
	 */
	@ApiField("consign_type")
	private String consignType;

	/**
	 * 货品仓储code
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 货品仓储ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 应发数量
	 */
	@ApiField("need_consign_num")
	private Long needConsignNum;

	/**
	 * 商品数字编号
	 */
	@ApiField("num_iid")
	private Long numIid;

	/**
	 * 商品的最小库存单位Sku的id
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 如是菜鸟仓，则将菜鸟仓的区域仓code进行填充，如是商家仓发货则填充商家仓code
	 */
	@ApiField("store_code")
	private String storeCode;

	/**
	 * 子交易号
	 */
	@ApiField("sub_trade_id")
	private Long subTradeId;

	/**
	 * 交易号
	 */
	@ApiField("trade_id")
	private Long tradeId;

	/**
	 * 子订单类型:标示该子交易单来源交易，还是BMS增加的，枚举值(00=交易，10=BMS绑定)
	 */
	@ApiField("type")
	private String type;


	public String getConsignType() {
		return this.consignType;
	}
	public void setConsignType(String consignType) {
		this.consignType = consignType;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Long getNeedConsignNum() {
		return this.needConsignNum;
	}
	public void setNeedConsignNum(Long needConsignNum) {
		this.needConsignNum = needConsignNum;
	}

	public Long getNumIid() {
		return this.numIid;
	}
	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getStoreCode() {
		return this.storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}

	public Long getSubTradeId() {
		return this.subTradeId;
	}
	public void setSubTradeId(Long subTradeId) {
		this.subTradeId = subTradeId;
	}

	public Long getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
