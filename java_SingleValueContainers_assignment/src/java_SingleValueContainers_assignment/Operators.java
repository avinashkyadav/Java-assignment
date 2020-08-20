package java_SingleValueContainers_assignment;

public class Operators {

	public static void main(String[] args) {

		// Assignment: Explore shift operators on negative numbers
		// >>> works for positive numbers :)
		
		// Misc Operators : as in when we advance

		
		int a = 60;          int b = -60;        int c = 0;
	      System.out.println("60  = " + Integer.toBinaryString(a));
	      System.out.println("-60 = " + Integer.toBinaryString(b));

	      //signed shift
	      c = a >> 1;              
	      System.out.println("60 >> 1  = " + Integer.toBinaryString(c));

	      //unsigned shift
	      c = a >>> 1;            
	      System.out.println("60 >>> 1 = " + Integer.toBinaryString(c) );

	      c = b >> 1;              
	      System.out.println("-60 >> 1  = " + Integer.toBinaryString(c) );

	      c = b >>> 1;            
	      System.out.println("-60 >>> 1 = " + Integer.toBinaryString(c));
	   
	}

}

		
		
		
		
		
		
		
		
		
		
		
		
