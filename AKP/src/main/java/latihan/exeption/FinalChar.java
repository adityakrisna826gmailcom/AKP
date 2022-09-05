package latihan.exeption;

import java.util.Scanner;

public class FinalChar {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		char batasMin = 48;
		char batasMax = 57;
		int intSum = 0;
		String strInput = "";
		
		System.out.println("Masukkan Input : ");
		strInput = scn.nextLine();		
			
		for (int i = 0; i < strInput.length(); i++)
		{
			if (strInput.charAt(i) >= batasMin && strInput.charAt(i) <= batasMax) 
			{
				intSum += strInput.charAt(i) - (batasMin-2);
			}
		}
		
		System.out.println("OUTPUT = "+intSum);
	
	}
}

//07a45te312qw6M-8so9
