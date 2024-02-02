package MOD2labWrk;
import java.io.FileWriter;
import java.io.*;
import java.util.Scanner;
public class FileCreatingmain {

	public static void main(String[] args) throws Exception {//throws Exception is root class eception which handles whole code errors
		// TODO Auto-generated method stub
        String text="multithread concept is nothing but running multiple threads at a time";
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the folder name:");
        String Fldrname=x.next();//
        System.out.println("Enter the file name:");
        String Flname=x.next();
        File fl=new File("C:\\Users\\Sys1\\eclipse-workspace\\AdvanceJava\\Mod2Jav\\"+Fldrname);//\\defines path
        if(fl.exists() && fl.isDirectory()) {
			System.out.println("folder already exists");
		}
		else if(fl.mkdir()==true) {
			System.out.println("successfully createdd");
		}
		else {
			System.out.println("not  createdd");
		}
        FileWriter op=new FileWriter("C:\\Users\\Sys1\\eclipse-workspace\\AdvanceJava\\Mod2Jav\\"+Fldrname+"\\"+Flname+".txt");
        System.out.println("file created:");
        op.write(text);
        System.out.println("file written");
        op.close();
        
	}

}
