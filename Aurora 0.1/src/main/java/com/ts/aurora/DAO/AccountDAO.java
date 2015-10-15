package com.ts.aurora.DAO;

import java.util.List;

import com.ts.aurora.model.User;

public interface AccountDAO extends DAO {

	public User getByUserName(String userName);

	public List<User> getAllAccounts();

}
