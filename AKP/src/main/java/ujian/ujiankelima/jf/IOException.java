package ujian.ujiankelima.jf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOException {

	public static void main(String[] args) {
		FileInputStream inFile = null;
		byte[] byteOfFile = null;	
		try {
			inFile = new FileInputStream("C:\\Users\\NEXSOFT\\Documents\\Bootcamp\\Databased.txt");
			inFile.close();
		}catch(Exception e)
		{
			System.out.println("FILE TIDAK DITEMUKAN !!");
			
		}        
		System.out.println("NEXT STATEMENT");
	}

}
