package Practise1;

public class RemoveAllSpaces {
	 public static void main(String[] args) { 
		 
	        String str = "India     Is My    Country";  
	        //1st way  
	        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method  
	        System.out.println(noSpaceStr);  

      }
}