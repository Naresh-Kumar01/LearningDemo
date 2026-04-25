package day14;

class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
	
}
	class B extends A
	{
		int b;
		void show()
		{
			System.out.println(b);
		}
	}
	
	class C extends B      // multi level inheritance
	{
		int c;
		void print()
		{
			System.out.println(c);
		}
	}


public class InheritanceTypes {
	public static void main(String[] args)
	{
	
		/*
		 * B bobj=new B(); bobj.a=10; bobj.b=20; bobj.display(); bobj.show();
		 */
		
		C obj=new C();
		obj.a=100;
		obj.b=200;
		obj.c=300;
		
		obj.display();
		obj.print();
		obj.show();
		
	
		
 	}

	
	

}
