package com.sonarqube.controller.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sonarqube.test.controller.ProductController;

@ContextConfiguration(classes = { ProductController.class })
@ExtendWith(SpringExtension.class)

public class ProductControllerTest {
	@Autowired
	public ProductController controller;

	@org.junit.jupiter.api.Test
	public void testGetMessage() {
		String message = controller.getProducts();
		Assertions.assertNotNull(message);
		System.out.println("Junit Success");
	}

}