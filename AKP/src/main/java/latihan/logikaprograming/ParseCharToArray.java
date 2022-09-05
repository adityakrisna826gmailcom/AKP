package latihan.logikaprograming;

public class ParseCharToArray {

	public static void main(String[] args) {
		Boolean abs = new Boolean("TRUE");
//		System.out.println(Character.isDigit('B'));
		int sum = 0;
		
		char batasMin = 64;
		char batasMax = 91;
		
		char [] ax = "DIKA-DIKA".toCharArray();
		
		for (int i = 0; i<ax.length;i++) {
			
			if(ax[i] > batasMin && ax[i] < batasMax) {
				sum += ax [i] - batasMin;
			}
		}
		
		System.out.println(sum);

	}

}
