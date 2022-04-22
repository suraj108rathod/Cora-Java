package Practise1;

public class Armstrong {

	public static void main(String[] args) {
		int num=153;
		int num1=0;
			
		for(int i=num;i>0;i=i/10)// 153 15 1
		{
			System.out.println(i);
			//System.out.println(i%10);//3, 5, 1
			int rem=i%10;
			num1=num1+(rem*rem*rem);
			
		}

		if(num1==num)
		{
			System.out.println("Given number " +num+" is ArmStrong Number");
		}
		else {
			System.out.println("Given number " +num+" is not ArmStrong Number");
		}
	}


}