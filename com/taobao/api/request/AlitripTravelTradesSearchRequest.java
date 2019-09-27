package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.AlitripTravelTradesSearchResponse;

/**
 * TOP API: alitrip.travel.trades.search request
 * 
 * @author top auto create
 * @since 1.0, 2017.10.30
 */
public class AlitripTravelTradesSearchRequest extends BaseTaobaoRequest<AlitripTravelTradesSearchResponse> {
	
	

	/** 
	* 当前页
	 */
	private Long currentPage;

	/** 
	* 订单创建 结束时间
	 */
	private Date endCreatedTime;

	/** 
	* 订单状态 过滤。1-等待买家付款，2-等待卖家发货（买家已付款），3-等待买家确认收货，4-交易关闭（买家发起的退款），6-交易成功，8-交易关闭（订单超时 自动关单）
	 */
	private Long orderStatus;

	/** 
	* 页面大小，最大支持的页面大小为100
	 */
	private Long pageSize;

	/** 
	* 订单创建 开始时间
	 */
	private Date startCreatedTime;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setEndCreatedTime(Date endCreatedTime) {
		this.endCreatedTime = endCreatedTime;
	}

	public Date getEndCreatedTime() {
		return this.endCreatedTime;
	}

	public void setOrderStatus(Long orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getOrderStatus() {
		return this.orderStatus;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setStartCreatedTime(Date startCreatedTime) {
		this.startCreatedTime = startCreatedTime;
	}

	public Date getStartCreatedTime() {
		return this.startCreatedTime;
	}

	public String getApiMethodName() {
		return "alitrip.travel.trades.search";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("current_page", this.currentPage);
		txtParams.put("end_created_time", this.endCreatedTime);
		txtParams.put("order_status", this.orderStatus);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_created_time", this.startCreatedTime);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<AlitripTravelTradesSearchResponse> getResponseClass() {
		return AlitripTravelTradesSearchResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(endCreatedTime, "endCreatedTime");
		RequestCheckUtils.checkNotEmpty(startCreatedTime, "startCreatedTime");
	}
	

}