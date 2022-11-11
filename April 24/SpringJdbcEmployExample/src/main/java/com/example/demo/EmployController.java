package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {

	@Autowired 
	EmployDAO dao;
	
	@RequestMapping("/")
	public List<Employ> showEmploy() {
		return dao.showEmploy();
	}
	
	@RequestMapping("/search/{empno}")
	public Employ searchEmploy(@PathVariable int empno) {
		return dao.searchEmploy(empno);
	}
}
