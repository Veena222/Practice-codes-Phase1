package Runner;
import Abstarctclass1.Dog;
import AbstractClassDemo.Animal;
import AbstractClassDemo.AnimalInterface;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal obj =new Dog();//REFERENCE VARIABLE//Dynamic method dispatch //Runtime polymorphism
		AnimalInterface obj1 = new Dog();//Cannot create interface object but interface reference object can be created
		//obj.sound();
obj1.eat();
obj1.sound();
	}

}
