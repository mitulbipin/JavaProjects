package FirstPackage;

abstract class Shape{
	
	abstract double area();
	public abstract String toString();
	
	String color,name; 
	
	public Shape(String color, String name) {
		this.color = color;
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public String getName() {
		return name;
	}
}

class Circle extends Shape{
	
	double radius;

	public Circle(String color, double radius, String name) {
			super(color,name);
		// TODO Auto-generated constructor stub
		this.radius = radius;
		}
	@Override
	double area() { //overriding a method in the sub class 
		return Math.PI * Math.pow(radius, 2);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Color: " + super.color + "Radius is: "+ area() + "Name: " +super.name;
	}
	
}

public class Abstraction {
	public static void main(String args[]) {
		Circle c1 = new Circle("Red",2, "Cirlce");
		System.out.println(c1.toString());
	}

}
