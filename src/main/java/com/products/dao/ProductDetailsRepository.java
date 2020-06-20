package com.products.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailsRepository extends JpaRepository<ProductDetails, String>{
	
	//Fetch all products from DB by id
	List<ProductDetails> findAllByOrderByIdAsc ();

}
