package MOD2labWrk.binary;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class binaryFile {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String text="multithread concept is nothing but running multiple threads at a time";
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the folder name:");
        String Fldrname=x.next();//
        System.out.println("Enter the file name:");
        String Flname=x.next();
        FileOutputStream fl=new FileOutputStream(Fldrname+"\\"+Flname+".dat");//.dat is an extension of binary file
        //FileOutputStream is meant for writing streams of raw bytessuch as image data. For writing streams of characters, consider using FileWriter
        System.out.println("file create");
        String header="Name\tRegno\tEssaysubmitted";//these are heading inside binary file
        byte[] arhdr=header.getBytes();//since we are creating the binary file we are converting the header content in to binary
        fl.write(arhdr);
        System.out.println("file written");
        fl.close();

	}

}
