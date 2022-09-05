package latihan.string;

public class StringObject {

	public static void main(String[] args) {
		String namaFirst = new String("Dono");
		String namaSecond = new String("Dono");
//		String namaFirst = "Dono";
//		String namaSecond = "Dono";
		
		System.out.println(namaFirst==namaSecond);
		
		if(namaFirst==namaSecond)
		{
			System.out.println(namaFirst.equals(namaSecond));
		}

	}

}
