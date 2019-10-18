package chapter7_practice;

import java.util.Scanner;
public class QuickSort {
    
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        temp = arr[low];
 
        while (i<j) {
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
 
        }
        arr[low] = arr[i];
        arr[i] = temp;
        //quickSort(arr, low, j-1);		//递归调用则是快排
        //quickSort(arr, j+1, high);
    }
 
 
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter list size: ");
    	int size = input.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter list content: ");
        for (int i=0;i<size ;i++ ) {
        	arr[i] = input.nextInt();
        }
        input.close();
        quickSort(arr, 0, arr.length-1);
        System.out.print("After the partition, the list is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
