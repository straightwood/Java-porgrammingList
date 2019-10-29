package chapter9_practice;

import java.util.Scanner;
public class TestLocation {

	public static void main(String[] args) {
		System.out.print("Enter the number of rows and dolumns in the array: ");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] array = new double[row][column];
		
		System.out.println("Enter the array: ");
		for(int i=0;i<row;i++) {
			for (int j=0;j<column;j++) {
				array[i][j] = input.nextDouble();
			}
		}
		input.close();
		
		Location local = new Location();
		System.out.print("The location of the largest element is "+local.getMaxValue()+" at ("+local.getRow()+","+local.getColumn()+")");

	}

}
