package latihan.character;

public class Character {

	public static void main(String[] args) {
		char m = 20; // konfirmasi terlebih dahulu, apakah boleh jika deklarasi digabungkan dengan assignment
//		m = 20;
		
		if (m >= 20) { // Akan lebih baik jika operator perbandingan nya diganti menjadi (>=) karena jika di input angka 20, maka 20 dianggap kurang dari 20
			if(m == 'c') {
				System.out.println(1);
			}else {
				System.out.println(2);
			}
			
		}else if(m == 'k') {  // Terjadi bugs karena kondisi ini tidak akan pernah terpenuhi, karena char 'k' memiliki kode ascii(107), sehingga jika di input angka kurang dari 20, maka akan mencetak angka 4 terus
								// Jika kondisi tersebut ingin terpenuhi, maka char nya bisa di ganti menjadi selain huruf atau kode ascii yang kurang dari 20
			System.out.println(3);
		}else {
			System.out.println(4);
		}

	}

}
