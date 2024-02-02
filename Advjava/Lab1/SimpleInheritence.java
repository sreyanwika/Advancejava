package Lab1;//first labsheet que
class student{
	student(String x){
		String name=x;
		System.out.println("name is:"+name);
		
	}
}
class number extends student{
	
	number(String x,int rollnm){
		super(x);
		int num=rollnm;
		System.out.println("The rollnumb  is:"+num);
		
	}
}
public class SimpleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        number a=new number("luca",211);
	}

}
