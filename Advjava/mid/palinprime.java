package mid;
//2nd quee
class prime extends Thread{
	public void run() {
		for(int i=2;i<=100;i++) {
			int flag=1;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				try {
				System.out.println("the numb is prime:"+i);
				Thread.sleep(500);
				}catch(InterruptedException e) {
					System.out.println("InterruptedException occurred");
				}
			}
		}
	}
}
class palin implements Runnable{
	public void run() {
		for(int i=100;i<=999;i++) {
			if(ispalin(i)) {
				System.out.println(i);
			}
		}
	}
	public static Boolean ispalin(int num) {
		int revnum=0;
		int orgnum=num;
		while(num>0) {
			int rem=num%10;
			revnum=revnum*10+rem;
			num/=10;
		}
		return orgnum==revnum;
	}
}
public class palinprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mt=Thread.currentThread();
		System.out.println("the mainthread id is:"+mt.getId());
		System.out.println("the mainthread current name is:"+mt.getName());
		System.out.println("the mainthread current priority is:"+mt.getPriority());
		mt.setName("cmain");
		mt.setPriority(6);
		System.out.println("the mainthread current name is:"+mt.getName());
		System.out.println("the mainthread current priority is:"+mt.getPriority());
		palin pt=new palin();
		Thread p=new Thread(pt);
		p.start();
		prime pm=new prime();
		pm.start();
		System.out.println("is p alive:"+p.isAlive());
		System.out.println("is pm alive:"+pm.isAlive());
		System.out.println("child thread-1:"+p);
		System.out.println("child thread-2:"+pm);

	}

}
