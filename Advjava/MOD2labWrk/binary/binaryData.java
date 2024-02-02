 package MOD2labWrk.binary;
//import java.io.FileOutputStream;
import java.io.*;
import java.util.Scanner;
public class binaryData {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		FileOutputStream fl=new FileOutputStream("Mod2jav\\bb.dat",true);
		String record=new String();
		String name;
		int regno;;
		char sb,ch='n';
		do {
			System.out.println("Enter the name,the regno,essay submission either yes(y) or no(n):");
			name=x.next();
			regno=x.nextInt();
			sb=x.next().charAt(0);
			String record2=record.concat("\n").concat(name).concat("\t").concat(String.valueOf(regno)).concat("\t").concat(String.valueOf(sb));
			byte[] values=record2.getBytes();
			fl.write(values);
			System.out.println("Enter n if no data neeed to be entered else y");
			ch=x.next().charAt(0);
			
			
		}while(ch!='n');
		System.out.println("file written");
		fl.close();
		

	}

}
