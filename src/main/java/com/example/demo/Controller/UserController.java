package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;
import com.example.demo.VO.ResponseTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

@Autowired
UserService userService;

@RequestMapping("/pavan")
public String test()
{
	return "PavanKumar";
}
@RequestMapping("/kumar")
public String test1()
{
	return "NeeliPavan";
}
@PostMapping("/")
public User saveUser(@RequestBody User user)
{
		return userService.saveUser(user);
}
@GetMapping("/{id}")
public ResponseTemplate getUser(@PathVariable("id") int id)
{
		return userService.getUserWithDepartment(id);
}
}
