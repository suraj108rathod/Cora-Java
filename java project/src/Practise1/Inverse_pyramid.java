package Practise1;

public class Inverse_pyramid {
	public static void main(String[] args)
	{
		// Outer loop handle the no. row
		for(int a=8; a>=1; a--)
		{
			// Inner loop print space
			for(int b=a; b<8; b++)
			{
				System.out.print(" ");
		}
			// Inner loop print star      // Run an inner loop from 1 to'a-1'
		for(int c=1; c<=(2 * a - 1); c++) // inner loop from 1 to rows*2-(a*2-1)
		{
			System.out.print("*");
		}
		// Ending line after each row
		System.out.println("");
	}

}
}