package latihan.oop;

public class Car {
	String bahanBakar;
	int tahunPembuatan = 2000;
	
	public Car (String bahanBakar)
	{
		this.bahanBakar = bahanBakar;
	}
	
	public void warna()
	{
		System.out.println("berwarna merah");
	}
	
	public void mesin()
	{
		System.out.println("bermesin 1800 cc");
	}
	
	public int getTahunPembuatan()
	{
		return tahunPembuatan;
	}
	
	public String getBahanakar()
	{
		return bahanBakar;
	}
}
