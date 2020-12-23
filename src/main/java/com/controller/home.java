package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Emp;
import com.services.EmpServ;

@RestController
public class home {
@Autowired
private EmpServ ser;

@GetMapping("/get")
ResponseEntity<List<Emp>> getAllEmp(@RequestParam(defaultValue = "0") Integer pageNo ,
		@RequestParam(defaultValue ="3" )Integer pageSize,
		@RequestParam(defaultValue = "id") String sortBy){
	List<Emp> list=ser.getAllEmp(pageNo, pageSize, sortBy);
	
			return new ResponseEntity<List<Emp>>(list,HttpStatus.OK);
	
	



}
	
}
