package com.ts.aurora.model;

import java.util.Random;

public class Account {
	private String id;
	private String name;
	private String userName;
	private String password;
	private AccountRole accountRole;

	public Account() {
		this.id = String.valueOf(new Random().nextInt(100));
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AccountRole getAccountRole() {
		return accountRole;
	}

	public void setAccountRole(AccountRole accountRole) {
		this.accountRole = accountRole;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Account [id = " + id + ", name = " + name + ", accountRole = " + accountRole + ", userName = "
				+ userName + ", password = " + password + "]";
	}


}