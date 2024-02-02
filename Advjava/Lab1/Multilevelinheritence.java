package Lab1;
//multilevel inheritence labsheet1
import java.util.Scanner;
class catFarm{
	  String name;
	  int age;
	  void input() {
			System.out.println("Enter teh cat world");
			Scanner x=new Scanner(System.in);
			System.out.println("Enter the cat name");
			name=x.next();
			System.out.println("Enter the cat age");
			age=x.nextInt();
			}
		    void display() {
				System.out.println("the cat whic entered into the farm is"+name+"with thea ge is:"+age);
			}
			
}

class catMed extends catFarm{
	boolean query;
	  void input() {
		    super.input();
			Scanner x=new Scanner(System.in);
			System.out.println("is cat suffering from any disease:(enter true or no)");
			query=x.nextBoolean();
			
}
}
class sol extends catMed{
	void display() {
		super.display();
		if(query==true) {
			System.out.println("please leave cat in catMed we will take care and inform u later");
		}
		else {
			System.out.println("Grand welcome to Catfarm");
		}
		
	}
}
public class Multilevelinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      sol a1=new sol();
      a1.input();
      a1.display();
	}

}
