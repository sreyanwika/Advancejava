package serialization;
import java.io.*;

public class deserialization {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		student s=null;
		FileInputStream fi=new FileInputStream("Mod2Jav//student.ser");
		ObjectInputStream oi=new ObjectInputStream(fi);
		s=(student) oi.readObject();
		oi.close();
		fi.close();
		System.out.println("deserialized data...");
		System.out.println("the name is:"+s.nme);
		System.out.println("the regno is:"+s.regno);
		System.out.println("the cgpa is:"+s.cgpa);

	}

}
