
public class CircleTest {
	public static void main(String[] args) {
		Circle obj1 = new Circle();
		Circle obj2 = new Circle(10);
		Circle obj3 = new Circle(100);

		System.out.println("radius " + obj1.radius + "의 면적 = " + obj1.getArea());
		System.out.println("radius " + obj2.radius + "의 면적 = " + obj2.getArea());
		System.out.println("radius " + obj3.radius + "의 면적 = " + obj3.getArea());
	}
}

class Circle {
	public int radius;
	public String color;
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	Circle(int input)
	{
		radius = input;
	}
	
	Circle(.)
	{
		this(1);
	}
	
	Circle()
	{
		this(100);
	}
	
	Circle()
	{
		this(10);
	}
}

