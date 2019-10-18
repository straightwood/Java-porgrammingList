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
		System.out.println("������ѧ����: ");
		int stuNumT = input.nextInt();
		
		PrintGrades objArr[] = new PrintGrades[stuNumT];	//�Զ����࿪���飬��СΪѧ������
		
		for(int i = 0; i < objArr.length; i++){
			objArr[i] = new PrintGrades();					//������ÿ��Ԫ�ض����Ǹ��Զ�����
			
			System.out.println("�������" + (i+1) + "��ѧ��������");
			String name = input.next();
			objArr[i].setName(name);
			
			System.out.println("�������" + (i+1) + "��ѧ���ĳɼ�");
			int grade = input.nextInt();
			objArr[i].setGrade(grade);
		}
		input.close();
		
		PrintGrades s = new PrintGrades();
		for(int i = 0; i < objArr.length; i++){				//	����
			for(int j = i+1; j < objArr.length; j++){
				if(objArr[i].getGrade() < objArr[j].getGrade()){
					s = objArr[i];
					objArr[i] = objArr[j];
					objArr[j] = s;
				}
			}
		}
		for(int i=0; i < objArr.length; i++){
			System.out.println(objArr[i].getName()+"�ĳɼ��ǣ�"+objArr[i].getGrade());
		}
	}
}

