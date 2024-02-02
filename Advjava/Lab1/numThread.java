package Lab1;//labsheet2 using interface runnable
class numfo implements Runnable{
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		  }
		
	}
}
public class numThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    numfo a=new numfo();
    Thread a1=new Thread(a);
    a1.start();
    
	}

}
