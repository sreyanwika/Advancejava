package Lab1;//lab4
class Sname extends Thread{
	String name;
	  Sname(String name){
		  setName("sreya");// or super(name); setname will set the name which is provided in the constructor
		  this.name=name;
		  System.out.println("new thread created and the name is:"+name);
	  }
	  public void run() {
	   for(int i=5;i>0;i--) {
		   try {
		  System.out.println(name+":"+i);
		  
				 Thread.sleep(1000); 
			  }
		   catch(InterruptedException e){
			   System.out.println(name+"thread interrupted");
			   
		   }
	  }
}
}
public class excepThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sname t1=new Sname("sreya");
		Sname t2=new Sname("poorvi");
		Sname t3=new Sname("haraffu");
		t1.start();
		t2.start();
		t3.start();
		try{
			 Thread.sleep(8000); //8000 in ms
		  }
	   catch(InterruptedException e){
		   System.out.println("main thread interrupted");
		   
	   }
		System.out.println("exiting from the main Thread");

	}

}
