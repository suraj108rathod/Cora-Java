package Program1;
import Package2.SubClass;
public class Example2 extends SubClass { //Static method imports
	public void test4()
	{
		System.out.println(" My name is Swapnil");
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


