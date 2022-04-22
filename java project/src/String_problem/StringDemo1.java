package String_problem;

public class StringDemo1 {
	
	void stringDemo() {
		
		String compare  = "Just for comparison";
		String practice = "Lets do some practice";
		String practice1 = "Lets do some pracice";
		
		System.out.println(practice);
		System.out.println(practice.charAt(2));//returns which char is at no 2. starts from 0.
		System.out.println(practice.codePointAt(4)); // returns unicode.
		System.out.println(practice.compareTo(practice)); // returns 0 as its comparing with same varisble.
		System.out.println(practice.compareTo(compare)); // comparing 2 differnt string variables.
		System.out.println(practice.concat(compare)); //concating two strings.
		System.out.println(practice.contains(practice1));// checks if strings has same character sequence.
		System.err.println(practice.isEmpty());// checks if string is emty or not.
		System.out.println(practice.replace("t", "s"));// replaces old character with new defined character.
		System.out.println(practice.toLowerCase());//gives output in lowercase.
		System.out.println(practice.matches(practice1));
		}
	 
	public static void main(String[] args) {
		StringDemo1 obj1 = new StringDemo1();
		obj1.stringDemo();
		
	
	}
}
