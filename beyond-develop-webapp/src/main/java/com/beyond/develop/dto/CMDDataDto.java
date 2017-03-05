package com.beyond.develop.dto;

import java.io.Serializable;

public class CMDDataDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private char header0;
	private char header1;
	private int imei;
	
	private byte seq;
	private byte cmd;
	private String param;
	
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
	public byte getCmd() {
		return cmd;
	}
	public void setCmd(byte cmd) {
		this.cmd = cmd;
	}
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	@Override
	public String toString() {
		return "CMDDataDto [header0=" + header0 + ", header1=" + header1 + ", imei=" + imei + ", seq=" + seq + ", cmd="
				+ cmd + ", param=" + param + "]";
	}
	
	
}
