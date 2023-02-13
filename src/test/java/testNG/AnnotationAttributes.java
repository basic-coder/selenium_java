package testNG;

import org.testng.annotations.*;

public class AnnotationAttributes {

	@Test(description="this test one",dependsOnMethods= {"WebLoginPersonalLoan"})
	public void MobileLoginPersonalLoan()
	{
		System.out.println("mobile test case");
	}
	
	
	@Test(timeOut=200,priority=1)
	public void WebLoginPersonalLoan()
	{
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("web test case");
	}
	
	@Test(groups="internal run")
	public void ApiLoginPersonalLoan()
	{
		System.out.println("api test case");
	}
	
	@Test(groups="internal run")
	public void OTPLoginPersonalLoan()
	{
		System.out.println("OTP test case");
	}
}
