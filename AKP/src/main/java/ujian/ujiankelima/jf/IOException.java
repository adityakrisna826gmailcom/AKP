package ujian.ujiankelima.jf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOException {

	public static void main(String[] args) {
		FileInputStream inFile = null;
		byte[] byteOfFile = null;
		FileOutputStream outFile = null;	
		try {
			inFile = new FileInputStream("C:\\Users\\NEXSOFT\\Documents\\Bootcamp\\Databased.txt");
			outFile = new FileOutputStream("C:\\Users\\NEXSOFT\\Documents\\Bootcamp\\APIN.txt");
			inFile.close();
	        outFile.close();
		}catch(Exception e)
		{
			System.out.println("FILE TIDAK DITEMUKAN !!");
			
		}        
		System.out.println("NEXT STATEMENT");
	}

}
