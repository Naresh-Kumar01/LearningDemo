package day16;

interface Shape
{
	int length=10;  // final and static 
	
	int width=20;   // final and static
	
	void circle();   // abstract method
	
	
	default void square()
	{
		
	}
	
}

public class InterfaceDemo {
	public static void main(String[] args) {
		
	}

}
