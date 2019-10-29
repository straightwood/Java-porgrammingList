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

		//Location local = locateLargest(array);
		System.out.print("The location of the largest element is "+locateLargest(array).maxValue+
				" at ("+locateLargest(array).row+","+locateLargest(array).column+")");
	}
	public static Location locateLargest(double[][] a) {
		int row = 0;
		int column = 0;
		double maxValue = a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]>maxValue) {
					row = i;
					column = j;
					maxValue = a[i][j];
				}
			}
		}
		Location location = new Location();
		location.row = row;
		location.column = column;
		location.maxValue = maxValue;
		
		return location;
	
	}
}
class Location {
	
	public int row = 0;
	public int column = 0;
	public double maxValue;
}
