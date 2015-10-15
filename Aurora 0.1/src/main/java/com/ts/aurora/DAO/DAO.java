package com.ts.aurora.DAO;

public interface DAO {

	public Object getByID(int id);

	public void update(Object obj);

	public void delete(int id);

	public void add(Object obj);

}
