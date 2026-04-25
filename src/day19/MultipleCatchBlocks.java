package day19;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("program is started.........");
		String s=null;
		try
		{
		System.out.println(s.length()); 
		}
		catch(Exception e)
		{
			System.out.println("Exception handled....");
		}
		
		/*catch(ArithmeticException e)
		{
			System.out.println("handled Arithmetic Exception....");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception handled...");
		}
		catch(NumberFormatException e)
		{
			System.out.println("number format exception handled...");
		}
		*/
		
		
		System.out.println("program is completed.........");


	}

}
