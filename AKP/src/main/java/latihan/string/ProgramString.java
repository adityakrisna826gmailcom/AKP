// 1. Konfirmasi kepada user, menggunakan input statis atau dinamis serta input menggunakan type data apa?
// 2. Konfirmasi kepada user, jika input username salah akan kembali input username samapi benar atau input username dan password terlebih dahulu kemudian masuk ke pengkondisian.
// 3. Karena jika input username dan password yang salah secara bersamaan, yang tercetak hanya Panjang Character Tidak Boleh Lebih Dari 50, namun Format Password Tidak Sesuai tidak tercetak. 


package latihan.string;

import java.util.Scanner;

public class ProgramString {

	public static void main(String[] args) {
		String sUser, sPassword;
		Scanner sn = new Scanner(System.in);
		
//		strString = "qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq";
		
//		System.out.println("Masukkan Username: ");
//		sUser = sn.nextLine();
//		System.out.println("Masukkan Password: ");
//		sPassword = sn.nextLine();
//		
//		if (strUser.length() > 50) {
//			System.out.println("Panjang Character Tidak Boleh Lebih Dari 50");
//			
//		}else 
//			if(strPass.equals("Sesuai")) {
//			System.out.println("Anda berhasil Login");
//			
//		}else {
//			System.out.println("Format Password Tidak Sesuai");
//		}
		
		
//Program jika input username dan password tidak bersamaan
		do {
			System.out.println("Masukkan Username: ");
			sUser = sn.nextLine();
			if (sUser.length() > 10) {
				System.out.println("Panjang Character Tidak Boleh Lebih Dari 50");
			}
		}while (sUser.length() > 10);
		
		do {
			System.out.println("Masukkan Password: ");
			sPassword = sn.nextLine();
			if (!(sPassword.equals("Sesuai"))) {
				System.out.println("Format Password Tidak Sesuai");
			}
			
		}while(!(sPassword.equals("Sesuai")));
		System.out.println("Anda berhasil Login");
		
		
//		String sUser = "Paul Christian";
//
//		String sPassword = "Sesuai";

		

//		if(sUser.length()>10)//ini true tapi ini yang akan tereksekusi, seperti itu memang cara kerja nya. banyak di kasus2 di proses scoring dan approval lembaga perbankan & multifinance.
//
//		{
//
//			System.out.println("Panjang Username maksimal 10 character");
//
//		}
//
//		else if(sPassword.equalsIgnoreCase("sesuai"))//ini true
//
//		{
//
//			System.out.println("Password Salah");
//
//		}
//
//               else
//
//		{
//
//			System.out.println("Login Berhasil");
//
//		}

	}

}
