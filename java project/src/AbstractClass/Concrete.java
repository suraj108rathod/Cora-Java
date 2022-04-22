package AbstractClass;

public class Concrete extends AbstractClass{ // Concrete class to Abstract
	public  void tuesday() {
		System.out.println("Tuesday");	
	}
	    public void thursday() {
	    	System.out.println("Thursday");	
		}
	    public static void main(String[] args) {
			Concrete obj = new Concrete();
			obj.monday();
			obj.tuesday();
			obj.thursday();
		}

}
