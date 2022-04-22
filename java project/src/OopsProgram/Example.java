package OopsProgram;

public class Example { //overloading method ex.
	public static void main(String[] args) {
		System.out.println("I am Suraj");
		Example.main(1);    //first directly call in the class(Example). then execute the method
		Example.main('a');
	}
	  public static void main(int a) {
		System.out.println("Int SURAJ");
	}
	  public static void main(char b) {
		System.out.println("char Suraj");
	}

}
