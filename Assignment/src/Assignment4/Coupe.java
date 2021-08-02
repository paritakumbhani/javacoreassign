package Assignment4;

public class Coupe extends Car{
	
	protected String engine = "3.0 L 6-cylinder";
	protected int doors = 2;
	
	@Override
	public String getEngine() {
		
		return engine;
	}

	@Override
	public void setEngine(String engine) {
		
			this.engine = engine;
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
