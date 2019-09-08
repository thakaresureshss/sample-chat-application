package com.sample.chat.model;

import java.util.Date;

public class ChatOutMessage {

	private String content;
	private String groupName;
	private Date sentTimestamp;
	private String senderName;

	public ChatOutMessage(String content) {
		this.content = content;
	}

	public ChatOutMessage(String content, String groupName, Date sentTimestamp, String senderName) {
		super();
		this.content = content;
		this.groupName = groupName;
		this.sentTimestamp = sentTimestamp;
		this.senderName = senderName;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public ChatOutMessage() {

	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Date getSentTimestamp() {
		return sentTimestamp;
	}

	public void setSentTimestamp(Date sentTimestamp) {
		this.sentTimestamp = sentTimestamp;
	}

}
