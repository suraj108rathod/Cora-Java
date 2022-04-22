package Package2;

public class Subsuraj extends SuperClass { //polymorphism
          public void boy()
          {
        	  System.out.println("He is a player and He is a player as an batsman at run");
          }
          public static void girl()
          {
        	  System.out.println("She is a Prajakta");
          }
          public static void main(String[] args) {
			Subsuraj obj = new Subsuraj();
			obj.boy();
			obj.girl();
			Subsuraj.girl();
			SuperClass.test1();
			SuperClass.test2();
			SuperClass.test3();
		}
}
