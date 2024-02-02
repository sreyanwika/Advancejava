package mid;
import java.util.Scanner;
//1st queee...
class rvnum extends Thread{
	public void run() {
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
public class revnum{
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      rvnum a=new rvnum();
      a.start();
	}

}
