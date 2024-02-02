package Lab1;
import java.util.Scanner;
class prg extends Thread{
	Scanner x=new Scanner(System.in);
	public void run() {
		System.out.println("the current running thread is:"+Thread.currentThread());
		System.out.println("the value of a is:");
		int a=x.nextInt();
		System.out.println("the value of b is:");
		int b=x.nextInt();
		int sum=a+b;
		System.out.println("the value of sum is:"+sum);
	}
}
public class thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prg a=new prg();
		//Thread a1=new Thread(a); since class is extending the thread.... 
		a.setName("siya");
		//a1.start();
		a.start();
		System.out.println("the current running thread is:"+Thread.currentThread());

	}

}
