package Practise1;

public class AllZeroRightSide {

	public static void main(String[] args) {
		int[] array= {4,0,0,7,6,0,8,0,};
		int current= array.length-1;
		for(int i=array.length-1;i>=0;i--) {
			if(array[i]!=0) {
				array[current]=array[i];
				current--;
			}
		}
		while(current>=0) {
			array[current]=0;
			current--;
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+" ");
		}

	}

}
