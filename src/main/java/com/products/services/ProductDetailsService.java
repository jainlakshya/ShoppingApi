package com.products.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.products.dao.ProductDetails;
import com.products.dao.ProductDetailsRepository;

@Service
@Transactional
public class ProductDetailsService {

	
	@Autowired
	ProductDetailsRepository productDetailsRepository;
	

	public List<ProductDetails> getProductDetails() {
		List<ProductDetails> productDetailsDAO = new  ArrayList<ProductDetails>();
		productDetailsDAO = productDetailsRepository.findAllByOrderByIdAsc();
		return productDetailsDAO;
	}
	
}
	
