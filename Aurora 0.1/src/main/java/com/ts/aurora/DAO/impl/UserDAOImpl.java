package com.ts.aurora.DAO.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ts.aurora.DAO.UserDAO;
import com.ts.aurora.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory session;

	@Override
	public User getByID(int id) {
		return (User) session.getCurrentSession().get(User.class, id);
	}

	@Override
	public void update(Object obj) {
		if (obj instanceof User) {
			User account = (User) obj;
			session.getCurrentSession().update(account);
		}
	}

	@Override
	public void delete(int id) {
		session.getCurrentSession().delete(getByID(id));
	}

	@Override
	public void add(Object obj) {
		if (obj instanceof User) {
			User account = (User) obj;
			session.getCurrentSession().save(account);
		}
	}

	@Override
	public User getByUserName(String userName) {
		Criteria criteria = session.getCurrentSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("username", userName));
		return (User) criteria.uniqueResult();
	}

	@Override
	public List<User> getAllAccounts() {
		return session.getCurrentSession().createQuery("FROM accounts").list();
	}

}
