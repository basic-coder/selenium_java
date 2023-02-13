package testNG;

import org.testng.annotations.*;

public class TestNgParameter {
	
	@Test()
	@Parameters({"i","j"})
	public void add(int a,int b) {
		System.out.println("addition : " + (a+b));
	}
	
	@Test()
	@Parameters({"i","j"})
	public void sub(int a,int b) {
		System.out.println("subtraction : " + (a-b));
	}
	
	@Test()
	@Parameters({"i","j"})
	public void mul(int a,int b) {
		System.out.println("multiplication : " + (a*b));
	}

}
