package Package2;

public class constructor {
	 constructor(int a, int b){
		 System.out.println(a+b);
	}
      public void test() {
		
    	  System.out.println("This is a method");
	}
      public static void main(String[] args) {
		
    	  constructor obj = new constructor(10,20);
    	  obj.test();
	}
}
