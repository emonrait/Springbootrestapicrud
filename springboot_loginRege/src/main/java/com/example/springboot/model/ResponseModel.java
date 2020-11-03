package com.example.springboot.model;

public class ResponseModel {

	private String outCode;
	private String outMessage;
	private String userId;

	public ResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseModel(String outCode, String outMessage, String userId) {
		super();
		this.outCode = outCode;
		this.outMessage = outMessage;
		this.userId = userId;
	}

	public String getOutCode() {
		return outCode;
	}

	public void setOutCode(String outCode) {
		this.outCode = outCode;
	}

	public String getOutMessage() {
		return outMessage;
	}

	public void setOutMessage(String outMessage) {
		this.outMessage = outMessage;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
