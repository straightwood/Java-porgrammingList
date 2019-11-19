package chapter11_practice;

import java.util.Scanner;
public class TextPerfectSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer m:");
		int m = input.nextInt();
		
		PerfectSquare ps = new PerfectSquare();
		ps.CreateArray(m);
		
		System.out.println("The smallest number n for m*n to be a perfect square is "+ps.Calculate(m));
		System.out.println("m * n is "+m*ps.Calculate(m));
		//检验最小因数
		//ps.PrintArray();
	}

}
