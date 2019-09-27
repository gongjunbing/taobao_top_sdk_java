package com.taobao.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: alitrip.travel.trades.search response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AlitripTravelTradesSearchResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1693892198823396757L;

	/** 
	 * 主订单id列表（Long类型）
	 */
	@ApiListField("order_list")
	@ApiField("number")
	private List<Long> orderList;

	/** 
	 * 主订单id列表（string类型）
	 */
	@ApiListField("order_string_list")
	@ApiField("string")
	private List<String> orderStringList;

	/** 
	 * 本次搜索包含的订单总数，用于分页控制
	 */
	@ApiField("total_orders")
	private Long totalOrders;


	public void setOrderList(List<Long> orderList) {
		this.orderList = orderList;
	}
	public List<Long> getOrderList( ) {
		return this.orderList;
	}

	public void setOrderStringList(List<String> orderStringList) {
		this.orderStringList = orderStringList;
	}
	public List<String> getOrderStringList( ) {
		return this.orderStringList;
	}

	public void setTotalOrders(Long totalOrders) {
		this.totalOrders = totalOrders;
	}
	public Long getTotalOrders( ) {
		return this.totalOrders;
	}
	


}
