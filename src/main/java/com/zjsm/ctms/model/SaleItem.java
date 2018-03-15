package com.zjsm.ctms.model;

import java.math.BigDecimal;

public class SaleItem {

    private String saleItemId;
    private String ticketId;
    private String saleId;
    private BigDecimal saleItemPrice;
    
	public String getSaleItemId() {
		return saleItemId;
	}
	public void setSaleItemId(String saleItemId) {
		this.saleItemId = saleItemId;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getSaleId() {
		return saleId;
	}
	public void setSaleID(String saleId) {
		this.saleId = saleId;
	}
	public BigDecimal getSaleItemPrice() {
		return saleItemPrice;
	}
	public void setSaleItemPrice(BigDecimal saleItemPrice) {
		this.saleItemPrice = saleItemPrice;
	}
	
	@Override
	public String toString() {
		return "SaleItem [saleItemId=" + saleItemId + ", ticketId=" + ticketId + ", saleId=" + saleId
				+ ", saleItemPrice=" + saleItemPrice + "]";
	}
    
}
