package com.test.zoo;

/***
   

 ***/
public class Elephant extends Animal {

	public Elephant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Elephant(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("Elephant of name " +getName()+" having an age " +getAge()+" years, is Sound like EEEE");

	}

	
}
