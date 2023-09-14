package com.test.zoo;

/***
   

 ***/
public class Giraffe extends Animal {

	public Giraffe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Giraffe(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("Giraffe of name " +getName()+" having an age " +getAge()+" years, is Sound like GGGG");
	}

}
