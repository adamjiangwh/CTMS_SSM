package com.zjsm.ctms.model;

import java.math.BigDecimal;

public class Play {

	private int playId;
    private int playTypeId;
    private int playLangId;
    private String playName;
    private String playIntroduction;
    private String playImage;
    private int playLength;
    private BigDecimal playTicketPrice;
    private int playStatus;
    
	public int getPlayId() {
		return playId;
	}
	public void setPlayId(int playId) {
		this.playId = playId;
	}
	public int getPlayTypeId() {
		return playTypeId;
	}
	public void setPlayTypeId(int playTypeId) {
		this.playTypeId = playTypeId;
	}
	public int getPlayLangId() {
		return playLangId;
	}
	public void setPlayLangId(int playLangId) {
		this.playLangId = playLangId;
	}
	public String getPlayName() {
		return playName;
	}
	public void setPlayName(String playName) {
		this.playName = playName;
	}
	public String getPlayIntroduction() {
		return playIntroduction;
	}
	public void setPlayIntroduction(String playIntroduction) {
		this.playIntroduction = playIntroduction;
	}
	public String getPlayImage() {
		return playImage;
	}
	public void setPlayImage(String playImage) {
		this.playImage = playImage;
	}
	public int getPlayLength() {
		return playLength;
	}
	public void setPlayLength(int playLength) {
		this.playLength = playLength;
	}
	public BigDecimal getPlayTicketPrice() {
		return playTicketPrice;
	}
	public void setPlayTicketPrice(BigDecimal playTicketPrice) {
		this.playTicketPrice = playTicketPrice;
	}
	public int getPlayStatus() {
		return playStatus;
	}
	public void setPlayStatus(int playStatus) {
		this.playStatus = playStatus;
	}
	
	@Override
	public String toString() {
		return "Play [playId=" + playId + ", playTypeId=" + playTypeId + ", playLangId=" + playLangId + ", playName="
				+ playName + ", playIntroduction=" + playIntroduction + ", playImage=" + playImage + ", playLength="
				+ playLength + ", playTicketPrice=" + playTicketPrice + ", playStatus=" + playStatus + "]";
	}
    
}
