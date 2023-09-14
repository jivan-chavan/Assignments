package com.main;

import java.util.List;

import com.entity.Hospital;
import com.operation.Operation;

public class Main {

	public static void main(String[] args)  {
		
	Operation operation = new Operation();
	
	Hospital product1 = new Hospital( "Laptop",50000);
	operation.insertProduct(product1);
	
	operation.deleteProduct(2);

	List<Hospital> list= operation.getAllProducts();
	System.out.println("Details of all products are: "+list);
	
	Hospital updateProduct = new Hospital(4,"SSD",4000);
	operation.updateProduct(updateProduct);
	
	Hospital getProduct= operation.getProductById(4);
	System.out.println(getProduct);
	operation.closeConnection();
	}
}
