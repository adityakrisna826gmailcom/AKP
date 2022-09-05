package latihan.wapperclass;

import latihan.oop.Car;

//import com.juaracoding.training.oop.ModelEncaps;


public class OretOretan {

	public static void main(String[] args) {
//		ModelEncaps me = new ModelEncaps("Adit", "Aku");
//		System.out.println("USERNAME : " + me.getUserN());
//		System.out.println("PASSWORD : " + me.getPassword());
		
		Car mobil = new Car("Pertilite");
		mobil.warna();
		mobil.mesin();
		
		System.out.println("bahannya : "+ mobil.getBahanakar());
		System.out.println("mesinnya : "+ mobil.getTahunPembuatan());

	}

}
