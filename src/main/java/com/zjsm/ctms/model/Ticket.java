package com.zjsm.ctms.model;

import java.math.BigDecimal;
import java.util.Date;

public class Ticket {

	private String ticketId;
	private int seatId;
	private int schedId;
	private BigDecimal ticketPrice;
	private int ticketStatus;
	private Date ticketLockedTime;
	
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public int getSchedId() {
		return schedId;
	}
	public void setSchedId(int schedId) {
		this.schedId = schedId;
	}
	public BigDecimal getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(BigDecimal ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public int getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(int ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public Date getTicketLockedTime() {
		return ticketLockedTime;
	}
	public void setTicketLockedTime(Date ticketLockedTime) {
		this.ticketLockedTime = ticketLockedTime;
	}
	
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", seatId=" + seatId + ", schedId=" + schedId + ", ticketPrice="
				+ ticketPrice + ", ticketStatus=" + ticketStatus + ", ticketLockedTime=" + ticketLockedTime + "]";
	}
	
}
