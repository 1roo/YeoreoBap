package com.spring.yeoreobap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	// ȸ������ �������� �̵�
	@GetMapping("/userJoin")
	public void userJoin() {}
	
	// �α��� �������� �̵�
	@GetMapping("/userLogin")
	public void userLogin()	{}
}
