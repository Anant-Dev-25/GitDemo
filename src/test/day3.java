package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@Test
	public void homeLoanWeb()
	{
		System.out.println("Web app for HomeLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobilehomeLoan()
	{
		System.out.println("Mobile app for HomeLoan");
	}
	@Parameters({"URL"})
	@Test
	public void homeLoanAPI(String urlName)
	{
		System.out.println("API for HomeLoan");
		System.out.println(urlName);
	}

}
