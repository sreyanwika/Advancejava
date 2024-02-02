//demonstrate thread synchronization for a given resource to avoid race condition..

package Lab1;
class rsrce{//creating method
	void use(String name) {
		System.out.print("["+name);
		try {
			Thread.sleep(1000);
	
		}
		catch(InterruptedException e) {
			System.out.println("there is an interrupted exception");
		}
		System.out.print("]");
	}
}
class myt extends Thread{
	String name;
	rsrce r;//r is the object of class rsrce 
	myt(String name,rsrce r){//getting the name through the thread 
		super(name);
		this.name=name;
		this.r=r;
	}
	public void run() {//assing the name to the object of r of class rsrce
		synchronized(r) {
		r.use(name);
	}
	
}
}
public class raceCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rsrce res=new rsrce();
		myt ayana=new myt("henry",res);
		myt barun=new myt("horid",res);
		myt cyati=new myt("harsh",res);
		ayana.start();
      	barun.start();
		cyati.start();
		try {
			ayana.join();
	      	barun.join();
			cyati.join();
		}
		catch(InterruptedException e) {
			System.out.println("there is an interrupted exception");
		}
	}

}
