package Lab1;
class threadpriorityy extends Thread{
	public void run() {
		System.out.println("currently executing run methodd.."+Thread.currentThread());
	}
}
public class priorityy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadpriorityy a=new threadpriorityy();
		threadpriorityy b=new threadpriorityy();
		threadpriorityy c=new threadpriorityy();
		System.out.println("the priority of thread 1 is:"+a.getPriority());
		System.out.println("the priority of thread 2 is:"+b.getPriority());
		System.out.println("the priority of thread 3 is:"+c.getPriority());
		a.setPriority(1);
		b.setPriority(2);
		c.setPriority(3);
		//c.setPriority(22);//error
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
		/*a.start();
		b.start();
		c.start();*/

	}

}


