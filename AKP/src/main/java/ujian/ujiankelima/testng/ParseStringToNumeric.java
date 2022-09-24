package ujian.ujiankelima.testng;

public class ParseStringToNumeric {

	public boolean parseToIntActual (String strInput)
	{
		boolean isEror  = true;
		int intInput = 0;
		try {
			intInput = Integer.valueOf(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}

		System.out.println("Ini Adalah Nilai Input Setelah Di Parsing : " + intInput);
		System.out.println("Ini Adalah Hasil Parsing To Int Actual: " + isEror);
		System.out.println("===========================================================================");
		return isEror;
	}
	
	
	public boolean parseToLongActual(String strInput)
	{
		boolean isEror  = true;
		long longInput = 0;
		try {
			longInput = Long.valueOf(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}
		
		System.out.println("Ini Adalah Nilai Input Setelah Di Parsing : " + longInput);
		System.out.println("Ini Adalah Hasil Parsing To Long Actual: " + isEror);
		System.out.println("===========================================================================");
		return isEror;
	}
	
	public boolean parseToByteActual(String strInput)
	{
		boolean isEror  = true;
		byte byteInput = 0;
		try {
			byteInput = Byte.valueOf(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}
		
		System.out.println("Ini Adalah Nilai Input Setelah Di Parsing : " + byteInput);
		System.out.println("Ini Adalah Hasil Parsing To Byte Actual: " + isEror);
		System.out.println("===========================================================================");
		return isEror;
	}
	
	public boolean parseToShortActual(String strInput)
	{
		boolean isEror  = true;
		short shortInput = 0;
		try {
			shortInput = Short.valueOf(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}
		
		System.out.println("Ini Adalah Nilai Input Setelah Di Parsing : " + shortInput);
		System.out.println("Ini Adalah Hasil Parsing To Short Actual: " + isEror);
		System.out.println("===========================================================================");
		return isEror;
	}
	
	public boolean parseToFloatActual(String strInput)
	{
		boolean isEror  = true;
		float floatInput = (float) 0.0;
		try {
			floatInput = Float.valueOf(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}
		
		System.out.println("Ini Adalah Nilai Input Setelah Di Parsing : " + floatInput);
		System.out.println("Ini Adalah Hasil Parsing To Float Actual: " + isEror);
		System.out.println("===========================================================================");
		return isEror;
	}
	
	public boolean parseToDoubleActual(String strInput)
	{
		boolean isEror  = true;
		double douInput = 0.0;
		try {
			douInput = Long.valueOf(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}
		
		System.out.println("Ini Adalah Nilai Input Setelah Di Parsing : " + douInput);
		System.out.println("Ini Adalah Hasil Parsing To Double Actual: " + isEror);
		System.out.println("===========================================================================");
		return isEror;
	}
	
	
	public boolean parseToIntExpect(String strInput)
	{
		boolean isEror  = true;
		int intInput = 0;
		try {
			intInput = Integer.valueOf(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}
		
		System.out.println("Ini Adalah Nilai Input Setelah Di Parsing : " + intInput);
		System.out.println("Ini Adalah Hasil Parsing To Int Expect: " + isEror);
		System.out.println("===========================================================================");
		return isEror;
	}
	
	public boolean parseToLongExpect(String strInput)
	{
		boolean isEror  = true;
		long longInput = 0;
		try {
			longInput = Long.valueOf(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}
		
		System.out.println("Ini Adalah Nilai Input Setelah Di Parsing : " + longInput);
		System.out.println("Ini Adalah Hasil Parsing To Long Expect: " + isEror);
		System.out.println("===========================================================================");
		return isEror;
	}
	
	public boolean parseToByteExpect(String strInput)
	{
		boolean isEror  = true;
		byte byteInput = 0;
		try {
			byteInput = Byte.parseByte(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}
		
		System.out.println("Ini Adalah Nilai Input Setelah Di Parsing : " + byteInput);
		System.out.println("Ini Adalah Hasil Parsing To Byte Expect: " + isEror);
		System.out.println("===========================================================================");
		return isEror;
	}
	
	public boolean parseToShortExpect(String strInput)
	{
		boolean isEror  = true;
		short shortInput = 0;
		try {
			shortInput = Short.parseShort(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}
		
		System.out.println("Ini Adalah Nilai Input Setelah Di Parsing : " + shortInput);
		System.out.println("Ini Adalah Hasil Parsing To Short Expect: " + isEror);
		System.out.println("===========================================================================");
		return isEror;
	}
	
	public boolean parseToFloatExpect(String strInput)
	{
		boolean isEror  = true;
		float floatInput = (float) 0.0;
		try {
			floatInput = Float.parseFloat(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}
		
		System.out.println("Ini Adalah Nilai Input Setelah Di Parsing : " + floatInput);
		System.out.println("Ini Adalah Hasil Parsing To Float Expect: " + isEror);
		System.out.println("===========================================================================");
		return isEror;
	}
	
	public boolean parseToDoubleExpect(String strInput)
	{
		boolean isEror  = true;
		double douInput = 0.0;
		try {
			douInput = Double.parseDouble(strInput);
			
		}catch (Exception e)
		{
			System.out.println(e);
			isEror = false;
		}
		
		System.out.println("Ini Adalah Nilai Input Setelah Di Parsing : " + douInput);
		System.out.println("Ini Adalah Hasil Parsing To Double Expect: " + isEror);
		System.out.println("===========================================================================");
		return isEror;
	}
}
