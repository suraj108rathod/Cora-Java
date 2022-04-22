package Package2;

public class SubClass extends SuperClass { //non static
	public void test4()
	{
		System.out.println(" My name is Akshay");
	}
	public static void main(String[] args) {
		//SubClass obj = new SubClass();
		SubClass obj = new SubClass();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
	} 
	
	

}
