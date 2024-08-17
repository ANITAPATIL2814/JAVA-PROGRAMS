package OOPS;
//overloading: same method name
//difference - datatype or no of parameters 
public class Shape {
	//cal area of circle with no of parameters
	public double calcArea(double radius) {
		return Math.PI*radius*radius;
	}
	public double calcArea(double diameter,boolean isDiameter) {
		if(isDiameter) {
		return (Math.PI*(diameter/2)*(diameter/2));
		}
		throw new IllegalArgumentException("isDiameter must be true to calculate");
	}
	
	//calc area of rect with no of datatype 
	public int calcArea(int length,int width) {
		return length*width;
	}
	public double calcArea(double length,double width) {
		return length*width;
	}
}
