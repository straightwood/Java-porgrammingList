package chapter7_practice;

import java.util.Scanner;
public class IsSorten {
	public static boolean IsSorted(int[] list){
		for (int i=0;i<list.length-1 ;i++ ) {
			if (list[i]>list[i+1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the list: ");
		int sumN = input.nextInt();
		int[] numbers = new int[sumN];

		System.out.print("Enter the contents of the list: ");
		for (int i=0;i<sumN ;i++ ) {
			numbers[i] = input.nextInt();
		}
		input.close();

		System.out.print("The list has "+sumN+" integers ");
		for (int i=0;i<sumN ;i++ ) {
			System.out.print(numbers[i]+" ");
		}
		
		//boolean flag = IsSorted(numbers);
		if (IsSorted(numbers)) {
			System.out.println("\nThe list is already sorted");
		}
		else{
			System.out.println("\nThe list is not sorted");
		}
		
	}

}
