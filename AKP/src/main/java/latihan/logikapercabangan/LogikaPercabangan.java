package latihan.logikapercabangan;

public class LogikaPercabangan {

	public static void main(String[] args) {
		boolean isLapar = true;
		boolean isHujan = true;

		if (isLapar == true){
		    if(isHujan == true){
		        System.out.println("Masak Sendiri");
		    }else {
		        System.out.println("Makan Diluar");
		    }
		}else {
		    System.out.println("Rebahan");
		}

		
		int x = 10;
		
		if (x>10) {
			if(x%2 == 0) {
				System.out.println("Bilangan Genap > 10");
			}else {
				System.out.println("Bilangan Ganjil > 10");
			}
			
		}else if (x%2 == 0) {
			System.out.println("Bilangan Genap < 10");
		}else {
			System.out.println("Bilangan Ganjil < 10");
		}
		
		boolean isRemainderOn = true;

		int intVal = 1200;

		String strCuaca = "Hujan";

		String strExec = "";

		if(intVal >1500) 

		System.out.println(intVal);

		System.out.println(strCuaca);
		
		if( (5 > 3 ) && ( 7 != 2) )

		{

		System.out.println("OK");

		}

		else if( ( 4 == 4 ) || !( 3 > 2 ) )

		{

		System.out.println("YES");

		}

		else

		{

		System.out.println("NO");

		}

	}

}
