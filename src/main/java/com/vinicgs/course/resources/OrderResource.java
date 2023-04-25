package com.vinicgs.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicgs.course.entities.Order;
import com.vinicgs.course.entities.User;
import com.vinicgs.course.services.OrderServices;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderServices services;

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {

		List<Order> list = services.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order objOrder = services.findById(id);
		return ResponseEntity.ok().body(objOrder);
		
	}
	

}
