package mid;
import java.util.Scanner;
class presidency{
	public static void display(int rlnum,String name) {
		String msg[]= {"hi",name,"id"+rlnum,"welcome to presidency"};
		for(int i=0;i<msg.length;i++) {
			System.out.println(msg[i]);
		}
	}
}
class participant extends Thread{static
	int temp=100;
	int participantid;
	String participantname;
	public void setdetails() {
		Scanner x=new Scanner(System.in);
		System.out.println("enter the name:");
		participantname=x.next();
		participantid=++temp;
		
	}
	public void run() {
		presidency.display(participantid, participantname);
	}
}
public class presipart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		participant a=new participant();
		a.setdetails();
		a.start();
		participant b=new participant();
		b.setdetails();
		b.start();


	}

}
