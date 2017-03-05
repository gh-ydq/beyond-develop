package com.beyond.develop.dto;

import java.io.Serializable;

public class PLDataDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private char header0;
	private char header1;
	private int imei;
	
	private int lac;
	private int cellid;
	private short signal;
	private byte status;
	private int time;
	public char getHeader0() {
		return header0;
	}
	public void setHeader0(char header0) {
		this.header0 = header0;
	}
	public char getHeader1() {
		return header1;
	}
	public void setHeader1(char header1) {
		this.header1 = header1;
	}
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	public int getLac() {
		return lac;
	}
	public void setLac(int lac) {
		this.lac = lac;
	}
	public int getCellid() {
		return cellid;
	}
	public void setCellid(int cellid) {
		this.cellid = cellid;
	}
	public short getSignal() {
		return signal;
	}
	public void setSignal(short signal) {
		this.signal = signal;
	}
	public byte getStatus() {
		return status;
	}
	public void setStatus(byte status) {
		this.status = status;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "PLDataDto [header0=" + header0 + ", header1=" + header1 + ", imei=" + imei + ", lac=" + lac
				+ ", cellid=" + cellid + ", signal=" + signal + ", status=" + status + ", time=" + time + "]";
	}
	
	
	
}
