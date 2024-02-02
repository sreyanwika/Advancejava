package MOD2labWrk;
import java.io.*;//it contains file input and out ...packages
import java.util.Scanner;//v can use java.util.*
public class CreateFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		System.out.println("to create folder please enter the dolder name:");
		String FolName=x.next();
		File f=new File(FolName);//An abstract representation of file and directory pathnames. the object created is used to various functions on that folder
		if(f.exists() && f.isDirectory()) {
			System.out.println("folder already exists");
		}
		else if(f.mkdir()==true) {
			System.out.println("successfully createdd");
		}
		else {
			System.out.println("not  createdd");
		}

	}

}
