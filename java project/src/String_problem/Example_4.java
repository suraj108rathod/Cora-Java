package String_problem;

public class Example_4 {
	 public static void main(String[] args) {
		String a = "Hello";
		int len = a.length();
		for(int i= len-1; i>=0; i--) 
		{
			System.out.print(a.charAt(i));
		}
	}

}
