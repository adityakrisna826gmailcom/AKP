package latihan.oop;

public class Kendaraan {

	public static void main(String[] args) {
		Car mobil = new Car("Pertilite");
		mobil.warna();
		mobil.mesin();
		
		System.out.println("bahannya : "+ mobil.getBahanakar());
		System.out.println("mesinnya : "+ mobil.getTahunPembuatan());

	}

}
