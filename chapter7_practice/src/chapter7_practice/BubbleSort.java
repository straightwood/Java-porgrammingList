package chapter7_practice;

import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		double[] array = new double[10];
		Scanner input = new Scanner(System.in);
		input.close();
		for (int i=0;i<10 ;i++ ) {
			array[i]=input.nextInt();
		}
		for (int i=0;i<9 ;i++ ) {
			for (int j=0;j<9 ;j++ ) {
				if (array[j]>array[j+1]) {
					double temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			
		}
		for (int i=0;i<10 ;i++ ) {
			System.out.print(array[i]+" ");
		}
	}

}
