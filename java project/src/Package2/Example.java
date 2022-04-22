package Package2;

public class Example { //static method
	static int a = 10;
	static int b =20;
	
	public static void test1()
	{
		int c = a+b;
	
	}
   public static int test2() {
	   int c =a-b;
	   return c;
}
   public static void main(String[] args) {
	Example.test1();
	int d = Example.test2();
	System.out.println(d);
	
}
}
