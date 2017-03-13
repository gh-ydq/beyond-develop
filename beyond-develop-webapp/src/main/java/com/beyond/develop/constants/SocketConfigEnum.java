package com.beyond.develop.constants;

public enum SocketConfigEnum {
	IP("172.16.48.246","服务端IP地址"),
	PORT("8088","端口号"),
	;
	private String value;
	private String dec;
	
	private SocketConfigEnum(String value,String dec){
		this.value = value;
		this.dec = dec;
	}

	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}


	public String getDec() {
		return dec;
	}


	public void setDec(String dec) {
		this.dec = dec;
	}
	
	
	
	
}
