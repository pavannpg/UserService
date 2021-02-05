package com.example.demo.VO;

import com.example.demo.Entity.User;

public class ResponseTemplate {
User user;
DepartmentVO department;

public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public DepartmentVO getDepartment() {
	return department;
}
public void setDepartment(DepartmentVO department) {
	this.department = department;
}
}
