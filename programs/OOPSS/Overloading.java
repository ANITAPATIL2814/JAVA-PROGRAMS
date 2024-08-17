package OOPS;
//shape.java
public class Overloading {

	public static void main(String[] args) {
		Shape s= new Shape();
		System.out.println("area of circle");
		System.out.println(s.calcArea(5.5));
		System.out.println(s.calcArea(10.5, true));
		System.out.println("Area of rect");
		System.out.println(s.calcArea(10,20));
		System.out.println(s.calcArea(5.5,10.3));

	}

}
