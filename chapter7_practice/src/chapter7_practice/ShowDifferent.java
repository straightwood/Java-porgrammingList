package chapter7_practice;

import java.util.Scanner;
public class ShowDifferent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 10 integers: ");
		
		int[] list = new int[10];
		boolean[] count = new boolean[10];
		int temp=10;
		for (int k=0;k<10 ;k++ ) {
			count[k]=true;
		}
		for (int j=0;j<10 ;j++ ) {
		 	list[j] = input.nextInt();
		 	for (int i=j-1;i>=0;i-- ) {
		 		if (list[i]==list[j]) {
		 			count[j]=false;
		 			temp--;
		 			break;
		 		}
		 	}
		}
		System.out.println("The number of distinct number is "+temp);
		for (int i=0;i<10 ;i++ ) {
			if(count[i]==true) {
				System.out.print(list[i]+" ");
			}
		}
		input.close();
	}

}