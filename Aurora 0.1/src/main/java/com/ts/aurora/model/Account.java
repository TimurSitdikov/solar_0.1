package com.ts.aurora.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Account {
	private String id;
	private String name;
	private String userName;
	private String password;
	private AccountRole accountRole;
	private String eMail;
	private ArrayList<String> phoneNumbers;

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

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void addPhoneNumbe(String phoneNumber) {
		this.phoneNumbers.add(phoneNumber);
	}

	public void deletePhoneNuber(String phoneNumber) {
		this.phoneNumbers.remove(phoneNumber);
	}

	@Override
	public String toString() {
		return "Account [id = " + id + ", name = " + name + ", userName = " + userName + ", password = " + password
				+ ", accountRole = " + accountRole + "]";
	}

	}


