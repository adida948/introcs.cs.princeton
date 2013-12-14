package myProject;

public class TenHelloWorlds {

	// exercise 2.a Main method not public.
	
	// exercise 2.b 
	// Exception in thread "main" java.lang.NoSuchMethodError: main
	// Static: You don't have to create an object to its members(method or variable)
	
	// Exercise 2.c If void is missing, there is a compile Error "Return type for the method is missing"
	
	// Exercise 2.d If args are deleted, it will give syntax errors.
	
	// If main takes no variables the complier won't find the methods
	public static  void  main(String[] args) {
		// TODO Auto-generated method stub
		for( int i= 0; i < 10; i++)
		{
			System.out.println("Hello World");
		}

	}

}
