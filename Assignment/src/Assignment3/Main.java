package Assignment3;

public class Main {
	public static void main(String[] args) {
		
		
		shape rtTriangle = new RtTriangle(2, 3);
		System.out.println("Area of Right angle Triangle is " + rtTriangle.getArea() + " ,Perimeter of right angle Triangle is " + rtTriangle.getPerimeter());
		rtTriangle.resize(2);
		System.out.println("After resize by factor 2: Area of Right angle Triangle is " + rtTriangle.getArea() + " ,Perimeter of right angle Triangle is " + rtTriangle.getPerimeter() + "\n");
		
		
		shape rectangle= new Rectangle(2,3);
		System.out.println("Area of Rectangle is " + rectangle.getArea() + " ,Perimeter of Rectangle is " + rectangle.getPerimeter());
		rectangle.resize(2);
		System.out.println("After resize by factor 2: Area of Rectangle is " + rectangle.getArea() + " ,Perimeter of Rectangle is " + rectangle.getPerimeter()+ "\n");
		
		shape circle= new Circle(2);
		System.out.println("Area of Circle is " + circle.getArea() + " ,Perimeter of Circle is " + circle.getPerimeter());
		rectangle.resize(2);
		System.out.println("After resize by factor 2: Area of Circle is " + circle.getArea() + " ,Perimeter of Circle is " + circle.getPerimeter()+ "\n");
		

	}	
}
