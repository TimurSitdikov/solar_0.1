package com.ts.aurora.model;

public class User {

	private String sessionId;

	private String userId;

	private Account account;

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "User [sessionId = " + sessionId + ", userId = " + userId + ", account = " + account + "]";
	}

}
