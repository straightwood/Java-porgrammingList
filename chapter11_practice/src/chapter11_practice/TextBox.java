package chapter11_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class TextBox {

	public static void main(String[] args) {
		int flag=0;
		ArrayList<Integer>arr = new ArrayList<>();
		ArrayList<Integer>box = new ArrayList<>();
		//ArrayList<String>s = new ArrayList<>();
		
		//将物件重量读入数组
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of object: ");
		int m = input.nextInt();
		System.out.print("Enter the weights of objects: ");
		for(int i=0;i<m;i++) {
			int tem=input.nextInt();
			arr.add(tem);
		}
		
		//开m*2的二维数组 第一个元素放剩余空间 第二个元素放字符串
		String[][] boxes = new String[m][3];
		for(int i=0;i<m;i++) {
			boxes[i][0]="10";
			boxes[i][1]="";
		}

		//依次读入物品重量
		for(int j=0;j<m;j++) {
			//System.out.print(j+"-");
			for(int i=0;i<m;i++) {
				if(arr.get(j)<Integer.parseInt(boxes[i][0])) {
					boxes[i][1]+=" "+arr.get(j).toString();
					boxes[i][0]=Integer.toString(Integer.parseInt(boxes[i][0])-arr.get(j));
					//System.out.println(i+": "+boxes[i][0]+"+"+boxes[i][1]);
					break;
				}
			}
		}
		
		//打印结果
		for(int i=0;i<m;i++) {
			if(boxes[i][0]!="10") {
				System.out.println("Container "+ (i+1) + " contains objects with weight"+boxes[i][1]);
			}
			
		}


	}

}
