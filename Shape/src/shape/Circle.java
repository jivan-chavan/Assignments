package shape;

public class Circle implements Shape{

	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of circle = "+3.14*radius*radius);
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("Perimeter of Circle is = "+2*3.14*radius);
	}

}
