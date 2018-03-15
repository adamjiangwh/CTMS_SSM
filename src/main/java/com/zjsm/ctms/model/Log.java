package com.zjsm.ctms.model;

import java.util.Date;

public class Log {
	
	private String logId;
	private String empNo;
	private String moduleName;
	private String operate;
	private Date time;
	private String className;
	private String methodName;
	private String params;
	private String ip;
	
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getOperate() {
		return operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	@Override
	public String toString() {
		return "Log [logId=" + logId + ", empNo=" + empNo + ", moduleName=" + moduleName + ", operate=" + operate
				+ ", time=" + time + ", className=" + className + ", methodName=" + methodName + ", params=" + params
				+ ", ip=" + ip + "]";
	}
	
}
