package Package2;

public class Forstatic {
	public static void staticExample() {
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
public static void main(String[] args) {
	 Forstatic.staticExample();
}
}
