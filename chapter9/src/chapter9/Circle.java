package chapter9;

class Circle {
	double radius;

	public Circle() {
		radius = 1;
	}

	public Circle(double newRadius) {
		radius = newRadius;
	}

	double getArea() {
		return radius * radius * Math.PI;
	}

	double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	void setRadius(double newRadius) {
		radius = newRadius;
	}
}
