package mid;
import java.util.Scanner;
class rvnum1{
	synchronized static void dis() {
		Scanner x=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=x.nextInt();
		for(int i=num;i>0;i--) {
			try {
			System.out.println("the value:"+i);
			Thread.sleep(500);
		}catch(InterruptedException e) {
			System.out.println("InterruptedException occurred");
		}
	}
}
	}
class th extends Thread{
	public void run() {
		rvnum1.dis();
	}
}
public class synrevnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		th a=new th();
		a.start();

	}

}
