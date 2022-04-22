package AbstractClass;

public class Demo extends Concrete {// Demo class to Concrete class
	public void thursday() {
		
		System.out.println("Thursday");
	}
public static void main(String[] args) {
	 Demo obj = new Demo();
	 obj.monday();
	 obj.tuesday();
	 obj.thursday();
	 
}
}
