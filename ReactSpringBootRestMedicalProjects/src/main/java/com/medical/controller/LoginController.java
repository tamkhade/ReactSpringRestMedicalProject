package com.medical.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.medica.model.Login;

@RestController
@Component
public class LoginController {
	
	@PostMapping("/Login")
	@CrossOrigin("*")
	public ResponseEntity<String> userLogin(@RequestBody Login login) {
    	
		 String userName = login.getUserName();
		 String password =  login.getPassword();
		 System.out.println("in controller");
          
		 if(userName.equals("mahesh") && password.equals("12345")) {
			 return new ResponseEntity<String>("suceessfully login",HttpStatus.OK);
		 } else {
			 return new ResponseEntity<String>("login failed",HttpStatus.NO_CONTENT); 
		 }
    }
}
