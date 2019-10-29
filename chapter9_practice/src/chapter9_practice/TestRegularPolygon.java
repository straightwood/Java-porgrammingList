package chapter9_practice;

public class TestRegularPolygon {

	public static void main(String[] args) {
		RegularPolygon one = new RegularPolygon();
		RegularPolygon two = new RegularPolygon(6,4);
		RegularPolygon three = new RegularPolygon(10,4,5.6,7.8);
		
		System.out.println("The area of the one of area " + one.getArea() + ", and the perimeter is " + one.getPerimeter());
		System.out.println("The area of the two of area " + two.getArea() + ", and the perimeter is " + two.getPerimeter());
		System.out.println("The area of the three of area " + three.getArea() + ", and the perimeter is " + three.getPerimeter());

	}

}
