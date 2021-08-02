package Assignment3;

public class RtTriangle extends shape{
	
	double width;
	double height;

	public RtTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5* (width * height);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		double hypotenuse = Math.sqrt((width * width) + (height * height));
		return hypotenuse + width + height;
	}

	@Override
	public void resize(double x) {
		// TODO Auto-generated method stub
		width = width * x;
		height = height * x;
	}

}
