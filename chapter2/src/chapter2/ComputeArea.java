package chapter2;

public class ComputeArea {

	public static void main(String[] args) {
		double radius; //declare radius
		double area; //declare area
		
		//assign a radius
		radius = 20; //radius is now 20
		
		//compute area
		area = radius * radius * 3.14159;
		
		//display results
		System.out.println("The area for the circle of radius "+ radius + " is " + area);
	}
}