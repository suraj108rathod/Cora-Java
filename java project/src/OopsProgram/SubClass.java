package OopsProgram;

public class SubClass extends SuperClass {//Polymorphism method (// imports oops Program)
 public static void test4() 
 {
	 System.out.println("Hi");	
  }
 public static void main(String[] args) {
	 SubClass obj = new SubClass();
	 SubClass.test4();
      SuperClass.test1();
	 SuperClass.test2();
	 SuperClass.test3();
}
}