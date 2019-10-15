package chapter2;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		//create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter a radius
		System.out.print("Enter a number for radius:");
		double radius = input.nextDouble(); //����nextDouble()������ȡһ��doubleֵ
		
		//compute area
		double area = radius*radius*4.14159;
		
		//display result
		System.out.println("The area for the circle of radius " + radius + " is " + area);
		input.close();
	}

}
