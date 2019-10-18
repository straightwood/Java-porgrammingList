package chapter7_practice;

public class LStatus {

	public static void main(String[] args) {
		boolean[] L = new boolean[100];
		for (int i=0;i<100 ;i++ ) {
			L[i] = false;
		}
		for (int i=1;i<=100 ;i++ ) {
			for (int j=i;j<=100;) {
				L[j-1] = !L[j-1];
				j+=i;
			}
		}
		for (int i=0;i<100;i++) {
			if (L[i] == true) {
				System.out.print((i+1)+" ");
			}
		}
	}
}
