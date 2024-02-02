package Lab1;
class facl extends Thread{//labsheet no5
	int fact=1;
	int i=1;
	public void run() {
	while(i<5) {
		fact=fact*i;
		i++;
	}
	
	System.out.println("the factorial of num is:"+fact);
	System.out.println("the currrent thread is:"+Thread.currentThread());
	}
}
public class MulThreadfac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       facl a=new facl();
       facl b=new facl();
       facl c=new facl();
       a.setName("luca");
       b.setName("maya");
       c.setName("navi");
       a.start();
       b.start();
       c.start();
       System.out.println("the currrent main thread is:"+Thread.currentThread());
       
	}

}
