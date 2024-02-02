package Lab1;
class loopnum1 extends Thread{
	private String name;
	private int num;
	loopnum1(int num,String name){
		super(name);
		this.name=name;
		this.num=num;
		System.out.println("new thread name is:"+name+"created");
		
	}
	 public void run() {
		 int fact=1;
		 for(int i=1;i<=num;i++) {
			 try {
				 fact=fact*i;
				 System.out.println(Thread.currentThread()+":"+fact);
				 Thread.sleep(1000);
				}
				catch(InterruptedException e){
				   System.out.println("main thread interrupted");
				   
			   }
		 }
	 }
}
public class threadjoin{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		loopnum1 a=new loopnum1(4,"oreo");
		loopnum1 b=new loopnum1(5,"kikyy");
		loopnum1 c=new loopnum1(6,"brwny");
		a.start();
		b.start();
		c.start();
		System.out.println("is thread a alive"+a.isAlive());
		System.out.println("is thread b alive"+b.isAlive());
		System.out.println("is thread c alive"+c.isAlive());
		try {
			a.join();
			b.join();
			c.join();
			System.out.println("is thread a alive"+a.isAlive());
			System.out.println("is thread b alive"+b.isAlive());
			System.out.println("is thread c alive"+c.isAlive());
		}
		catch(InterruptedException e){
		   System.out.println("main thread interrupted");
		   
	   }
		System.out.println("hyyy chocolates");
	}

}

