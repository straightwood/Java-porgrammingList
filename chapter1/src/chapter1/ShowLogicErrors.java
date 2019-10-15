package chapter1;

public class ShowLogicErrors {
	public static void main(String[] args) {
		System.out.print("Celsius 35 is Fahrenheit degree ");
		System.out.println((9/5)*35+32); //整数相除不保留小数部分，结果为1；应该9.0/5，这样得到1.8
	}
}
