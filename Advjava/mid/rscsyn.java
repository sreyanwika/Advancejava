package mid;
class resource{
	public void use(String name) {
		System.out.print("[");
		try {
			System.out.print(name);
			Thread.sleep(100);
		}catch(InterruptedException e) {
			System.out.print("interruptedexception occurred");
		}
		System.out.println("]");
	}
}
class tt extends Thread{
	String name;
	resource r;
 tt(String name,resource r){
		super(name);
		this.name=name;
		this.r=r;
		
	}
 public void run() {
	 synchronized(r) {
		 r.use(name);
	 }
 }
}
public class rscsyn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		resource rr=new resource();
		tt a=new tt("Hello",rr);
		tt b=new tt("Synchronized",rr);
		tt c=new tt("Block",rr);
		a.start();
		b.start();
		c.start();
		try {
			a.join();
			b.join();
			c.join();
		}catch(InterruptedException e) {
			System.out.print("interruptedexception occurred");
		}

	}

}
