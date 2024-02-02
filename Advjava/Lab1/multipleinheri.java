package Lab1;//labsheet no 1
interface msg{
	void display();
}
class morning implements msg{
   public void display() {
	   System.out.println("good morning to all");
   }
}
class evening implements msg{
	   public void display() {
		   System.out.println("good evening to all");
	   }
	}
class night implements msg{
	   public void display() {
		   System.out.println("good night to all");
	   }
	}
public class multipleinheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		msg a=new morning();
		a.display();

	}

}
