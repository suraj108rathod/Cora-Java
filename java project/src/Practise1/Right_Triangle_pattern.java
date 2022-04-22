package Practise1;

public class Right_Triangle_pattern {
	public static void main(String[] args)
	{
	
		for(int a=0; a<6; a++) // a<=6; //loop for rows
		{
			for( int b=0; b<=a; b++)   //loop for columns
			{
				System.out.print("* "); //prints star
			}
			System.out.println();  //throws the cursor in a new line after printing each line
		}
		
	}

}
