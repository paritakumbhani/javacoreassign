package Assignment4;
/* A. Inheritance is important oop in java, it allows child class to inherit
 * fields and methods of parent class. Here, Car Class is parent class and 
 * Sport, Coupe and Sedan are child classes. To inherit all methods and fields, we used
 * extends keyword which means Sport, Coupe and Sedan classes are inheriting all properties from car class. 
 * One type of vehicle is car and it has many types with multiple manufacturer, So we create car(parent) class
 * which can be inherited by its child classes.
 */
/*B. Polymorphism in Java can be defined as a task that can perform a single action in different ways. 
 * Here we showed multiple cars with different type and engine. Parent class has methods getter and setter methods
 * called engine type, doors, wheels and name. And subclasses of car, they also have their own implementation of car engine type,
 * number of doors, number of wheels and name of manufacturer.
 */
public class Vehicle {

	public static void main(String[] args) {
		
		//Coupe
		Car bmw = new Coupe();
		bmw.setName("BMW M2 Coupe");
		System.out.println("Coupe car model name is " + bmw.getName() + " has engine " + bmw.getEngine()  + 
				" type, has " + bmw.getDoors() + " doors and " + bmw.getWheels() + " wheels. \n" );
		bmw.startEngine();
		
		
		//Sport
		Car audi = new Sport();
		audi.setDoors(2);
		System.out.println("Sport car model name is " + audi.getName() + " has engine " + audi.getEngine()  + 
				" type, has " + audi.getDoors() + " doors and " + audi.getWheels() + " wheels. \n" );
		
		Car mercedec = new Sport();
		mercedec.setName("Mercedes-Benz SL");
		mercedec.setDoors(2);
		System.out.println("Sport car model name is " + mercedec.getName() + " has engine " + mercedec.getEngine()  + 
				" type, has " + mercedec.getDoors() + " doors and " + mercedec.getWheels() + " wheels. \n" );
		
		//Sedan
		Car toyota = new Sedan();
		toyota.setName("Toyota Camry LE Base");
		toyota.setEngine("2.5 L 4-cylinder");
		System.out.println("Sedan car model name is " + toyota.getName() + " has engine " + toyota.getEngine()  + 
				" type, has " + toyota.getDoors() + " doors and " + toyota.getWheels() + " wheels. \n" );
	}

}
