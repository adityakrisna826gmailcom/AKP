package ujian.ujiankelima.testng;

import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import ujian.ujiankedua.ParseToNumeric;

public class TestParseStringToNumeric {

//	Scanner scn = new Scanner(System.in);
	String strInput = "";
	boolean bouCharacter = false;
    boolean bouNumber = true;
	int intLengthString =1;
	int loopTest = 1;
	int loopBefore = 1;
	int loopAfter = 1;
	ParseStringToNumeric a;
	Random rand;
	
	@BeforeTest
	   public void beforeTest() {
		System.out.println("Test Dimulai !!");
		a = new ParseStringToNumeric();
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
	
	@Test(priority = 0)
	public void testParseToInt()
	{
		System.out.println();
		System.out.println("<--------- TEST STRING TO INT--------->");
		rand = new Random();
		intLengthString = rand.nextInt(0, 10);
		strInput = RandomStringUtils.random(intLengthString, bouCharacter, bouNumber);
		System.out.println("String Input: "+strInput);
		AssertJUnit.assertEquals(a.parseToIntActual(strInput), a.parseToIntExpect(strInput));
	}
	
	@Test(priority = 1)
	public void testParseToLong()
	{
		System.out.println();
		System.out.println("<--------- TEST STRING TO Long--------->");
		rand = new Random();
		intLengthString = rand.nextInt(1, 10);
		strInput = RandomStringUtils.random(intLengthString, bouCharacter, bouNumber);
		System.out.println("String Input: "+strInput);
		AssertJUnit.assertEquals(a.parseToLongActual(strInput), a.parseToLongExpect(strInput));
	}
	
	@Test(priority = 2)
	public void testParseToByte()
	{
		System.out.println();
		System.out.println("<--------- TEST STRING TO Byte--------->");
		rand = new Random();
		intLengthString = rand.nextInt(1, 5);
		strInput = RandomStringUtils.random(intLengthString, bouCharacter, bouNumber);
		System.out.println("String Input: "+strInput);
		AssertJUnit.assertEquals(a.parseToByteActual(strInput), a.parseToByteExpect(strInput));
	}
	
	@Test(priority = 3)
	public void testParseToShort()
	{
		System.out.println();
		System.out.println("<--------- TEST STRING TO Short--------->");
		rand = new Random();
		intLengthString = rand.nextInt(1, 10);
		strInput = RandomStringUtils.random(intLengthString, bouCharacter, bouNumber);
		System.out.println("String Input: "+strInput);
		AssertJUnit.assertEquals(a.parseToShortActual(strInput), a.parseToShortExpect(strInput));
	}
	
	@Test(priority = 4)
	public void testParseToFloat()
	{
		System.out.println();
		System.out.println("<--------- TEST STRING TO Float--------->");
		rand = new Random();
		intLengthString = rand.nextInt(1, 10);
		strInput = RandomStringUtils.random(intLengthString, bouCharacter, bouNumber);
		System.out.println("String Input: "+strInput);
		AssertJUnit.assertEquals(a.parseToFloatActual(strInput), a.parseToFloatExpect(strInput));
	}
	
	@Test(priority = 5)
	public void testParseToDouble()
	{
		System.out.println();
		System.out.println("<--------- TEST STRING TO Double--------->");
		rand = new Random();
		intLengthString = rand.nextInt(1, 10);
		strInput = RandomStringUtils.random(intLengthString, bouCharacter, bouNumber);
		System.out.println("String Input: "+strInput);
		AssertJUnit.assertEquals(a.parseToDoubleActual(strInput), a.parseToDoubleExpect(strInput));
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
