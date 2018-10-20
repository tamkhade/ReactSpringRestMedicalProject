package com.medical.controller;

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
public class SignUpController {
	
	@Autowired
	LoginService loginService;

	@PostMapping("/SignUp")
	@CrossOrigin("*")
	public ResponseEntity<String> userLogin(@RequestBody Login login) {

		System.out.println("in controller");
		Login l = loginService.save(login);
		if(l!= null) {

			return new ResponseEntity<String>("suceessfully SignUp",HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("login failed",HttpStatus.NO_CONTENT); 
		}
	}

}
