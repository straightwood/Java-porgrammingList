package chapter7_practice;

//7-3
import java.util.Scanner;
public class CalculateTimes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		
		int[] list = new int[100];
		for (int j=0;j<100 ;j++ ) {
		 	list[j]=0;
		}
		
		int temp = input.nextInt();
		while (temp!=0) {
		 	list[temp-1]++;
		 	temp = input.nextInt();
		} 
		
		for (int j=0;j<100 ;j++ ) {
			if(list[j]!=0) {
				System.out.println((j+1)+" occurs "+list[j]+" times");
			}
		}
		input.close();
	}

}

