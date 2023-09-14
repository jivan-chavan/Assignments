package com.test.zoo;

/***
   

 ***/
public class Zoo {

	public static void main(String[] args) {
		Animal animal1= new Lion("Simba",5);
		animal1.makeSound();
		Animal animal2=new Elephant("Gajraj",10);
		animal2.makeSound();
		Animal animal3= new Giraffe("Giresh",15);
		animal3.makeSound();
	}
}
