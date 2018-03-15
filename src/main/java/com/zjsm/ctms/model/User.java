package com.zjsm.ctms.model;

public class User {

	private String empNo;
	private String empPass;
	private int type;
	private String headPath;
	
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getEmpPass() {
		return empPass;
	}
	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getHeadPath() {
		return headPath;
	}
	public void setHeadPath(String headPath) {
		this.headPath = headPath;
	}
	
	@Override
	public String toString() {
		return "User [empNo=" + empNo + ", empPass=" + empPass + ", type=" + type + ", headPath=" + headPath + "]";
	}
	
}
