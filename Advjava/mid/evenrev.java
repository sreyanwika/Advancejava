package mid;
import java.util.Scanner;
class quiz{
	synchronized static void dis() {
		for(int i=30;i>0;i--) {
			if(i%2==0) {
				try {
					Thread.sleep(1000);
					System.out.println("the even i is:"+i);
				}catch(InterruptedException e) {
					System.out.println("exception hanadled");
				}
			}
		}
	}
}
class tt1 extends Thread{
	public void run() {
		quiz.dis();
	}
}
public class evenrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     tt1 a=new tt1();
     a.start();
	}

}
