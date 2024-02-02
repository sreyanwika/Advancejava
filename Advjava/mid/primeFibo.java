package mid;
class primethread extends Thread{
	public void run() {
	for(int i=2;i<=100;i++)
	{
		int flag=1;
		/*int m=i/2;
        for(int i1=2;i1<=m;i1++) {
       	 if(i%i1==0) {
       	   flag=0;
       	   break;
       		
       	}
       	
       }
        if(flag==1) {
        	try {
        	System.out.println("the number"+i+"is prime");
     		Thread.sleep(250);//250mlsc=0.25sec
        	}
         catch(InterruptedException e) {
 			System.out.println("InterruptedException occured");
 		}
        }*/
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				flag=0;
				break;
			}
		}
			
	    if(flag==1) {
		 try {
			System.out.println("the number"+i+"prime");
			Thread.sleep(250);
		}catch(InterruptedException e) {
			System.out.println("InterruptedException occured");
		}
	}
		
	}
}
}
class fibothread implements Runnable{
	public void run() {
		 int n3,n1=0,n2=1;
		 int max=20;
		 System.out.println("fib:"+n1);
		 System.out.println("fib:"+n2);
		 for(int i=2;i<=max;i++) {
			 n3=n1+n2;
			 try {
				 System.out.println("fib:"+n3);
				 Thread.sleep(250);
				}catch(InterruptedException e) {
					System.out.println("InterruptedException occured");
				}
			 n1=n2;
			 n2=n3;
			 
		 }
	}
}
public class primeFibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainthread=Thread.currentThread();
		System.out.println("mainthread id is:"+mainthread.getId());
		System.out.println("mainthread current name  is:"+mainthread.getName());
		System.out.println("mainthread current priority is:"+mainthread.getPriority());
		mainthread.setName("cmain");
		mainthread.setPriority(9);
		System.out.println("mainthread name after setting  is:"+mainthread.getName());
		System.out.println("mainthread  priority after setting is:"+mainthread.getPriority());
		primethread pt=new primethread();
		pt.start();
		fibothread ft=new fibothread();
		Thread tt=new Thread(ft);
		tt.start();
		System.out.println("is pt alive:"+pt.isAlive());
		System.out.println("is tt alive:"+tt.isAlive());
		System.out.println("child thread-1"+pt);
		System.out.println("child thread-2"+tt);
	}

}
