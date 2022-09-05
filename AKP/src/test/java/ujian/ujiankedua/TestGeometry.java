package ujian.ujiankedua;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGeometry {

	int indexAwal = 0;
	int indexAkhir = 0;
	int loopTest = 1;
	int loopBefore = 1;
	int loopAfter = 1;
	Random rand;
	Geometry geo;
	
	@BeforeTest
	   public void beforeTest() {
		System.out.println("Test Dimulai !!");
		geo = new Geometry();
		rand = new Random();
		System.out.println("===========================================================================");
	   }
	
	@BeforeClass
	   public void beforeClass() {
		System.out.println("Ini Adalah Before Class");
		System.out.println("===========================================================================");
	   }
	
	@BeforeMethod
	   public void beforeMethod() {
		System.out.println("Ini Adalah Before Method Yang Ke : " + loopBefore);
		System.out.println("===========================================================================");
		loopBefore ++;	
	   }
	
	@Test
	public void testLuasPersegi()
	{
		indexAwal = 1;
		indexAkhir = 20;
		double douSisi = 0;
		douSisi = rand.nextDouble(indexAwal, indexAkhir);
		System.out.println("Ini Adalah Nilai douSisi : " + douSisi);
		assertEquals(geo.luasPersegiActual(douSisi), geo.luasPersegiExpect(douSisi));
		System.out.println("===========================================================================");
	}
	
	@Test
	public void testLuasSegitiga()
	{
		indexAwal = 1;
		indexAkhir = 20;
		double alas = 0;
		double tinggi = 0;
		alas = rand.nextInt(indexAwal, indexAkhir);
		tinggi = rand.nextDouble(indexAwal, indexAkhir);
		System.out.println("Ini Adalah Nilai Alas : " + alas);
		System.out.println("Ini Adalah Nilai Tinggi : " + tinggi);
		assertEquals(geo.luasSegitigaActual(alas, tinggi), geo.luasSegitigaExpect(alas, tinggi));
		System.out.println("===========================================================================");
	}
	
	@Test
	public void testLuasTrapesium()
	{
		indexAwal = 1;
		indexAkhir = 20;
		double sisiA = 0;
		double sisiB = 0;
		double tinggi = 0;
		sisiA = rand.nextDouble(indexAwal, indexAkhir);
		sisiB = rand.nextDouble(indexAwal, indexAkhir);
		tinggi = rand.nextInt(indexAwal, indexAkhir);
		System.out.println("Ini Adalah Nilai sisiA : " + sisiA);
		System.out.println("Ini Adalah Nilai sisiB : " + sisiB);
		System.out.println("Ini Adalah Nilai Tinggi : " + tinggi);
		assertEquals(geo.luasTrapesiumActual(sisiA, sisiB, tinggi), geo.luasTrapesiumExpect(sisiA, sisiB, tinggi));
		System.out.println("===========================================================================");
		
	}
	
	@AfterMethod
	   public void afterMethod() {
		 System.out.println("Ini Adalah After Method Yang Ke : " + loopAfter);
		 System.out.println("===========================================================================");
		 loopAfter ++;
	   }
	 
	 @AfterClass
	   public void afterClass() {
		 System.out.println("Ini Adalah After Class");
		 System.out.println("===========================================================================");
	   }
	 
	 @AfterTest
	   public void afterTest() {
		 System.out.println("Test Sudah Selesai Dilakukan");
		 System.out.println("===========================================================================");
	   }
}
