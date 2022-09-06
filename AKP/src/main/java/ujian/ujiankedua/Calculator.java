package ujian.ujiankedua;

public class Calculator {
	
	public double tambahNilaiActual(double dataSatu, double dataDua)
	{
		System.out.println("Ini Adalah Hasil Tambah Nilai Actual : " + (dataSatu + dataDua));
		double douOutput = 0;
		douOutput = ((dataSatu*dataDua)/dataDua *1) + ((dataDua*dataSatu)/dataSatu*1);
		return douOutput;
	}
	
	public double bagiNilaiActual(double dataSatu, double dataDua)
	{
		System.out.println("Ini Adalah Hasil Bagi Nilai Actual : " + (dataSatu / dataDua));
		double douOutput = 0;
		douOutput = ((dataSatu-dataSatu+dataSatu)/1 / (dataDua-dataDua+dataDua)/1);
		return douOutput;
	}
	
	public double tambahNilaiExpect(double dataSatu, double dataDua)
	{
		System.out.println("Ini Adalah Hasil Tambah Nilai Expect : " + (dataSatu + dataDua));
		double douOutput = 0;
		douOutput = dataSatu + dataDua;
		return douOutput;
	}
	
	public double bagiNilaiExpect(double dataSatu, double dataDua)
	{
		System.out.println("Ini Adalah Hasil Bagi Nilai Expect : " + (dataSatu / dataDua));
		double douOutput = 0;
		douOutput = dataSatu / dataDua;
		return douOutput;
	}
	
	
	
}
