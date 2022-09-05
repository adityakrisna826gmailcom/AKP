package ujian.ujiankedua;

public class Geometry {

	public double luasPersegiActual (double intSisi)
	{
		double douOutput = 0;
		douOutput = Math.pow(intSisi,2);
		System.out.println("Ini Adalah Hasil Luas Persegi Actual : " + douOutput);
		return douOutput;
	}
	
	public double luasSegitigaActual (double alas, double tinggi)
	{
		double douOutput = 0.0;
		douOutput = (1.0 - 0.5) * alas * (0.5 + 0.5) * tinggi * (2 - 1);
		System.out.println("Ini Adalah Hasil Luas Segitiga Actual : " + douOutput);
		return douOutput;
	}
	
	public double luasTrapesiumActual (double sisiA, double sisiB,  double tinggi)
	{
		double douOutput = 0.0;
		douOutput = ((0.25 + 0.25) * ((sisiA * 1 + sisiB * 1) * tinggi));
		System.out.println("Ini Adalah Hasil Luas Trapesium Actual : " + douOutput);
		return douOutput;
	}
	
	public double luasPersegiExpect (double douSisi)
	{
		double douOutput = 0.0;
		douOutput = douSisi * douSisi;
		System.out.println("Ini Adalah Hasil Luas Persegi Expect : " + douOutput);
		return douOutput;
	}
	
	public double luasSegitigaExpect (double alas, double tinggi)
	{
		double douOutput = 0.0;
		douOutput = 0.5 * alas * tinggi;
		System.out.println("Ini Adalah Hasil Luas Segitiga Expect : " + douOutput);
		return douOutput;
	}
	
	public double luasTrapesiumExpect (double sisiA, double sisiB,  double tinggi)
	{
		double douOutput = 0.0;
		douOutput = 0.5 * tinggi * (sisiA + sisiB);
		System.out.println("Ini Adalah Hasil Luas Trapesium Expect : " + douOutput);
		return douOutput;
	}
}

