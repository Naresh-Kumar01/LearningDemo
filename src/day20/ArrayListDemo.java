package day20;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
		
		//Declaration
		ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList();
		//ArrayList <String>mylist=new ArrayList<String>();
		
		//Adding data into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//Size of arraylist
		System.out.println("Size of an arraylist:"+mylist.size()); //8
		
		//Printing arraylist
		System.out.println("Printing data from arraylist:"+mylist); //[100, 10.5, welcome, A, true, 100, null, null]
		
		//Remove element from arraylist
		mylist.remove(5);  // here 5 is index of element
		System.out.println("After removing:"+mylist); //[100, 10.5, welcome, A, true, null, null]
		
		//Insert element in the arraylist
		mylist.add(2,"java");
		System.out.println("After insertion:"+ mylist); //[100, 10.5, java, welcome, A, true, null, null]
	
		//Modify element in the arraylist (modify/replace/change)
		mylist.set(2,"python");
		System.out.println("After replacing:"+ mylist); //[100, 10.5, python, welcome, A, true, null, null]
		
		//Access specific element from arraylist
		System.out.println(mylist.get(3));  // here 3 is index   //welcome
		
		//Reading all the elements from arraylist
		
		//using normal for loop
		/*for(int i=0;i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
			
		}
		*/
		
		//using for..each loop
		
		/*for(Object x:mylist)
		{
			System.out.println(x);
		}
		*/
		
		//using iterator
		/*Iterator <Object> it=mylist.iterator();
				
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		//Cheking arraylist is empty or not
		System.out.println("Is arraylist empty?"+ mylist.isEmpty());
		
		//remove all the elements from array list
		ArrayList mylist2=new ArrayList();
		mylist2.add(100);
		mylist2.add("welcome");
				
		mylist.removeAll(mylist2);
		System.out.println("After removing multiple elements:"+mylist);  //[10.5, python, A, true, null, null]
		
		//remove all the elemnts/clear
		mylist.clear();
		System.out.println("Is arraylist empty?"+ mylist.isEmpty());  //true
		
	
	}


}
