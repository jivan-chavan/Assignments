package shape;

public class Main {


public static void main(String[] args) {
	Shape[] s1 = {new Circle (15), new Triangle(10, 20, 30, 40), new Rectangle(5, 6)};
	
	//by for loop
for(int i=0; i<s1.length; i++) {
	s1[i].calculateArea();
	s1[i].calculatePerimeter();
}

//by for each loop
for (Shape shape : s1) {
	shape.calculateArea();
	shape.calculatePerimeter();
}


}
}
