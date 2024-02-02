package Lab1;
//handling the error in the priorities
class Threadpriority extends Thread{
	public void run() {
		System.out.println("currently executing run methodd.."+Thread.currentThread());
	}
}

public class Errorpriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadpriority a=new Threadpriority();
		Threadpriority b=new Threadpriority();
		Threadpriority c=new Threadpriority();
		System.out.println("the priority of thread 1 is:"+a.getPriority());
		System.out.println("the priority of thread 2 is:"+b.getPriority());
		System.out.println("the priority of thread 3 is:"+c.getPriority());
		a.setPriority(1);
		b.setPriority(2);
		c.setPriority(3);
		/*a.setName("clavin");
		b.setName("jockey");
		c.setName("gucci");*/
		System.out.println("the priority of thread 1 after setting is:"+a.getPriority());
		System.out.println("the priority of thread 2 after setting is:"+b.getPriority());
		System.out.println("the priority of thread 3 after setting is:"+c.getPriority());
		System.out.println("currently executing Thread name.."+Thread.currentThread().getName());
		System.out.println("currently executing Thread priority.."+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(9);
		System.out.println("currently executing Thread priority after setting.."+Thread.currentThread().getPriority());
		try {
			c.setPriority(22);
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println("there is an error");
		}
	

	}

}
