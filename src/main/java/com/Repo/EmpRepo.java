package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Model.Emp;

@Repository
public interface EmpRepo extends JpaRepository<Emp, Integer>{

	

}
