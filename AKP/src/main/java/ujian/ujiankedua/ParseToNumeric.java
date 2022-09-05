package ujian.ujiankedua;

public class ParseToNumeric {

	
	public boolean parseToIntActual (String strInput)
	{
		boolean isEror  = true;
		int intInput = 0;
		try {
			intInput = Integer.parseInt(strInput);
			
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
			longInput = Long.parseLong(strInput);
			
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
	
	
	public boolean parseToIntExpect(String strInput)
	{
		boolean isEror  = true;
		int intInput = 0;
		try {
			intInput = Integer.parseInt(strInput);
			
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
			longInput = Long.parseLong(strInput);
			
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
}
