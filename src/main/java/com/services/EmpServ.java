package com.services;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.Model.Emp;
import com.Repo.EmpRepo;

@Service
public class EmpServ {

	
	@Autowired
	private EmpRepo repo;
	//localhost:8080/get?pageNo=2&pageSize=2 hit this in postman
	public List<Emp> getAllEmp(Integer pageNo,Integer pageSize,String sortBy){
		PageRequest page=PageRequest.of(pageNo, pageSize,Sort.by(sortBy));
		Page<Emp> pageable= repo.findAll(page);
		if (pageable.hasContent()) {
		return pageable.getContent();
	}else {
		return new ArrayList<Emp>();
	}
	}	
	
}
