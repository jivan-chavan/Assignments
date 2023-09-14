package com.test.zoo;

/***
   

 ***/
public class Lion extends Animal {

	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lion(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("Lion of name " +getName()+" having an age " +getAge()+" years is Sound like LLLL");
	}

}
