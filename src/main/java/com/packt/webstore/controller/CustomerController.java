/*package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.webstore.domain.repository.CustomerRepository;

@Controller
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;
	
	@RequestMapping("/customers")
	public String list(Model model) {
		model.addAttribute("customers", customerRepository.getAllCustomers());
		return "customers";
	}
}
*/