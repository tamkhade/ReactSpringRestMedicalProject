package com.medical.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.medical.model.Login;

@Repository
@Transactional
public interface LoginDao extends JpaRepository<Login, Long>  {

}
