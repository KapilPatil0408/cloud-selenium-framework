package com.ui.pojo;

public class Environment {

	private String url;
	private int MAXIMUN_NUMBER_OF_ATTEMPTS;
	
	public int getMAXIMUN_NUMBER_OF_ATTEMPTS() {
		return MAXIMUN_NUMBER_OF_ATTEMPTS;
	}

	public void setMAXIMUN_NUMBER_OF_ATTEMPTS(int MAXIMUN_NUMBER_OF_ATTEMPTS) {
		this.MAXIMUN_NUMBER_OF_ATTEMPTS = MAXIMUN_NUMBER_OF_ATTEMPTS;
	}

	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url=url;
	}
}
