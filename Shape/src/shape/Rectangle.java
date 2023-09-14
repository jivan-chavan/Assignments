package shape;

public class Rectangle implements Shape{

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void calculateArea() {

		System.out.println("Area of Rectangle = "+length*breadth);
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("Perimeter of Rectangle = "+2*(length+breadth));
		
	}

}
