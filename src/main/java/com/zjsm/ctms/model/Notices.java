package com.zjsm.ctms.model;

public class Notices {

	private int noticesId;
	private String noticesTitle;
	private String noticesIntro;
	
	public int getNoticesId() {
		return noticesId;
	}
	public void setNoticesId(int noticesId) {
		this.noticesId = noticesId;
	}
	public String getNoticesTitle() {
		return noticesTitle;
	}
	public void setNoticesTitle(String noticesTitle) {
		this.noticesTitle = noticesTitle;
	}
	public String getNoticesIntro() {
		return noticesIntro;
	}
	public void setNoticesIntro(String noticesIntro) {
		this.noticesIntro = noticesIntro;
	}
	
	@Override
	public String toString() {
		return "Notices [noticesId=" + noticesId + ", noticesTitle=" + noticesTitle + ", noticesIntro=" + noticesIntro
				+ "]";
	}
	
}
