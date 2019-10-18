package chapter7_practice;

import java.util.Scanner;
public class Merge {
	public static int[] merge(int[] list1,int[] list2){
		int[] list3 = new int[list1.length+list2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<list1.length && j<list2.length){
			if (list1[i] <= list2[j]) {
				list3[k++] = list1[i];
				i++;

			}
			else{
				list3[k++] = list2[j];
				j++;
			}
		}
		while (i<list1.length) {
			list3[k++]=list1[i];
			i++;
		}
		while (j<list2.length) {
			list3[k++]=list2[j];
			j++;
		}
		return list3;
	}

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);

		System.out.print("Enter list1 size and contents: ");
		int size1 = input.nextInt();
		int[] numbers1 = new int[size1];
		for (int i=0;i<size1 ;i++ ) {
			numbers1[i] = input.nextInt();
		}
		System.out.print("Enter list2 size and contents: ");
		int size2 = input.nextInt();
		int[] numbers2 = new int[size2];
		for (int i=0;i<size2 ;i++ ) {
			numbers2[i] = input.nextInt();
		}
		input.close();
		
		System.out.print("\nlist1 is ");
		for (int i=0;i<numbers1.length ;i++ ) {
			System.out.print(numbers1[i]+" ");
		}
		System.out.print("\nlist2 is ");
		for (int i=0;i<numbers2.length ;i++ ) {
			System.out.print(numbers2[i]+" ");
		}

		int[] newlist = new int[numbers1.length+numbers2.length];
		newlist = merge(numbers1,numbers2);
		System.out.print("\n");
		for (int i=0;i<newlist.length ;i++ ) {
			System.out.print(newlist[i]+" ");
		}

	}

}
