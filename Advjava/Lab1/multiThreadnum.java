package Lab1;//labsht 5
 class loopnum extends Thread{
	 public void run() {
		 int i=1;
		 while(i<5) {
			 try {
				 System.out.println(Thread.currentThread()+":"+i);
				 i++;
				 Thread.sleep(1000);
				}
				catch(InterruptedException e){
				   System.out.println("main thread interrupted");
				   
			   }
		 }
	 }
 }
public class multiThreadnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		loopnum a=new loopnum();
		loopnum b=new loopnum();
		loopnum c=new loopnum();
		a.setName("oreo");
		b.setName("kitkat");
		c.setName("choci");
		a.start();
		b.start();
		c.start();
		try {
			Thread.sleep(8000);
		}
		catch(InterruptedException e){
		   System.out.println("main thread interrupted");
		   
	   }
		System.out.println("hyyy chocolates");
	}

}
