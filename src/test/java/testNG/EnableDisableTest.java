package testNG;

import org.testng.annotations.Test;

public class EnableDisableTest {
	
	@Test(enabled=false)
	public void MobileLoginPersonalLoan()
	{
		System.out.println("test case");
	}
	
	@Test(enabled=false)
	public void WebLoginPersonalLoan()
	{
		System.out.println("test case 2");
	}
	
	@Test
	public void ApiLoginPersonalLoan()
	{
		System.out.println("test case 3");
	}

}
