package MOD2labWrk;
import java.io.*;
import java.util.*;
public class reader {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
     File source=new File("javv\\multithread.txt");
     System.out.println("Enter the file name:");
     Scanner x=new Scanner(System.in);
     String Flname=x.next();
     File target=new File("C:\\Users\\Sys1\\eclipse-workspace\\AdvanceJava\\javv\\"+Flname+".txt");//creating file
     FileReader fr=new FileReader(source);//to read the text of multithread file
     FileWriter fw=new FileWriter(target);//to perform writining func creating instance of filewriter
     BufferedReader rd=new  BufferedReader(fr);//instance of bufferreader to perform func on file source
     PrintWriter pt=new PrintWriter(fw,false);//creating instance to write the copy text
     String printt;
     while((printt=rd.readLine())!=null) {
    	  pt.write(printt); //to write the copy text
    	  pt.println();
     }
     System.out.println("file copied");
     rd.close();
     pt.close();
     FileReader frr=new FileReader(target);
	 BufferedReader b=new BufferedReader(frr);
	 String op;
	 while((op=b.readLine())!=null) {
			System.out.println(op);
		}
	 b.close();

	}

}
