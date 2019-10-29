package chapter9_practice;

public class Location {
	private static double temp;
	private static int i;
	private static int j;
	
	public static int row = 0;
	public static int column = 0;
	public static double maxValue;
	
	public static Location locateLargest(double[][] a) {
		//Location location = new Location();
		temp = a[0][0];
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[0].length;j++) {
				if(a[i][j]>temp) {
					row = i;
					column = j;
					maxValue = a[i][j];
					temp = a[i][j];
				}
			}
		}
		return null;
	}
	public int getRow() {
		return row;
	}
	public int getColumn() {
		return column;
	}
	public double getMaxValue() {
		return maxValue;
	}
}
