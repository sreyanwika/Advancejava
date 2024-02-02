package Mod3;
import java.util.*;
import java.util.Scanner;
import java.util.ListIterator;
class quelist{
	ArrayList<String> ob=new ArrayList<String>();
	int front=0;
	public void insert(String name) {
		ob.add(name);
	}
	public String delete() {
		return ob.remove(front);
	}
	public void display() { 
		ListIterator<String> itr=ob.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quelist q=new quelist();
		int choice=0;
		do {
			Scanner x=new Scanner(System.in);
			System.out.println("Enter your choice:\n1.insert\n2.delete\n3.display\n4.exit");
			choice=x.nextInt();
			x.nextLine();
			switch(choice) {
			case 1:System.out.println("Enter the name to be inserted:");
			       String name=x.nextLine();
			       q.insert(name);
			       break;
			case 2:System.out.println("the person removed from the queue:"+q.delete());
			       break;
			case 3:System.out.println("the person in the queue:");
			       q.display();
			       break;
			case 4:
			       System.exit(0);
			}
			
		
		}while(choice<=3);
	}

}
