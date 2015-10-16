package com.ts.aurora.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String name;
	private String userName;
	private String password;
	@ManyToMany
	@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id") , inverseJoinColumns = @JoinColumn(name = "role_id") )
	private List<UserRole> userRoles;
	private String eMail;
	private ArrayList<String> phoneNumbers;
	@Enumerated(EnumType.STRING)
	private UserStatus accountStatus;

	public User() {}

	public User(String id, String name, String userName, String password, List<UserRole> accountRoles,
			String eMail, ArrayList<String> phoneNumbers, UserStatus accountStatus) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.userRoles = accountRoles;
		this.eMail = eMail;
		this.phoneNumbers = phoneNumbers;
		this.accountStatus = accountStatus;
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

	public List<UserRole> getAccountRoles() {
		return userRoles;
	}

	public void setAccountRoles(List<UserRole> accountRoles) {
		this.userRoles = accountRoles;
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

	public UserStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(UserStatus accountStatus) {
		this.accountStatus = accountStatus;
	}


	@Override
	public String toString() {
		return "Account [id = " + id + ", name = " + name + ", userName = " + userName + ", password = " + password
				+ ", accountRoles = " + userRoles + ", eMail = " + eMail + ", phoneNumbers = " + phoneNumbers
				+ ", accountStatus = " + accountStatus + "]";
	}



	}


