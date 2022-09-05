package latihan.perulangan;

public class LoopContinue {

	public static void main(String[] args) {
		int sum = 0;
		int item = 0;
		while(item<5) {
			item++;
			sum += item;
			if (sum >= 6) {
				System.out.println("Ini Yang Terlompati " + item);
				continue;
			}
			System.out.println(item +" kali loop ke " + item);
		}

	}

}
