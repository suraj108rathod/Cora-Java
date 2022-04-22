package Program1;

import OopsProgram.SubClass;

public class Example1 extends SubClass { //Polymorphism method
	public static void test4() {
		System.out.println("Hi");
	}
	   public static void main(String[] args) {
		   Example1 obj = new Example1();
		   Example1.test4();
		   SubClass.test1();
		   SubClass.test2();
		   SubClass.test3();
        
        
		   
	}

}


