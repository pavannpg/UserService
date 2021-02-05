package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepo;
import com.example.demo.VO.DepartmentVO;
import com.example.demo.VO.ResponseTemplate;

@Service
public class UserService {
	
@Autowired	
UserRepo userRepo;
@Autowired
RestTemplate restTemplate;
public User saveUser(User user)
{
	return userRepo.save(user);
}
public User getUser(int id)
{
	return userRepo.findUserById(id);
}
public ResponseTemplate getUserWithDepartment(int id) {
	ResponseTemplate response = new ResponseTemplate();
	User user = userRepo.findUserById(id);
	DepartmentVO department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/"+id, DepartmentVO.class);
	response.setUser(user);
	response.setDepartment(department);
	return response;
}
}
