package MOD2labWrk;
import java.io.*;
public class counting {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
      File f=new File("javv\\multithread.txt");
      FileReader fr=new FileReader(f);
      BufferedReader br=new BufferedReader(fr);
      String line;
      int wc=0;
      int cc=0;
      int sc=0;
      int lc=0;
      while((line=br.readLine())!=null){
    	  cc+=line.length();
    	  String wrds[]=line.split("\\s+");
    	  wc+=wrds.length;
    	  String sen[]=line.split("[!?.:]+");
    	  sc+=sen.length;
    	  System.out.println(++lc +" "+line);// this is for printing line and lc is for printing no of line counts
      }
      System.out.println("word count:"+wc);
      System.out.println("ttl no.of sentences:"+sc);
      System.out.println("ttl no.of caharc:"+cc);
	}

}
