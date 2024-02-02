package Lab1;//labsheet no2
class name{

    protected String color="white";
 
	name(String x,String gen){
		String naam=x;
		gen=gen;
		System.out.println("the name of the student is:"+naam);
		System.out.println("the gender of the student is:"+gen);
	}
}
class age extends name{
	public String color="black";
	age(String x, String gen, int y) {
		super(x, gen);
		// TODO Auto-generated constructor stub
		int saal=y;
		System.out.println("the age      of the student is:"+saal);
		System.out.println("the  student color  is:"+super.color);//
		System.out.println("the  student bag color  is:"+color);
	}

	/*void age(int y,String gen){
		int saal=y;
		g=super.gen;
		System.out.println("the name of the student is:"+saal);
		System.out.println("the gender of the student is:"+super.gen);
		System.out.println("the gender of the student is:"+gen);
	}*/
}
public class Constructor {
  public static void main(String[] args) {
	  age a=new age("mimi","gal",18);
	  
  }
}
