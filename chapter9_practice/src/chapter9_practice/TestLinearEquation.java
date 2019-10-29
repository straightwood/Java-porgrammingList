package chapter9_practice;

import java.util.Scanner;
public class TestLinearEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一条线段的第一个端点： ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("请输入第一条线段的第二个端点： ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.print("请输入第二条线段的第一个端点： ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		System.out.print("请输入第二条线段的第二个端点： ");
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		input.close();
		
		double a = y1-y2;
		double b = x1-x2;
		double c = y3-y4;
		double d = x3-x4;
		double e = (y1-y2)*x1-(x1-x2)*y1;
		double f = (y3-y4)*x3-(x3-x4)*y3;
		LinearEquation point = new LinearEquation(a,b,c,d,e,f);
		if(point.isSolvable()) {
			System.out.println("交点为：（"+point.getX()+","+point.getY()+")");
		}
		else {
			System.out.println("没有交点");
		}

	}

}
