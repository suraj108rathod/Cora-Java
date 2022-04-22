package String_problem;

public class Example_3 {
	static void reverseString(String a) {
		int len = a.length();
		for(int i  = len-1; i>=0; i--) {
			System.out.println(a.charAt(i));
		}
	}
	    public static void main(String[] args) {
			Example_3.reverseString("Suraj Vasudeo Rathod");

			
		}

}
