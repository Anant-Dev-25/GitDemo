package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void Demo()
	{
		System.out.println("Hello.");
	}
	@Parameters({"URL"})
	@Test(groups= {"Smoke"})
	public void SecondTest(String uName)
	{
		System.out.println("Bye.");
		System.out.println(uName);
	}

}
