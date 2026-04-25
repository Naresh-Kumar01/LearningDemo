package day15;

class Test
{
    final	int x=100;
	
}

public class Finalkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		//t.x=200;    not possible x is final variable
		System.out.println(t.x);

	}

}
