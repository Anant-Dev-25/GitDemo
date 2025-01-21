package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Test(groups= {"Smoke"})
	public void carLoanWeb()
	{
		System.out.println("Web app for CarLoan");
	}
	@Parameters({"URL"})
	@Test
	public void carLoanMobile(String urlName)
	{
		System.out.println("Mobile app for CarLoan");
		System.out.println(urlName);
	}
	@Parameters({"URL"})
	@Test
	public void carLoanAPI(String urlName)
	{
		System.out.println("API for CarLoan");
		System.out.println(urlName);
	}

}
