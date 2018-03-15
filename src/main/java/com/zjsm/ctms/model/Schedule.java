package com.zjsm.ctms.model;

import java.math.BigDecimal;
import java.util.Date;

public class Schedule {

    private int schedId;
    private int studioId;
    private int playId;
    private Date schedTime;
    private BigDecimal schedTicketPrice;
    
	public int getSchedId() {
		return schedId;
	}
	public void setSchedId(int schedId) {
		this.schedId = schedId;
	}
	public int getStudioId() {
		return studioId;
	}
	public void setStudioId(int studioId) {
		this.studioId = studioId;
	}
	public int getPlayId() {
		return playId;
	}
	public void setPlayId(int playId) {
		this.playId = playId;
	}
	public Date getSchedTime() {
		return schedTime;
	}
	public void setSchedTime(Date schedTime) {
		this.schedTime = schedTime;
	}
	public BigDecimal getSchedTicketPrice() {
		return schedTicketPrice;
	}
	public void setSchedTicketPrice(BigDecimal schedTicketPrice) {
		this.schedTicketPrice = schedTicketPrice;
	}
	
	@Override
	public String toString() {
		return "Schedule [schedId=" + schedId + ", studioId=" + studioId + ", playId=" + playId + ", schedTime="
				+ schedTime + ", schedTicketPrice=" + schedTicketPrice + "]";
	}
    
}
