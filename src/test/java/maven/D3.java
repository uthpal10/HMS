package maven;

import org.testng.annotations.Test;

public class D3 
{
	@Test(groups="Smoke")
	public void test4()
	{
		System.out.println("I am Test4");
	}
	
	@Test(groups="Regression")
	public void test5()
	{
		System.out.println("I am Test5");
	}
	
	@Test(groups="Smoke")
	public void test6()
	{
		System.out.println("I am Test");
	}
	
}
