package com.beyond.develop.dto;

import java.io.Serializable;

public class PGDataDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private char header0;
	private char header1;
	private int imei;
	
	private int lng;
	private int lat;
	private short hight;
	private short speed;
	private byte status;
	private byte star;
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
	public int getLng() {
		return lng;
	}
	public void setLng(int lng) {
		this.lng = lng;
	}
	public int getLat() {
		return lat;
	}
	public void setLat(int lat) {
		this.lat = lat;
	}
	public short getHight() {
		return hight;
	}
	public void setHight(short hight) {
		this.hight = hight;
	}
	public short getSpeed() {
		return speed;
	}
	public void setSpeed(short speed) {
		this.speed = speed;
	}
	public byte getStatus() {
		return status;
	}
	public void setStatus(byte status) {
		this.status = status;
	}
	public byte getStar() {
		return star;
	}
	public void setStar(byte star) {
		this.star = star;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "PGDataDto [header0=" + header0 + ", header1=" + header1 + ", imei=" + imei + ", lng=" + lng + ", lat="
				+ lat + ", hight=" + hight + ", speed=" + speed + ", status=" + status + ", star=" + star + ", time="
				+ time + "]";
	}
		
	
}
