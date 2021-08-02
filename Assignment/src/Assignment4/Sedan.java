package Assignment4;

public class Sedan extends Car{

	protected int doors = 4;
	
	@Override
	public String getEngine() {
		return super.getEngine();
	}

	@Override
	public void setEngine(String engine) {
		super.setEngine(engine);
	}

	@Override
	public int getDoors() {
		return doors;
	}

	@Override
	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

}
