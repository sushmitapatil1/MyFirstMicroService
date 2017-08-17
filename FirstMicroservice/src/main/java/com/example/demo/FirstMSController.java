package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstms")
public class FirstMSController {
	
	 @Autowired
	 public FirstMSRepository firstMSRepository;
	 
	 @RequestMapping("/create")
	 public String create(FirstMicroservice todo) {
	  todo = firstMSRepository.save(todo);
	  return "Todo created successfully";
	 }
	 
	@RequestMapping("/all")
	 public List<FirstMicroservice> readAll() {
	  return firstMSRepository.findAll();
	}
}
