package com.medical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.medical.model.Login;
import com.medical.service.LoginService;

@RestController
@Component

public class LoginController {
	@Autowired
	LoginService loginService;

	@PostMapping("/Login")
	@CrossOrigin("*")
	public ResponseEntity<String> userLogin(@RequestBody Login login) {

		System.out.println("in controller");
		List<Login> list = loginService.findAll();
		boolean flag = false;
		for(Login user : list)
		{
			if(user.getUserName().equals(user.getUserName()) && user.getPassword().equals(user.getPassword()))
			{
				flag = true;
			}
			else
			{
				flag = true;
			}
		}

		if(flag)
		{
			return new ResponseEntity<String>("suceessfully login",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("login failed",HttpStatus.NO_CONTENT); 

		}
	}

}
