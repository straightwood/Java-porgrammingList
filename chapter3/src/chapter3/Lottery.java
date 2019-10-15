package chapter3;

import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		//generate a lottery number
		int lottery = (int)(Math.random()*100);
		
		//prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		
		//get digits from lottery
		int lotteryDigit1 = guess / 10;
		int lotteryDigit2 = guess % 10;
		
		//get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.println("The lottery number is " + lottery);
		
		//check the guess
		if(guess == lottery)
			System.out.println("Exact match: you win $10,000");
		else if (lotteryDigit2 == guessDigit1 && guessDigit2 == lotteryDigit1)
			System.out.println("Exact match: you win $3,000");
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
			System.out.println("Exact match: you win $1,000");
		else
			System.out.println("Sorry, no match");
		
		input.close();
	}
}
