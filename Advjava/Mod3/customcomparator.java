package Mod3;
import java.util.*;
class student{
	String name;
	int age;
	float fee;
	int sem;
	int year;
	String Branch;
	int rlno;
	static String pu;
	student(String name,int age,float fee,int sem,int year,String Branch,int rlno){
		this.age=age;
		this.name=name;
		this.fee=fee;
		this.sem=sem;
		this.year=year;
		this.Branch=Branch;
		this.rlno=rlno;
		pu="presidency";
	}
   public String tostring() {
		return "name:"+name+"\nage:"+age+"\nfee:"+fee+"\nbranch:"+Branch+"\nrlno:"+rlno+"\nsem:"+sem+"\nyear:"+year+"\nuniversity:"+pu+"\n";
	}
}
class agecomparator implements Comparator{
	public int compare(Object o1,Object o2) {
		student s1=(student)o1;
		student s2=(student)o2;
		if(s1.age==s2.age) 
		return 0;
		else if(s1.age>s2.age)
		return 1;
		else
		return -1;
		
	}
	
}
class namecomparator implements Comparator{
	public int compare(Object o1,Object o2) {
		student s1=(student)o1;
		student s2=(student)o2; 
		return (s1.name).compareTo(s2.name);
		
	}
	
}
class feecomparator implements Comparator{
	public int compare(Object o1,Object o2) {
		student s1=(student)o1;
		student s2=(student)o2;
		if(s1.fee==s2.fee) 
		return 0;
		else if(s1.fee>s2.fee)
		return 1;
		else
		return -1;
		
	}
	
}
public class customcomparator {

	private static Object student;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList a=new   ArrayList();
    a.add(new student("sreya",19,1400000.00f,5,3,"BCA",44));
    a.add(new student("poorvi",19,1600000.00f,5,3,"Btech",15));
    a.add(new student("afreen",20,1900000.00f,5,3,"Btech",4));
    a.add(new student("harshini",19,2400000.00f,5,3,"AI",23));
    System.out.println("sorting by age:");
    System.out.println("__________");
    Collections.sort(a,new agecomparator());
    Iterator it=a.iterator();
    while(it.hasNext()) {
    	student s=(student)it.next();
    	System.out.println( "name:"+s.name+"\nage:"+s.age+"\nfee:"+s.fee+"\nbranch:"+s.Branch+"\nrlno:"+s.rlno+"\nsem:"+s.sem+"\nyear:"+s.year+"\nuniversity:"+s.pu+"\n");
	}
	System.out.println("sorting by name:");
    System.out.println("__________");
    Collections.sort(a,new namecomparator());
    Iterator it1=a.iterator();
    while(it1.hasNext()) {
    	student s=(student)it1.next();
    	System.out.println( "name:"+s.name+"\nage:"+s.age+"\nfee:"+s.fee+"\nbranch:"+s.Branch+"\nrlno:"+s.rlno+"\nsem:"+s.sem+"\nyear:"+s.year+"\nuniversity:"+s.pu+"\n");
	}
    System.out.println("sorting by fees:");
    System.out.println("__________");
    Collections.sort(a,new feecomparator());
    Iterator it2=a.iterator();
    while(it2.hasNext()) {
    	student s=(student)it2.next();
    	System.out.println( "name:"+s.name+"\nage:"+s.age+"\nfee:"+s.fee+"\nbranch:"+s.Branch+"\nrlno:"+s.rlno+"\nsem:"+s.sem+"\nyear:"+s.year+"\nuniversity:"+s.pu+"\n");
	}
	}
	}

	
