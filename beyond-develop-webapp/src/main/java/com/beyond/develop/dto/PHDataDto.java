package com.beyond.develop.dto;

import java.io.Serializable;

public class PHDataDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private char header0;
	private char header1;
	private int imei;
	
	private byte seq;
	private byte status;
	private long imsi;
	private short powerVoltage;
	private short batteryVoltage;
	private byte sensity;
	private byte star;
	private byte ecode;
	
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
	public byte getSeq() {
		return seq;
	}
	public void setSeq(byte seq) {
		this.seq = seq;
	}
	public byte getStatus() {
		return status;
	}
	public void setStatus(byte status) {
		this.status = status;
	}
	public long getImsi() {
		return imsi;
	}
	public void setImsi(long imsi) {
		this.imsi = imsi;
	}
	public short getPowerVoltage() {
		return powerVoltage;
	}
	public void setPowerVoltage(short powerVoltage) {
		this.powerVoltage = powerVoltage;
	}
	public short getBatteryVoltage() {
		return batteryVoltage;
	}
	public void setBatteryVoltage(short batteryVoltage) {
		this.batteryVoltage = batteryVoltage;
	}
	public byte getSensity() {
		return sensity;
	}
	public void setSensity(byte sensity) {
		this.sensity = sensity;
	}
	public byte getStar() {
		return star;
	}
	public void setStar(byte star) {
		this.star = star;
	}
	public byte getEcode() {
		return ecode;
	}
	public void setEcode(byte ecode) {
		this.ecode = ecode;
	}
	@Override
	public String toString() {
		return "PHDataDto [header0=" + header0 + ", header1=" + header1 + ", imei=" + imei + ", seq=" + seq
				+ ", status=" + status + ", imsi=" + imsi + ", powerVoltage=" + powerVoltage + ", batteryVoltage="
				+ batteryVoltage + ", sensity=" + sensity + ", star=" + star + ", ecode=" + ecode + "]";
	}
	
	
}
