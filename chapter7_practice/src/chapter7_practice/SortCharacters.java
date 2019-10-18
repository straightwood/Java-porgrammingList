package chapter7_practice;

import java.util.Scanner;
public class SortCharacters {

	public static String sort(String s){
		char[] ch = s.toCharArray();
		for (int i=0;i<ch.length-1 ;i++ ) {
			for (int j=0;j<ch.length-1 ;j++ ) {
				if (ch[j]>ch[j+1]) {
					char temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
		}
		s = String.valueOf(ch);
		return s;
	}

	public static void main(String[] args) {
		System.out.print("Enter the list: ");
		Scanner input = new Scanner(System.in);
		String s = input.next();
		String newstring = sort(s);
		System.out.println("The sorted list is: "+newstring);
		input.close();
	}

}
