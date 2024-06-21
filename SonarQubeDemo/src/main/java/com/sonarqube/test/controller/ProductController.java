package com.sonarqube.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@GetMapping("/product")
	public String getProducts() {
		return getproduct();
	}

	public String getproduct() {
		String productName = "<h1> Washing Machine </h1>";
		Object prodObj = getMethod();
		System.out.println(prodObj.toString());
		return productName;
	}

	public Object getMethod() {
		return "test";
	}

}
