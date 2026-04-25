package day15;

 class Test1
{
  final 	void m1()
	{
		System.out.println("this is m1 from Test1");
	}
}

class Test2 extends Test1
{
	void m2()   // incorrect we cannot override final methods
	{
		System.out.println("this is m1 from Test2");
	}
}

public class Finalkeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
