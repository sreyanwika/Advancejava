package Mod3;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ob=new ArrayList<String>();
		//inserting  students into the list
		ob.add("sreya");
		ob.add("adita");
		ob.add("jyo");
		ob.add("kavya");
		ob.add("ayana");
		System.out.println("the original arraylist:");
		for(String st:ob)
			System.out.println(st);
		//after adding students at 0 and 1 positions
		ob.add(0,"rahul");
		ob.add(1,"rohit");
		System.out.println("the  arraylist after adding:");
		for(String st:ob)
			System.out.println(st);
        //removing 2 students
		ob.remove("ayana");
		ob.remove("rohit");
		//removing by index
		ob.remove(3);
		System.out.println("the  arraylist after removing :");
		for(String st:ob)
			System.out.println(st);
		System.out.println("the  final arraylist :");
		for(String st:ob)
			System.out.println(st);
	    //sort
		Collections.sort(ob);
		System.out.println("the  final arraylist after sorting :");
		for(String st:ob)
			System.out.println(st);
 	}

}
