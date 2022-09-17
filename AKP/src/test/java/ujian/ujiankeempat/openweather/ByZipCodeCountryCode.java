package ujian.ujiankeempat.openweather;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ujian.ujiankeempat.openweather.util.ExcelReader;

public class ByZipCodeCountryCode {

	private ExcelReader excelReader;
	private Object [][] dDriven ;
	private int intColumnNums;
	private int intRowNums;
	private JSONObject req ;
	@BeforeTest
	public void befTest()
	{
		baseURI = "https://api.openweathermap.org/";
		req = new JSONObject();
		String excelPath = "./Data/ByZipCodeCountryCode.xlsx";
//		String excelPath = "C:\\Users\\NEXSOFT\\Documents\\Bootcamp\\AKP\\UJIAN_KEEMPAT\\RESTASSURED\\DataDriven\\ByZipCodeCountryCode.xlsx";
		String sheetName = "Sheet1";
		excelReader = new ExcelReader(excelPath, sheetName);
		System.out.println("Jumlah data : ");
		intRowNums = excelReader.getRowCount();
		intColumnNums = excelReader.getColCount();
		
	}
	
	@DataProvider(name = "DataProviderFirst")
	public Object[] dataDrivenGet()
	{
		
		dDriven = new Object[intRowNums][intColumnNums];
		
		Iterator<Row> r = excelReader.getIter();
		int baris = 0;
		int intLoop = 1;
		System.out.println("=========================");
		while(r.hasNext())
		{
			Row rows = r.next();
			System.out.println("=======" + "data ke :" + intLoop +" =======");
			for(int kolom=0;kolom<intColumnNums;kolom++)
			{
				dDriven[baris][kolom] = excelReader.getCellData(baris, kolom);
				if (kolom == 0) {
					System.out.println("Zip : " + dDriven[baris][kolom]);
				}else {
					System.out.println("Country Code : " + dDriven[baris][kolom]);
				}
			}
			System.out.println("=========================");
			baris++;
			intLoop++;
		}
		
		
		return dDriven;		
	}
	
	@Test(priority = 0,dataProvider="DataProviderFirst")
	public void testGet(String zip, String countryCode)
	{

		System.out.println();
		System.out.println("==================================");
		
		String apiKey ="3eac9d4cf75f15326892c1d0cf93eff9";
		
		given().
		param("zip", zip).and().
		param("zip", countryCode).and().
		param("appid", apiKey).
		when().
		get("/data/2.5/weather").
		then().
		statusCode(200).log().all();
		
		System.out.println("==================================");
	}
}
