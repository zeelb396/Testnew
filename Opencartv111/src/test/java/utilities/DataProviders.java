package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name="LoginData")
	public String [] [] getData() throws IOException
	{
		String path= ".\\testData\\Opencart_LoginData.xlsx";// Taking xl file from testdata
		
		ExcelUtility xlutil= new ExcelUtility(path);// Creating object for XLUtility
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1",1);
		
		String logindata[] []= new String [totalrows][totalcols];//Created for two dimension array which we can store
		
		for (int i=1;i<=totalrows;i++) // read the data from xl storing in two deminsional array
			// i started from zero because 1st we have header part
		{
			for (int j=0;j<totalcols;j++) // i is rows j is col
			{
				logindata[i-1][j] = xlutil.getCellData ("Sheet1",i,j);  
				// i-1 is taken because indexing will start from zero,
			}
		}
		return logindata;	
			
			
		
		
		
		
		
	}
}
