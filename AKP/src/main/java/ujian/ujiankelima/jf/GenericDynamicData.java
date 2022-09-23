package ujian.ujiankelima.jf;

import java.util.Random;

public class GenericDynamicData {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int intJumlahData = rand.nextInt(1,10);
		
		System.out.println("Soal Nomor 1");
		System.out.println("Banyak Data : " + intJumlahData);
		System.out.println("================================");
		dataInteger(intJumlahData);
		System.out.println("================================");
		dataDouble(intJumlahData);
	}
	
	public static void dataInteger(int intJumlahData)
	{
		Random rand = new Random();
		int intIndexAwal = rand.nextInt(1,10);
		int intIndexAkhir = rand.nextInt(11,20);
		int [] intNext;
		intNext = new int[intJumlahData];
		
		for (int j = 0; j<intJumlahData; j++)
		{
			intNext[j] = rand.nextInt(intIndexAwal,intIndexAkhir);
			System.out.println("Data Integer ke " + j + " :"+ intNext[j] + " ");
		}
	}
		
	public static void dataDouble(int intJumlahData)
	{
		Random rand = new Random();
		double douIndexAwal = rand.nextDouble(1,10);
		double douIndexAkhir = rand.nextDouble(11,20);
		double [] douNext;
		douNext = new double[intJumlahData];
		
		for (int i = 0; i<intJumlahData; i++)
		{
			douNext[i] = rand.nextDouble(douIndexAwal,douIndexAkhir);
			System.out.println("Data Double ke " + i + " :" + douNext[i] + " ");
		}
	}

}
