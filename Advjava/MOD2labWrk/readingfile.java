package MOD2labWrk;
import java.io.*;
public class readingfile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f1=new File("javv\\multithread.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader b=new BufferedReader(fr);
		String op;
		while((op=b.readLine())!=null) {
			System.out.println(op);
		}
		b.close();

	}

}
