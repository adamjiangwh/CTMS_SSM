package com.zjsm.ctms.model;

public class DataDict {

	private int dictId;
	private int dictParentId;
	private int dictIndex;
	private String dictName;
	private String dictValue;
	
	public int getDictId() {
		return dictId;
	}
	public void setDictId(int dictId) {
		this.dictId = dictId;
	}
	public int getDictParentId() {
		return dictParentId;
	}
	public void setDictParentId(int dictParentId) {
		this.dictParentId = dictParentId;
	}
	public int getDictIndex() {
		return dictIndex;
	}
	public void setDictIndex(int dictIndex) {
		this.dictIndex = dictIndex;
	}
	public String getDictName() {
		return dictName;
	}
	public void setDictName(String dictName) {
		this.dictName = dictName;
	}
	public String getDictValue() {
		return dictValue;
	}
	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}
	
	@Override
	public String toString() {
		return "DataDict [dictId=" + dictId + ", dictParentId=" + dictParentId + ", dictIndex=" + dictIndex
				+ ", dictName=" + dictName + ", dictValue=" + dictValue + "]";
	}
	
}
