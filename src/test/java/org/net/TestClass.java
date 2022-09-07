package org.net;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass extends BaseClass{
	@BeforeClass
	private void open() {
		launchChrome();
		winMax();
	}
	@BeforeMethod
	private void star() {
		
		launchUrl("https://www.etsy.com");
		Date d = new Date();
		System.out.println(d);
		
	}
	//@AfterClass
	private void close() {
		closeUrl();

	}
	@AfterMethod
	private void end() {
		System.out.println(new Date());

	}
	@Parameters({"surya","queen"})
	//@Test
	private void tc1(String s1,String s2) throws IOException, InterruptedException {
		
		PojoClass l = new PojoClass();
		buttonClick(l.getTxtsign());
		Thread.sleep(3000);

		passValue(l.getTxtuser(),s1);
		Thread.sleep(3000);
		passValue(l.getTxtpass(),s2);
		Thread.sleep(3000);
		buttonClick(l.getTxtcon());
		Thread.sleep(3000);
		}
	//@Parameters({"cricket","fruits"})
	//@Test
	private void tc2(@Optional("suryamoorthy1410@gmail.com")String s1,@Optional("Surya@12345")String s2) throws IOException, InterruptedException {
		PojoClass l = new PojoClass();
		buttonClick(l.getTxtsign());
		passValue(l.getTxtuser(),getData(2,2));
		Thread.sleep(3000);
		passValue(l.getTxtpass(),getData(2,3));
		Thread.sleep(3000);
		buttonClick(l.getTxtcon());
		Thread.sleep(3000);
	}
	@Test(dataProvider="login")

	private void tc3(String s1,String s2) throws IOException, InterruptedException {
		PojoClass l = new PojoClass();
		buttonClick(l.getTxtsign());
		Thread.sleep(3000);
		passValue(l.getTxtuser(),s1);
		Thread.sleep(3000);
		passValue(l.getTxtpass(),s2);
		Thread.sleep(3000);
		buttonClick(l.getTxtcon());
		Thread.sleep(3000);


	}
	@DataProvider(name="login")
	private Object[][] greens() {
		return new Object[][] {
			{"surya","jai"},
			{"jai","jp"},
			{"manoj","vicky"},
			{"priya","moorthy"}

	};
}
}
