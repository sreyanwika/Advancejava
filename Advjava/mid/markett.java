package mid;
import java.util.Scanner;
class marq{
	String fruityp;
    Boolean order=true;
	public synchronized void put(String fruityp) {
		if(order==false) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("InterruptedException occurred");
			}
		}
		this.fruityp=fruityp;
		order=false;
		System.out.println("available:"+fruityp);
		notify();
	}
	public synchronized void get() {
		if(order==true) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("InterruptedException occurred");
			}
		}
		order=true;
		System.out.println("received:"+fruityp);
		notify();
	}
}
class farmer implements Runnable{
	int numoffruits;
	private marq q;
	farmer(marq q){
		this.q=q;
		new Thread(this,"farmer").start();
			
	}
	public void run() {
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the fruit type:");
		String fruityp = x.nextLine();
		System.out.println("Enter the number of fruits:");
		numoffruits= x.nextInt();
		if(numoffruits%10==0) {
		 for(int i=1;i<=numoffruits;i=i+10) {
			q.put(fruityp+i+"to"+(i+9));
		 }
		}
		else {
			System.out.println("try again in queue");
			System.exit(0);
		}
		
		
	}
}
class consumer implements Runnable{
	marq q;
	consumer(marq q){
		this.q=q;
		new Thread(this,"farmer").start();
	}
	public void run() {
		while(true) {
		 q.get();
		}
	}
}
public class markett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marq a=new marq();
		farmer a1=new farmer(a);
		consumer a2=new consumer(a);

	}

}
