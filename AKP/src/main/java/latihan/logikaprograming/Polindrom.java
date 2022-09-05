package latihan.logikaprograming;

import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Masukkan kata polindrom yang ingin di proses : ");
		String strText = scn.nextLine();
		String poli = "";
		StringBuilder strBuilder = new StringBuilder();
		String strTest = "";
		
		//Kakak
		strBuilder.setLength(0); // Hapus seluruh isi strBuilder
		for (int i = strText.length(); i > 0 ; i--) {
			System.out.println(strText.substring(i-1, i) + " i = " + i);
			strTest = strText.substring(i-1, i);
			poli = strBuilder.append(strTest).toString();
		}
		
		strBuilder.setLength(0);
		if(strText.equalsIgnoreCase(poli)) {
			System.out.println("=== "+strText+" adalah Polindrom ===");
		}
		else {
			System.out.println("=== "+strText+" bukan Polindrom ===");
		}
		

	}

}

// Perbedaan antara .Next dan .NextLine adalah jika .Next hanya bisa untuk 1 kata
// Namun jika .NextLine bisa lebih dari satu kata
// Palindrom adalah membandingkan antar huruf dalam satu kata, kalau lebih dari 1 kata dan beda kata maka sudah di pastikan bukan palindrom
