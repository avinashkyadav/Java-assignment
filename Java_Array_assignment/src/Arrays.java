
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int[] pixel1 = {255, 0, 0}; // Red
		int[] pixel2 = {0, 255, 0}; // Green
		int[] pixel3 = {0, 0, 255}; // Blue
		
		int[] pixel4 = {125, 111, 255};
		int[] pixel5 = {225, 211, 155};
		int[] pixel6 = {135, 101, 25};
		
		int[] pixel7 = {15, 11, 125};
		int[] pixel8 = {25, 11, 205};
		int[] pixel9 = {12, 11, 115};
		
		int[][][] image = {
				{pixel1, pixel2, pixel3},
				{pixel4, pixel5, pixel6},
				{pixel7, pixel8, pixel9},
		};

		
		
		
		
		for(int i=0; i<image.length;  i++)
		{
		
			for(int ii=0; ii<image.length;  ii++)
			{
				
				for(int iii=0; iii<image.length;  iii++)
				{
				
					System.out.print(" "+image[i][ii][iii]+" ");
				}
				System.out.println("");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		// Assignment:
		// 1. Print the Image using enhanced for loop i.e.
		//just display pixel data with enhanced for loop
		
		// 2. Rotate the Image 90 degrees to clockwise
		/*
		 	pixel1, pixel2, pixel3
			pixel4, pixel5, pixel6
			pixel7, pixel8, pixel9
			
			
			pixel7, pixel4, pixel1
			pixel8, pixel5, pixel2
			pixel9, pixel6, pixel3
		 */
		
		// 3. GrayScale the image
		//  for every pixel, add up RGB values and divide by 3 i.e. 
		//take average and update the pizel values 
		//with the vaerage one
		//    255, 0, 0 -> 255 + 0 + 0 / 3 -> 85 			-> New Pixel becomes -> 85, 85, 85
		//    125, 111, 255 -> 125 + 111 + 255 /3 -> 163    -> New Pixel becomes -> 163, 163, 163
		

		//Assignmemt1  solution:
		
		System.out.println();
		
		for(int[][] i:image) {
			
		//	System.out.println("i = "+i);
			for(int[] j:i) {
				
			//	System.out.println("j = "+j);
	
				for( int u:j) {
	
					System.out.print("u = "+u);
					
				}
				System.out.println();
				
			}
			
			System.out.println();
			
		}
	
		//Assignment 2
		
		
		//Assignment 3

		System.out.println();
		
		
		int sum=0;
		
		
		for(int i=0; i<image.length;  i++)
		{
		
			for(int ii=0; ii<image.length;  ii++)
			{
				
				for(int iii=0; iii<image.length;  iii++)
				{
				
					
					sum+=image[i][ii][iii];
	//				System.out.println("image values    "+image[i][ii][iii]+"    "+sum);
							
				}
		//	System.out.println("sum "+(sum/(image.length)));
				for(int op=0; op<image.length; op++)
				{
				image[i][ii][op]=(sum/(image.length));
					
				}
				sum=0;
			}
			
		}
		

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		

		for(int i=0; i<image.length;  i++)
		{
		
			for(int ii=0; ii<image.length;  ii++)
			{
				
				for(int iii=0; iii<image.length;  iii++)
				{
				
					System.out.print(" "+image[i][ii][iii]+" ");
				}
				System.out.println();
			}
			
		}
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
