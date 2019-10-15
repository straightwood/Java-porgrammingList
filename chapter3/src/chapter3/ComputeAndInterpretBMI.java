package chapter3;

import java.util.Scanner;
public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter weight in pounds
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		//prompt the user to enter height in inches
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		
		final double KILOGRAMS_PER_PROUND = 0.45359237; //constant
		final double MTERS_PER_INCH = 0.0254; //constant
		
		//compute BMI
		double weightInKilograms = weight * KILOGRAMS_PER_PROUND;
		double heightInMeters = height * MTERS_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		//display result
		System.out.println("BMI is " + bmi);
		if(bmi<18.5)
			System.out.println("Underweight");
		else if(bmi<25)
			System.out.println("Normal");
		else if(bmi<30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
		
		input.close();
	}
}
