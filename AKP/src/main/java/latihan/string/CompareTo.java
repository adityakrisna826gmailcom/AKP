package latihan.string;

public class CompareTo {

	public static void main(String[] args) {
		String a = "TEA A";
		String b = "TEAA";
		
		System.out.println(b.compareTo(a));

	}

}

//CompareTo adalah membandingkan antar string kemudian hitung selisih berdasarkan kode assci
// Jika digit data antara kedua kata tidak sama, jika di compare maka akan menghasilkan (length kata pertama dikurang length kata kedua) atau sebaliknya
//
