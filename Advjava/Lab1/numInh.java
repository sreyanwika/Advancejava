package Lab1;
class nu extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		  }
	}
}
public class numInh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     nu a=new nu();
     a.start();//it works because inheritence class is fully implemented class but where as runnable is an interface which only contains abstract methods
     Thread a1=new Thread(a);
     a1.start();
	}

}
