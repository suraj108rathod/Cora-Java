package Program1;

   public class Overloading {
	
	  public static void add() {
		  int a=2,b=3;
		  int c=a+b;
		  System.out.println("Addition of a & b is= "+c);
	  }
	     
	     public static void add(int a,int b) { //Same Method but diff.Arguments
	    	 int c=a+b;
	    	 System.out.println("Addition of a & b is= "+c);
	     }
	       public static void main(String[] args) {
			Overloading.add();
			Overloading.add(15,26);
		}

}
