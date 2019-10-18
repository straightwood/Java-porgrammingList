package chapter7_practice;

import java.util.Scanner;

public class PrintGrades {
	private String name;
	private int grade;
	public long getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生数: ");
		int stuNumT = input.nextInt();
		
		PrintGrades objArr[] = new PrintGrades[stuNumT];	//自定义类开数组，大小为学生数量
		
		for(int i = 0; i < objArr.length; i++){
			objArr[i] = new PrintGrades();					//数组内每个元素都是那个自定义类
			
			System.out.println("请输入第" + (i+1) + "个学生的姓名");
			String name = input.next();
			objArr[i].setName(name);
			
			System.out.println("请输入第" + (i+1) + "个学生的成绩");
			int grade = input.nextInt();
			objArr[i].setGrade(grade);
		}
		input.close();
		
		PrintGrades s = new PrintGrades();
		for(int i = 0; i < objArr.length; i++){				//	排序
			for(int j = i+1; j < objArr.length; j++){
				if(objArr[i].getGrade() < objArr[j].getGrade()){
					s = objArr[i];
					objArr[i] = objArr[j];
					objArr[j] = s;
				}
			}
		}
		for(int i=0; i < objArr.length; i++){
			System.out.println(objArr[i].getName()+"的成绩是："+objArr[i].getGrade());
		}
	}
}

