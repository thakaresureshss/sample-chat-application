package com.sample.chat.model;

import java.util.Date;

public class ChatInMessage {

	private String senderId;
	private String senderName;
	private String senderEmail;
	private String senderMobileNo;
	private String message;
	private Date sentTimestamp = new Date();

	public ChatInMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChatInMessage(String message) {
		super();
		this.message = message;
	}

	public ChatInMessage(String senderId, String senderName, String senderEmail, String senderMobileNo, String message,
			Date sentTimestamp) {
		super();
		this.senderId = senderId;
		this.senderName = senderName;
		this.senderEmail = senderEmail;
		this.senderMobileNo = senderMobileNo;
		this.message = message;
		this.sentTimestamp = sentTimestamp;
	}

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderEmail() {
		return senderEmail;
	}

	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	public String getSenderMobileNo() {
		return senderMobileNo;
	}

	public void setSenderMobileNo(String senderMobileNo) {
		this.senderMobileNo = senderMobileNo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getSentTimestamp() {
		return sentTimestamp;
	}

	public void setSentTimestamp(Date sentTimestamp) {
		this.sentTimestamp = sentTimestamp;
	}

}
