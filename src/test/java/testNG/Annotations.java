package testNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class Annotations {

	@BeforeClass
	public void BeforeCls()
	{
		System.out.println("before class test case... \n");
	}
	
	@AfterClass
	public void AfterCls()
	{
		System.out.println("after class test case... \n");
	}
	@BeforeMethod
	public void Before()
	{
		System.out.println("before test case... \n");
	}
	@AfterMethod
	public void After()
	{
		System.out.println("after test case ...\n");
	}
	@Test
	public void test1()
	{
		System.out.println("test case");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test case 2");
	}
}
