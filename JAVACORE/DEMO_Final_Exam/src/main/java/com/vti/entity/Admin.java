package com.vti.entity;

public class Admin extends User {
	private int ExpInYear;

	public Admin(int id, String fullName, String email, String password, int ExInYear) {
		super(id, fullName, email, password, Role.Admin);
		this.ExpInYear = ExInYear;
	}

	public int getExpInYear() {
		return ExpInYear;
	}

	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}

}
