package serialization;
import java.io.*;
import java.io.Serializable;
class student implements Serializable{
	String nme,regno;
	double cgpa;
}
public class serializeed {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      student s=new student();
      s.nme="sreya";
      s.regno="20211BCA0044";
      s.cgpa=9.7;
      FileOutputStream f=new FileOutputStream("Mod2Jav//student.ser");
      ObjectOutputStream out=new ObjectOutputStream(f);
      out.writeObject(s);
      out.close();
      f.close();
      System.out.print("serialized data is saved in mod2jav/student.ser");
	}

}
