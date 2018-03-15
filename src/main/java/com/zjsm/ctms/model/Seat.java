package com.zjsm.ctms.model;

public class Seat {

    private int seatId;
    private int studioId;
    private int seatRow;
    private int seatCol;
    private int seatStatus;
    
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public int getStudioId() {
		return studioId;
	}
	public void setStudioId(int studioId) {
		this.studioId = studioId;
	}
	public int getSeatRow() {
		return seatRow;
	}
	public void setSeatRow(int seatRow) {
		this.seatRow = seatRow;
	}
	public int getSeatCol() {
		return seatCol;
	}
	public void setSeatCol(int seatCol) {
		this.seatCol = seatCol;
	}
	public int getSeatStatus() {
		return seatStatus;
	}
	public void setSeatStatus(int seatStatus) {
		this.seatStatus = seatStatus;
	}
	
	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", studioId=" + studioId + ", seatRow=" + seatRow + ", seatCol=" + seatCol
				+ ", seatStatus=" + seatStatus + "]";
	}
    
}
