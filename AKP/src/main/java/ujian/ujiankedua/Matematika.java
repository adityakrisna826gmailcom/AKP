package ujian.ujiankedua;

public class Matematika {
	
	
	public double tambahNilaiActual(double dataSatu, double dataDua)
	{
		System.out.println("Ini Adalah Hasil Tambah Nilai Actual : " + (dataSatu + dataDua));
		double douOutput = 0;
		douOutput = ((dataSatu*dataDua)/dataDua *1) + ((dataDua*dataSatu)/dataSatu*1);
		return douOutput;
	}
	
	public double kurangNilaiActual(double dataSatu, double dataDua)
	{
		System.out.println("Ini Adalah Hasil Kurang Nilai Actual : " + (dataSatu - dataDua));
		double douOutput = 0;
		douOutput = ((dataSatu/dataSatu*dataSatu) - (dataDua/dataDua*dataDua) );
		return douOutput;
	}
	
	public double bagiNilaiActual(double dataSatu, double dataDua)
	{
		System.out.println("Ini Adalah Hasil Bagi Nilai Actual : " + (dataSatu / dataDua));
		double douOutput = 0;
		douOutput = ((dataSatu-dataSatu+dataSatu)/1 / (dataDua-dataDua+dataDua)/1);
		return douOutput;
	}
	
	public int modulusNilaiActual(int dataSatu, int dataDua)
	{
		System.out.println("Ini Adalah Hasil Modulus Nilai Actual : " + (dataSatu % dataDua));
		int intOutput = 0;
		intOutput = dataSatu % dataDua;
		return intOutput;
	}
	
	

	public double tambahNilaiExpect(double dataSatu, double dataDua)
	{
		System.out.println("Ini Adalah Hasil Tambah Nilai Expect : " + (dataSatu + dataDua));
		double douOutput = 0;
		douOutput = dataSatu + dataDua;
		return douOutput;
	}
	
	public double kurangNilaiExpect(double dataSatu, double dataDua)
	{
		System.out.println("Ini Adalah Hasil Kurang Nilai Expect : " + (dataSatu - dataDua));
		double douOutput = 0;
		douOutput = dataSatu - dataDua;
		return douOutput;
	}
	
	public double bagiNilaiExpect(double dataSatu, double dataDua)
	{
		System.out.println("Ini Adalah Hasil Bagi Nilai Expect : " + (dataSatu / dataDua));
		double douOutput = 0;
		douOutput = dataSatu / dataDua;
		return douOutput;
	}
	
	public int modulusNilaiExpect(int dataSatu, int dataDua)
	{
		System.out.println("Ini Adalah Hasil Modulus Nilai Expect : " + (dataSatu % dataDua));
		int intOutput = 0;
		intOutput = dataSatu % dataDua;
		return intOutput;
	}
}
