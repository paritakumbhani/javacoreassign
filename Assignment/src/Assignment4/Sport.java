package Assignment4;

public class Sport extends Car{
	
	protected String name = "Audi S4";
	protected String engine = "Turbocharged 3.0, V6 Engine";


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
	
		return super.getDoors();
	}

	@Override
	public void setDoors(int doors) {
		
		super.setDoors(doors);
	}

	

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public void setName(String name) {
		
		this.name = name;
	}

}
