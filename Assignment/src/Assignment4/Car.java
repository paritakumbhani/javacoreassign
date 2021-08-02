package Assignment4;

public class Car {

	protected String engine;
    protected int doors;
	protected int wheels = 4;
	protected String name;
	
	
	//default constructor
	public Car() {}
	
	//parameterize constructor
	public Car(String name, int doors, String engine) {
		this.name= name;
		this.doors= doors;
		this.engine= engine;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void startEngine() {
		System.out.println("Engine Started");
	}
	
	public void accelerate() {
		System.out.println("Accelerating");
	}
	
	public void brake() {
		System.out.println("Breaking");
	}
	
}
