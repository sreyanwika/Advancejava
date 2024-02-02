package Lab1;//labsheet no 1
import java.util.Scanner;
interface  square{
	void input();
	void area();
}
class rectangle{
	Scanner x=new Scanner(System.in);
	int len,brdth,Slen;
	void Rinput() {
		System.out.println("Enter the value of length:");
		len=x.nextInt();
		System.out.println("Enter the value of breadth:");
		brdth=x.nextInt();
	}
	 void Recarea() {
		   int Rarea=len*brdth;
		   System.out.println("the area of square is:"+Rarea);
	   }
}

public class MultipleInheritence extends rectangle implements square {
	Scanner x=new Scanner(System.in);
	int Slen;
	public void input() {
		System.out.println("Enter the value of side length:");
		Slen=x.nextInt();
	}
	public void area() {
	int Area=Slen*Slen;
	   System.out.println("the area of square is:"+Area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritence sq=new MultipleInheritence();
		sq.input();
		sq.area();
		sq.Rinput();
		sq.Recarea();
     
	}

}
