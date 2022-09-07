package ujian.ujiankedua;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.util.Random;
import java.util.Scanner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestParseToNumeric {

	Scanner scn = new Scanner(System.in);
	String strInput = "";
	int loopTest = 1;
	int loopBefore = 1;
	int loopAfter = 1;
	ParseToNumeric a;
	Random rand;
	
	@BeforeTest
	   public void beforeTest() {
		System.out.println("Test Dimulai !!");
		a = new ParseToNumeric();
		System.out.println("===========================================================================");
	   }
	
	@BeforeClass
	   public void beforeClass() {
		System.out.println("Ini Adalah Before Class Test Parse To Numeric");
		System.out.println("===========================================================================");
	   }
	
	@BeforeMethod
	   public void beforeMethod() {
		System.out.println("Ini Adalah Before Method Test Parse To Numeric Yang Ke : " + loopBefore);
		System.out.println("===========================================================================");
		loopBefore ++;	
	   }
	
	@Test
	public void testParseToInt()
	{
		System.out.println("Masukkan Data String : ");
		strInput = scn.nextLine();
		AssertJUnit.assertEquals(a.parseToIntActual(strInput), a.parseToIntExpect(strInput));
	}
	
	@Test
	public void testParseToLong()
	{
		System.out.println("Masukkan Data String : ");
		strInput = scn.nextLine();
		AssertJUnit.assertEquals(a.parseToLongActual(strInput), a.parseToLongExpect(strInput));
	}
	
	@AfterMethod
	   public void afterMethod() {
		 System.out.println("Ini Adalah After Method Test Parse To Numeric Yang Ke : " + loopAfter);
		 System.out.println("===========================================================================");
		 loopAfter ++;
	   }
	 
	 @AfterClass
	   public void afterClass() {
		 System.out.println("Ini Adalah After Class Test Parse To Numeric");
		 System.out.println("===========================================================================");
	   }
	 
	 @AfterTest
	   public void afterTest() {
		 System.out.println("Test Sudah Selesai Dilakukan");
		 System.out.println("===========================================================================");
	   }
}
