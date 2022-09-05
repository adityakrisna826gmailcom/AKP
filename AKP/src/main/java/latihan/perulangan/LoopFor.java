package latihan.perulangan;

public class LoopFor {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		//NESTED FOR
		int intLoop = 0;
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				intLoop ++;
				if (intLoop == 5) {
					System.out.println("SUKSES ke - " + intLoop);
					break;
				}
			}
		}
		
		System.out.println("BREAK DIEKSEKUSI");
	}

}
