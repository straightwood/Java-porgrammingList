package chapter11_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class TextBox {

	public static void main(String[] args) {
		int flag=0;
		ArrayList<Integer>arr = new ArrayList<>();
		ArrayList<Integer>box = new ArrayList<>();
		ArrayList<String>s = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of object: ");
		int m = input.nextInt();
		for(int i=0;i<m;i++) {
			int tem=input.nextInt();
			arr.add(tem);
			box.add(10);
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				if(arr.get(i)<box.get(j)) {
					s.add(String.valueOf(arr.get(i)));
					box.set(j, box.get(j)-arr.get(i));
					break;
					
				}
			}
		}
		for(int i=0;i<arr.size();i++) {
			System.out.println(s.get(i));
		}

	}

}
