package com.dao;

public class UserDao {

	String dbName;

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public void abcd() {
		System.out.println("userDao init");

	}

	public void destroy() {
		System.out.println("destroy -- userDao");
	}

}
