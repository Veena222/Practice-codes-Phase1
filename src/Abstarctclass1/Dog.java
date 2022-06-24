package Abstarctclass1;

import AbstractClassDemo.Animal;
import AbstractClassDemo.AnimalInterface;

public class Dog extends Animal implements AnimalInterface{
	
	
	public void eat() {
		System.out.println("Dog eats");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
System.out.println("bark");
		
	}
		
	}


