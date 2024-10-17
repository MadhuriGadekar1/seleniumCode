package dataProviderUse;

import org.testng.annotations.DataProvider;

public class TestData {
   //firstName lastName MobNo
	@DataProvider(name="femaleData")
	public String[][] fbfemaledata()
	{
		String data[][]= {{"sonal","Gite","8888888888"},{"supriya","bhatt","9999999999"},{"priyanka","Dube","1111111111"}};
		
		return data;
	}
	@DataProvider(name="MaleData")
	public String[][] fbmaleData()
	{
		String data[][]= {{"Rohit","Thakre","3333333333"},{"surya","vagh","7777777777"},{"kartik","sen","4444444444"}};
		
		return data;
	}
}
