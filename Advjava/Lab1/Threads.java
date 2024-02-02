package Lab1;
class  play implements Runnable{
	public void run() {//run is a predefined class used in threads to write the program
		System.out.println("the current printing thread is:"+Thread.currentThread());//Thread.currentThread() it is used to display the current running thread
		System.out.println("this is thread exe");
	}
}
public class Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       play ob1=new play();
       Thread t1=new Thread(ob1);//Thread is predefined 
       t1.setName("sreya");//setNmae is used to set the name only child name cna be changed not main thread name
       t1.start();//start method is used to run the run method it is predefined
       System.out.println("the current printing thread is:"+Thread.currentThread());
       System.out.println("this is main program execution");
		
	}

}
