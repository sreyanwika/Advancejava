package Lab1;//lab5
class fac extends Thread{
	int fact=1;
	int i=1;
	public void run() {
	while(i<5) {
		fact=fact*i;
		i++;
	}
	
	System.out.println("the factorial of num is:"+fact);
	}
}
public class facThread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fac a=new fac();
		a.start();
		

	}

}
