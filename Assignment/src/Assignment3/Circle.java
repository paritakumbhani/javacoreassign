package Assignment3;




public class Circle extends shape {
	
	double radius;

	public Circle(double radius) {
		super(0);
		this.radius = radius;
	}
	@Override
	public void resize(double x) {
		radius = radius * x;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

}
