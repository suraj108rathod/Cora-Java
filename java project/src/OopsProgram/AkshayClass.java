package OopsProgram;

public class AkshayClass extends SurajClass { //override method
	  public void test3() {
	  System.out.println("He is allrounder player");
}   
	  public void call() {
		  this.test1(1);
		  super.test2('b');
	  }  
	  public static void main(String[] args) {
		AkshayClass obj = new AkshayClass();
		    obj.test3();
		   // obj.test1(1);
		   // obj.test2('b');
		    obj.call();
	}
		
	}
