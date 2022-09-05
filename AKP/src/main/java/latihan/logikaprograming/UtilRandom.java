package latihan.logikaprograming;

import java.util.Random;

public class UtilRandom {

	public static void main(String[] args) {
		Random rand = new Random();
		
		for (int i = 0; i < 10; i++) {
			
//			if(rand.nextInt(5,11)==11) {
//				System.out.println("INI ANGKA 11");
//			}
			System.out.println("Random Number " + i + " -> "+ rand.nextInt(5,11));
		}

	}

}

// Catatan :
// rand.nextInt(5,11) artinya adalah, angka 5 menunjukkan batas minimal kemudian 11 adalah batas maksimum kemudian di kurang 1
// sehingga nanti jadinya batas minimal nya 5 dan batas maksimum 10 (5,10)
// Untuk lebih jelas akan lebih baik jika baca dokumentasi