package ujian.ujiankedua;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestCalculator {
	
	int indexAwal = 0;
	int indexAkhir = 0;
	int idxAwal = 0;
	int idxAkhir = 0;
	int loopTest = 1;
	int loopBefore = 1;
	int loopAfter = 1;
	Random rand;
	Calculator c;
	
	@BeforeTest
	   public void beforeTest() {
		System.out.println("Test Dimulai !!");
		c = new Calculator();
		rand = new Random();
		System.out.println("===========================================================================");
	   }
	
	@BeforeClass
	   public void beforeClass() {
		System.out.println("Ini Adalah Before Class Test Calculator");
		System.out.println("===========================================================================");
	   }
	
	@BeforeMethod
	   public void beforeMethod() {
		System.out.println("Ini Adalah Before Method Test Calculator Yang Ke : " + loopBefore);
		System.out.println("===========================================================================");
		loopBefore ++;	
	   }
	
	@Test
	
	public void testAddNilai()
	{
		indexAwal = 1;
		indexAkhir = 20;
		double dataSatu = 0;
		double dataDua = 0;
		dataSatu = rand.nextDouble(indexAwal, indexAkhir);
		dataDua = rand.nextDouble(indexAwal, indexAkhir);
		System.out.println("Ini Adalah Nilai dataSatu : " + dataSatu);
		System.out.println("Ini Adalah Nilai dataDua : " + dataDua);
		AssertJUnit.assertEquals(c.tambahNilaiActual(dataSatu, dataDua), c.tambahNilaiExpect(dataSatu, dataDua));
		System.out.println("===========================================================================");
		
	}
	
	@Test
	public void testDivideNilai()
	{
		indexAwal = 1;
		indexAkhir = 20;
		double dataSatu = 0;
		double dataDua = 0;
		dataSatu = rand.nextDouble(indexAwal, indexAkhir);
		dataDua = rand.nextDouble(indexAwal, indexAkhir);
		System.out.println("Ini Adalah Nilai dataSatu : " + dataSatu);
		System.out.println("Ini Adalah Nilai dataDua : " + dataDua);
		AssertJUnit.assertEquals(c.bagiNilaiActual(dataSatu, dataDua), c.bagiNilaiExpect(dataSatu, dataDua));
		System.out.println("===========================================================================");
	}
	
	 @AfterMethod
	   public void afterMethod() {
		 System.out.println("Ini Adalah After Method Test Calculator Yang Ke : " + loopAfter);
		 System.out.println("===========================================================================");
		 loopAfter ++;
	   }
	 
	 @AfterClass
	   public void afterClass() {
		 System.out.println("Ini Adalah After Class Test Calculator");
		 System.out.println("===========================================================================");
	   }
	 
	 @AfterTest
	   public void afterTest() {
		 System.out.println("Test Sudah Selesai Dilakukan");
		 System.out.println("===========================================================================");
	   }
}
