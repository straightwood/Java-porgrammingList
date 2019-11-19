package chapter11_practice;

import java.util.ArrayList;

public class PerfectSquare {
	ArrayList<Integer>mArray = new ArrayList<>();
	ArrayList<Integer>nArray = new ArrayList<>();
	
	public static int result=1;
	public static int flag;
	public static int index;
	
	public PerfectSquare(){
	}
	public void CreateArray(int m){
		flag=m;
		for (int i=2;i<flag ;) {
			if ((m%i==0)&& (m!=1)) {
				mArray.add(i);
				m=m/i;
			}
			else{
				i++;
			}	
		}
	}
	public int Calculate(int m){
		//System.out.print(mArray.get(mArray.size()-1));
		index=mArray.get(mArray.size()-1);
		for (int i=0; i<index; i++) {
			nArray.add(0);
		}

		for (int i=0;i<mArray.size();i++ ) {
			nArray.set(mArray.get(i)-1,nArray.get(mArray.get(i)-1)+1);
		}
		for (int i=0;i<index;i++ ) {
			if (nArray.get(i)%2!=0) {
				result*=(i+1);
			}
		}
		return result;
	}
	//¼ìÑé²¿·Ö
	public void PrintArray() {
		for(int i=0;i<mArray.size();i++) {
			System.out.print(mArray.get(i)+" ");
		}
	}

}
