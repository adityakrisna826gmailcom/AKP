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


public class TestMatematika {
	
	int indexAwal = 0;
	int indexAkhir = 0;
	int idxAwal = 0;
	int idxAkhir = 0;
	int loopTest = 1;
	int loopBefore = 1;
	int loopAfter = 1;
	Random rand;
	Matematika mtk;
	
	
	@BeforeTest
	   public void beforeTest() {
		System.out.println("Test Dimulai !!");
		mtk = new Matematika();
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
	public void testTambahNilai()
	{
		indexAwal = 1;
		indexAkhir = 20;
		double dataSatu = 0;
		double dataDua = 0;
		dataSatu = rand.nextDouble(indexAwal, indexAkhir);
		dataDua = rand.nextDouble(indexAwal, indexAkhir);
		System.out.println("Ini Adalah Nilai dataSatu : " + dataSatu);
		System.out.println("Ini Adalah Nilai dataDua : " + dataDua);
		assertEquals(mtk.tambahNilaiActual(dataSatu, dataDua), mtk.tambahNilaiExpect(dataSatu, dataDua));
		System.out.println("===========================================================================");
	}
	
	@Test
	public void testKurangNilai()
	{
		indexAwal = 1;
		indexAkhir = 20;
		double dataSatu = 0;
		double dataDua = 0;
		dataSatu = rand.nextDouble(indexAwal, indexAkhir);
		dataDua = rand.nextDouble(indexAwal, indexAkhir);
		System.out.println("Ini Adalah Nilai dataSatu : " + dataSatu);
		System.out.println("Ini Adalah Nilai dataDua : " + dataDua);
		assertEquals(mtk.kurangNilaiActual(dataSatu, dataDua), mtk.kurangNilaiExpect(dataSatu, dataDua));
		System.out.println("===========================================================================");
	}
	
	@Test
	public void testBagiNilai()
	{
		indexAwal = 1;
		indexAkhir = 20;
		double dataSatu = 0;
		double dataDua = 0;
		dataSatu = rand.nextDouble(indexAwal, indexAkhir);
		dataDua = rand.nextDouble(indexAwal, indexAkhir);
		System.out.println("Ini Adalah Nilai dataSatu : " + dataSatu);
		System.out.println("Ini Adalah Nilai dataDua : " + dataDua);
		assertEquals(mtk.bagiNilaiActual(dataSatu, dataDua), mtk.bagiNilaiExpect(dataSatu, dataDua));
		System.out.println("===========================================================================");
	}
	
	@Test
	public void testModulusNilai()
	{
		indexAwal = 26;
		indexAkhir = 50;
		idxAwal = 1;
		idxAkhir = 25;
		int dataSatu = 0;
		int dataDua = 0;
		dataSatu = rand.nextInt(indexAwal, indexAkhir);
		dataDua = rand.nextInt(idxAwal, idxAkhir);
		System.out.println("Ini Adalah Nilai dataSatu : " + dataSatu);
		System.out.println("Ini Adalah Nilai dataDua : " + dataDua);
		assertEquals(mtk.modulusNilaiActual(dataSatu, dataDua), mtk.modulusNilaiExpect(dataSatu, dataDua));
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
