package Program1;

  public class Overriding extends Overloading {
	   
	 public static void add() { //Overriding
		  int a=2,b=3,c=5;
		  int d=a+b+c;
		  System.out.println("Addition od given no. are = "+d);
		 
	 }  
	   public static void main(String[] args) {
		Overriding obj = new Overriding();
		Overriding.add();
		//Overloading.add();
	}

}
