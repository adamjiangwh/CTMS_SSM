package com.zjsm.ctms.model;

import java.math.BigDecimal;
import java.util.Date;

public class Sale {

    private String saleId;
    private int empId;
    private Date saleTime;
    private BigDecimal salePayment;
    private BigDecimal saleChange;
    private int saleType;
    private int saleStatus;
    
	public String getSaleId() {
		return saleId;
	}
	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Date getSaleTime() {
		return saleTime;
	}
	public void setSaleTime(Date saleTime) {
		this.saleTime = saleTime;
	}
	public BigDecimal getSalePayment() {
		return salePayment;
	}
	public void setSalePayment(BigDecimal salePayment) {
		this.salePayment = salePayment;
	}
	public BigDecimal getSaleChange() {
		return saleChange;
	}
	public void setSaleChange(BigDecimal saleChange) {
		this.saleChange = saleChange;
	}
	public int getSaleType() {
		return saleType;
	}
	public void setSaleType(int saleType) {
		this.saleType = saleType;
	}
	public int getSaleStatus() {
		return saleStatus;
	}
	public void setSaleStatus(int saleStatus) {
		this.saleStatus = saleStatus;
	}
	
	@Override
	public String toString() {
		return "Sale [saleId=" + saleId + ", empId=" + empId + ", saleTime=" + saleTime + ", salePayment=" + salePayment
				+ ", saleChange=" + saleChange + ", saleType=" + saleType + ", saleStatus=" + saleStatus + "]";
	}
    
}
