package com.ts.aurora.model;

public class User {

	private String login;

	private String password;

	private boolean keepLoggedIn;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isKeepLoggedIn() {
		return keepLoggedIn;
	}

	public void setKeepLoggedIn(boolean keepLoggedIn) {
		this.keepLoggedIn = keepLoggedIn;
	}

	@Override
	public String toString() {
		return "User [login= " + login + ", password= " + password + ", keepLoggedIn= " + keepLoggedIn + "]";
	}

}