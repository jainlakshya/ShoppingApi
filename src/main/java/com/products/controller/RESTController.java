package com.products.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.dao.ProductDetails;
import com.products.services.ProductDetailsService;

@RestController
@RequestMapping("/products")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RESTController {
	
	@Autowired
	public ProductDetailsService productDetailsService;

	@CrossOrigin
	@GetMapping(value="getProductDetails")
	public List<ProductDetails> getProductDetails() {
			
		return productDetailsService.getProductDetails();
	}

}
