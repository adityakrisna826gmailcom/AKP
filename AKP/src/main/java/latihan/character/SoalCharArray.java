package latihan.character;

public class SoalCharArray {

	public static void main(String[] args) {
		// INPUT   = PaUL ChriStiAn
				// OUTPPUT = 16+1+21+12+3+8+18+9+19+20+9+1+14 = 151
				
				String strInput = "PaUL ChriStiAn";
				strInput = strInput.toLowerCase();
				
				char batasMax = 123;
				char batasMin = 96;
				int sum = 0;
				
				for(int i = 0; i < strInput.length(); i++) {
					if (strInput.charAt(i) > batasMin && strInput.charAt(i) < batasMax) {
						sum += strInput.charAt(i) - batasMin;
					}
				}
				
				System.out.println(sum);
				
				char X = 'p'+ 12;
				int intX = 'p'+ 12;
				System.out.println("X = " + X);
				System.out.println("intX = " + intX);
				

	}

}

// Catatan = charat() di gunakan untuk mengambil karakter dari string
//namun jika ketemu dengan operator aritmatika, maka type data akan otomatis berubah menjadi int, sehingga tidak perlu di konversi ke int
// ketika menggunakan type data char maka hasilnya akan menjadi character
// ketika menggunakan type data int, maka hasilnya akan menjadi angka kode assci
