package chapter9;

public class CircleWithStaticMenbers {
	double radius;
	static int numberOfObjects = 0;
	CircleWithStaticMenbers(){
		radius = 1;
		numberOfObjects++;
	}
	CircleWithStaticMenbers(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	static int getNumberOfObjects(){
		return numberOfObjects;
	}
	double getArea(){
		return radius*radius*Math.PI;
	}
}
