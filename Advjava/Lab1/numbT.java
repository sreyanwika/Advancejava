package Lab1;
class numfor implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
	}
}


public class numbT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 numfor a=new numfor();
		 Thread a1=new Thread(a);
		 a1.start();
		    
	}

}
