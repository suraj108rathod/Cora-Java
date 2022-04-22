package AbstractClass;

public  class Implementation implements Demo1 {
	public void test() {
		System.out.println(Demo1.a);
		System.out.println("Hello");	
	}
	    public void test2() {
	    	System.out.println("Suraj");
	    }
	    public void test3() {
	    	System.out.println("Hello suraj Goodmorning");
	    }
	       public static void main(String[] args) {
			Implementation obj = new Implementation();
			obj.test();
			obj.test2();
			obj.test3();
		
		}

}
