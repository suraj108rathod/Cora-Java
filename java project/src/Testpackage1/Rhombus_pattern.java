package Testpackage1;

public class Rhombus_pattern 
{
	public static void main(String[] args) {
		for(int i =1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)//j=i ,use in i find the rhombus
			{
				System.out.print("  ");
			}
			   for(int j=1; j<=5; j++)
			{
				    System.out.print("* ");
			}
			           for(int j=1; j<5; j++) 
			{
				          System.out.print("* ");
			}
			System.out.println();
		}
	}

}





