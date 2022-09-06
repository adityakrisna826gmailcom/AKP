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

public class TestSortAlgoDynamic {

	int [] intNext;
	Random rand;
	int indexAwal;
	int indexAkhir;
	int jumlahData;
	int loopTest = 1;
	int loopBefore = 1;
	int loopAfter = 1;
	SortAlgorithm sA;
	
	@BeforeClass
	public void befClass()
	{
		System.out.println("Ini Adalah Before Class Test Short Algo Dynamic");
		System.out.println("===========================================================================");
	}
	
	@BeforeTest
	public void befTest()
	{
		System.out.println("Test Dimulai !!");
		sA = new SortAlgorithm();
		rand = new Random();
		System.out.println("===========================================================================");
		
	}
	
	@BeforeMethod
	public void befMethod()
	{
		System.out.println("Ini Adalah Before Method Test Short Algo Dynamic Yang Ke : " + loopBefore);
		jumlahData = rand.nextInt(5,20);
		intNext = new int [jumlahData];
		loopBefore ++;
		System.out.println("===========================================================================");
	}

	
	@Test (priority = 1)
	public void testPertama()
	{
		indexAwal = 0;
		indexAkhir = 100;
		
		for (int i = 0; i < jumlahData; i++)
		{
			intNext [i] = rand.nextInt(indexAwal, indexAkhir);
		}
		AssertJUnit.assertEquals(sA.selectionSortASCInt(intNext), sA.bubbleSortASCInt(intNext));
		System.out.println("===========================================================================");
	}
	
	@Test (priority = 2)
	public void testKedua()
	{
		indexAwal = 1000;
		indexAkhir = 10000;
		
		for (int i = 0; i < jumlahData; i++)
		{
			intNext [i] = rand.nextInt(indexAwal, indexAkhir);
		}
		
		AssertJUnit.assertEquals(sA.selectionSortASCInt(intNext), sA.bubbleSortASCInt(intNext));
		System.out.println("===========================================================================");
	}
	
	@AfterClass
	public void aftClass()
	{
		System.out.println("Ini Adalah Before Class Test Short Algo Dynamic");
		System.out.println("===========================================================================");
	}
	
	@AfterMethod
	public void aftMethod()
	{
		System.out.println("===========================================================================");
		System.out.println("Ini Adalah After Method Test Short Algo Dynamic Yang Ke : " + loopAfter);
		loopAfter ++;
		System.out.println("===========================================================================");
	}
	
	@AfterTest
	public void aftTest()
	{
		System.out.println("Test Sudah Selesai Dilakukan");
		System.out.println("===========================================================================");
	}
	
}
	
	
