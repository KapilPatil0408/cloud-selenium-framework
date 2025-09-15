package com.ui.pojo;

public class AddressPOJO {

	private String company;
	private String addresLine1;
	private String addresLine2;
	private String city;
	private String postCode;
	private String homePhoneNumber;
	private String mobilePhoneNumber;
	private String otherInformation;
	private String addresAlias;
	private String state;
	
	public AddressPOJO(String company, String addresLine1, String addresLine2, String city, String postCode,
			String homePhoneNumber, String mobilePhoneNumber, String otherInformation, String addresAlias,
			String state) {
		super();
		this.company = company;
		this.addresLine1 = addresLine1;
		this.addresLine2 = addresLine2;
		this.city = city;
		this.postCode = postCode;
		this.homePhoneNumber = homePhoneNumber;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.otherInformation = otherInformation;
		this.addresAlias = addresAlias;
		this.state = state;
	}

	public String getCompany() {
		return company;
	}

	public String getAddresLine1() {
		return addresLine1;
	}

	public String getAddresLine2() {
		return addresLine2;
	}

	public String getCity() {
		return city;
	}

	public String getPostCode() {
		return postCode;
	}

	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}

	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}

	public String getOtherInformation() {
		return otherInformation;
	}

	public String getAddresAlias() {
		return addresAlias;
	}

	public String getState() {
		return state;
	}

	@Override
	public String toString() {
		return "AddressPojo [company=" + company + ", addresLine1=" + addresLine1 + ", addresLine2=" + addresLine2
				+ ", city=" + city + ", postCode=" + postCode + ", homePhoneNumber=" + homePhoneNumber
				+ ", mobilePhoneNumber=" + mobilePhoneNumber + ", otherInformation=" + otherInformation
				+ ", addresAlias=" + addresAlias + ", state=" + state + "]";
	}
	
	
	
	
}
