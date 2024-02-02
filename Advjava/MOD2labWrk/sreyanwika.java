package MOD2labWrk;
class PrimeThread extends Thread{
	PrimeThread(ThreadGroup tg){
		super();
	}
	public void run() {
		try {
		System.out.println("child thread started:"+Thread.currentThread());
		int flag;
		for(int j=1;j<=100;j++) {
			int m=j/2;
			if(j==0 || j==1) {
            	//System.out.println("the number"+j+"is not prime");
            	
            }
			else {
			 flag=1;
             for(int i=2;i<=m;i++) {
            	if(j%i==0) {
            	 flag=0;
            	 break;
            		
            	}
            	
            }
             if(flag==1) {
             	System.out.println("the number"+j+"is prime");
          		Thread.sleep(250);//250mlsc=0.25sec
              }
            
			}
			
		}
		
	}catch(InterruptedException e) {
		System.out.println("InterruptedException exception occured");
	}
		 System.out.println("child thread ended:"+Thread.currentThread());
}
}
class fiboThread implements Runnable{
	fiboThread(ThreadGroup tg){
		super();
	}
	public void run() {
		System.out.println("child thread started:"+Thread.currentThread());
		try {

		int n1=0,n2=1,n3,i,count=8;    
		 System.out.println(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<=count;i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.println(" "+n3);
		  n1=n2;    
		  n2=n3;  
		  Thread.sleep(500);//500mlsc=0.5sec
		  
	}
		}
		catch(InterruptedException e) {
			System.out.println("InterruptedException exception occured");
		}
		 System.out.println("child thread Ended:"+Thread.currentThread());
}
	
	
}
public class sreyanwika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread started:"+Thread.currentThread());
		ThreadGroup group=new ThreadGroup("parent thread of prime");
		ThreadGroup group1=new ThreadGroup("parent thread of fibo");
		fiboThread a=new fiboThread(group1);
		Thread a1=new Thread(a);
		fiboThread b=new fiboThread(group1);
		Thread a2=new Thread(b);
		PrimeThread p1=new PrimeThread(group);
		PrimeThread p2=new PrimeThread(group);
		a1.start();
		a2.start();
		p1.start();
		p2.start();
		System.out.println("is thread a1 alive:"+a1.isAlive());//dque checking status of the child threads
		System.out.println("is thread a2 alive:"+a2.isAlive());
		System.out.println("is thread p1 alive:"+p1.isAlive());
		System.out.println("is thread p2 alive:"+p2.isAlive());
		try {
			a1.join();
			a2.join();
			p1.join();
			p2.join();
			System.out.println("is thread a1 alive:"+a1.isAlive());
			System.out.println("is thread a2 alive:"+a2.isAlive());
			System.out.println("is thread p1 alive:"+p1.isAlive());
			System.out.println("is thread p2 alive:"+p2.isAlive());
			
		}catch(InterruptedException e) {
			System.out.println("InterruptedException exception occured");
		}
		//thread group info about all the child threads cque
		System.out.println("thread group info about all the child threads are:");
		group.list();
		group1.list();
		//getting id,name,priority of main thread aque
		System.out.println("main thread current name:"+Thread.currentThread().getName());
		System.out.println("main thread current id:"+Thread.currentThread().getId());
		System.out.println("main thread current priority:"+Thread.currentThread().getPriority());
		//changing name and priority of the main thread bque
		Thread.currentThread().setName("mainprog");
		Thread.currentThread().setPriority(7);
		System.out.println("main thread name after setting:"+Thread.currentThread().getName());
		System.out.println("main thread  priority after setting:"+Thread.currentThread().getPriority());
		System.out.println("main thread Ended:"+Thread.currentThread());
	}

}
