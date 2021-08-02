package Assignment3;

public class Rectangle extends shape {
	double width;
	double height;

	public Rectangle(double width, double height) {
		super(4);
		this.width=width;
		this.height=height;
	}

	@Override
	public double getArea() {
		return width * height;
		}

	@Override
	public double getPerimeter() {
		return 2.0 * (width + height);
	}

	@Override
	public void resize(double x) {
		// TODO Auto-generated method stub
		width = width * x;
		height = height * x;
		
	}

}
