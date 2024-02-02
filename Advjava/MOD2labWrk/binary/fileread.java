package MOD2labWrk.binary;
import java.io.*;

public class fileread {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\Sys1\\eclipse-workspace\\AdvanceJava\\Mod2Jav\\bb.dat");
		FileInputStream fis=new FileInputStream(f);
		BufferedReader br=new BufferedReader(new InputStreamReader(fis));
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		

	}

}
