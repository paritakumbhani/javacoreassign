package Assignment3;

public abstract class shape implements Resizable {

	double numSides;
	
	public shape(double numSides) {
		this.numSides=numSides;
		}
	
	public double getNumSides() {
		return numSides;
}
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
