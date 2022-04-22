package String_problem;

public class StringDemo {  //non static
       void Demo(int a, int b) 
       {
    	   int c=a+b;
    	   System.out.println(c);
       }
    	   static void Demo() // static method
    	   {
    		   String Demo = "Suraj";  //non static 
    		   String Demo1 = " Suraj1"; //non static // size 0,1,2,3,4,5
    		   System.out.println(Demo.equals(Demo1));
    		   System.out.println(Demo.length());
    		   System.out.println(Demo.concat(Demo1));
       }
    	   public static void main(String[] args) {
			StringDemo obj = new StringDemo(); // calling non static
			obj.Demo(10,20);
		
           StringDemo.Demo(); //calling static method
}
}