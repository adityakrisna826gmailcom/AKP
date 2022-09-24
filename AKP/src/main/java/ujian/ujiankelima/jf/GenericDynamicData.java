package ujian.ujiankelima.jf;

import java.util.Random;

public class GenericDynamicData {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int intIndexAwal = 0;
		int intIndexAkhir = 0;
		
		double douIndexAwal = 0;
		double douIndexAkhir = 0;
		
		int intJumlahData = rand.nextInt(1,10);
		
		System.out.println("Soal Nomor 1");
		System.out.println("Banyak Data : " + intJumlahData);
		System.out.println("================================");
		dataInteger(intJumlahData, intIndexAwal, intIndexAkhir);
		System.out.println("================================");
		dataDouble(intJumlahData, douIndexAwal, douIndexAkhir);
	}
	
	public static void dataInteger(int intJumlahData, int intIndexAwal, int intIndexAkhir)
	{
		Random rand = new Random();
		intIndexAwal = rand.nextInt(1,10);
		intIndexAkhir = rand.nextInt(11,20);
		int [] intNext;
		intNext = new int[intJumlahData];
		
		for (int j = 0; j<intJumlahData; j++)
		{
			intNext[j] = rand.nextInt(intIndexAwal,intIndexAkhir);
			System.out.println("Data Integer ke " + j + " :"+ intNext[j] + " ");
		}
	}
		
	public static void dataDouble(int intJumlahData, double douIndexAwal, double douIndexAkhir)
	{
		Random rand = new Random();
		douIndexAwal = rand.nextDouble(1,10);
		douIndexAkhir = rand.nextDouble(11,20);
		double [] douNext;
		douNext = new double[intJumlahData];
		
		for (int i = 0; i<intJumlahData; i++)
		{
			douNext[i] = rand.nextDouble(douIndexAwal,douIndexAkhir);
			System.out.println("Data Double ke " + i + " :" + douNext[i] + " ");
		}
	}

}
