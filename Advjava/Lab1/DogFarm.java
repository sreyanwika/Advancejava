package Lab1;

import java.util.Scanner;
class DogFarm{
		String name;
		  int age;
		  void input() {
				System.out.println("Enter the dog world");
				Scanner x=new Scanner(System.in);
				System.out.println("Enter the dog name");
				name=x.next();
				System.out.println("Enter the dog age");
				age=x.nextInt();
				}
			    void display() {
					System.out.println("the dog which entered into the farm is"+name+"with the age is:"+age);
				}
				
	}


