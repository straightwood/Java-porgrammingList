package chapter7;

public class SelectionSort {	//选择排序

	public static void selectionSort(double[] list){
		for (int i=0 ;i<list.length ;i++ ) {
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j=i+1;j<list.length ;j++ ) {
				if (currentMin>list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			//需要的时候交换位置
			if (currentMinIndex!=i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}


	public static void main(String[] args) {
		double[] list = {1,9,4.5,6.6,5.7,-4.5};
		selectionSort(list);
		for (int i=0 ;i<list.length ;i++ ) {
			System.out.println(" "+list[i]);
		}
	}

}
