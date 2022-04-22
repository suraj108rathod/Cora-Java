package Package2;

public class centreStarDem0 { 
	public  void Demo(int a, int b) //non static
	{
		int c = a+b;   // non static variables
		System.out.println(c);
		
	}
	  public static void main(String[] args) {  // directly call non static variables in the obj
		centreStarDem0 obj = new centreStarDem0();
		obj.Demo(10,20);
	}

}
