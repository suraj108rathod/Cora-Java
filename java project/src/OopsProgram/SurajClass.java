package OopsProgram;

public class SurajClass { //override method
	public void test1(int a) {
		System.out.println("He is Cricket Player");	
	}
	 public void test2(char c) {
		 System.out.println("She is football player");	
	}
          public static void main(String[] args) {
			SurajClass obj = new SurajClass();
			obj.test1(1);
			obj.test2('a');
		}
}
