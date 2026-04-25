package day19;

public class FinallyBlock {
	
	public static void main(String[] args) {
String s="welcome";
		
		try
		{
		System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception handled...");
		}
		finally
		{
			System.out.println("entered into finally block......");
		}

	}

}
