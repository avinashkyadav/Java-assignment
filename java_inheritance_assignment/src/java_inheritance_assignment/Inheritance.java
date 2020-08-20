package java_inheritance_assignment;

public class Inheritance {
	
	// if method is static then class also be static 
	//static method is not polymorphic 
	// it should be over hided not override
	//static method inherited  but not override
	static class parent{
		
	public static void print(){
			
		System.out.println("this is parent method");
		
		}
	
		
	}

	static class child extends parent{
		
		public static void print(int a,int b) {
			
			System.out.println("this is child method"+ (a+b));
			
		}
		
		
	}
	
	
	
			public static void main(String[] args) {
			
				
				
				

				child.print(5,5);
				child.print();
				
				
				
		}

}
	// Assignment: Explore Overriding in case of static methods !!
