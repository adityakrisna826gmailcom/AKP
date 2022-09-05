package latihan.oop;

public class Overloading {
	
	public static void main(String[] args) {
		xMethod("OK", 0);	

	}
	
	public static String xMethod(String b, int x)
	{
		System.out.println("MEMPROSES INFORMASI");
		System.out.println("TAMBAHAN INFORMASI");
		return"";
	}
	
	public static String xMethod(String a)
	{
		System.out.println("MEMPROSES INFORMASI");
		return"";
	}

}
