package com.zjsm.ctms.model;

public class Studio {

	private int studioId;
    private String studioName;
    private int studioRowCount;
    private int studioColCount;
    private String studioIntroduction;
    private int studioFlag;
    private String studioPath;
    
	public int getStudioId() {
		return studioId;
	}
	public void setStudioId(int studioId) {
		this.studioId = studioId;
	}
	public String getStudioName() {
		return studioName;
	}
	public void setStudioName(String studioName) {
		this.studioName = studioName;
	}
	public int getStudioRowCount() {
		return studioRowCount;
	}
	public void setStudioRowCount(int studioRowCount) {
		this.studioRowCount = studioRowCount;
	}
	public int getStudioColCount() {
		return studioColCount;
	}
	public void setStudioColCount(int studioColCount) {
		this.studioColCount = studioColCount;
	}
	public String getStudioIntroduction() {
		return studioIntroduction;
	}
	public void setStudioIntroduction(String studioIntroduction) {
		this.studioIntroduction = studioIntroduction;
	}
	public int getStudioFlag() {
		return studioFlag;
	}
	public void setStudioFlag(int studioFlag) {
		this.studioFlag = studioFlag;
	}
	public String getStudioPath() {
		return studioPath;
	}
	public void setStudioPath(String studioPath) {
		this.studioPath = studioPath;
	}
	
	@Override
	public String toString() {
		return "Studio [studioId=" + studioId + ", studioName=" + studioName + ", studioRowCount=" + studioRowCount
				+ ", studioColCount=" + studioColCount + ", studioIntroduction=" + studioIntroduction + ", studioFlag="
				+ studioFlag + ", studioPath=" + studioPath + "]";
	}
    
}
