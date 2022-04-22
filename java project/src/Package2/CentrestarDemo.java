package Package2;

public class CentrestarDemo { // non static variable
	public static void Demo() // static variable
	{
		int a = 5;   // non static variables
		int b = 10; // non static variables
		int c = a+b; // non static variables
		System.out.println(c);
	}
      public static void main(String[] args) { // directly call static variables in the class.
	   CentrestarDemo.Demo();                  // non static is does not create the object.
}
     
}
