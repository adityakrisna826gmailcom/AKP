package ujian.ujiankelima.jf;

import java.util.Random;
import java.util.Scanner;

public class MathFunction {

	public static void main(String[] args) {
		Random rand = new Random();
		String strInput;
		boolean isUlang = false;
		
		Scanner scn = new Scanner (System.in);
		do
		{
			try 
			{
				System.out.print("Masukkan Bilangan : ");
				strInput = scn.nextLine();
				int intInput = Integer.parseInt(strInput);
				System.out.println("===========================================");
				System.out.println("Akar dari bilangan : " + Math.sqrt(intInput));
				System.out.println("Sinus dari bilangan : " + Math.sin(intInput));
				System.out.println("Cosinus dari bilangan : " + Math.cos(intInput));
				System.out.println("Tangen dari bilangan : " + Math.tan(intInput));
				System.out.println("exp dari bilangan : " + Math.exp(intInput));
				System.out.println("===========================================");
				System.out.println();
				
			}catch(NumberFormatException e)
			{
				System.out.println();
				isUlang = true;
				System.out.println("Proses Selesai");
			}	
		}
		while(!isUlang);
	}
}
