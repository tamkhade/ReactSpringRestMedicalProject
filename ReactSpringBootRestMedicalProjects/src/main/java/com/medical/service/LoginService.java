package com.medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.medical.dao.LoginDao;
import com.medical.model.Login;

@Service
public class LoginService {

@Autowired(required = true)
 LoginDao loginDao;
 
 public Login save (Login login)
 {
	 return loginDao.saveAndFlush(login);
	 
 }
 
 public List<Login> findAll()
 {
	 return loginDao.findAll();
	 
 }

}
