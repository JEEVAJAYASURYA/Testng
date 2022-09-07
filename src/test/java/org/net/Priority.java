package org.net;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Priority extends BaseClass {
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
	//valid username&invalid password
	@Test(priority= -5,invocationCount=2)
	private void tc1() throws IOException, InterruptedException {
		
		PojoClass l = new PojoClass();
		buttonClick(l.getTxtsign());
		Thread.sleep(3000);
		passValue(l.getTxtuser(),getData(2,2));
		Thread.sleep(3000);
		passValue(l.getTxtpass(),getData(2,1));
		Thread.sleep(3000);
		buttonClick(l.getTxtcon());
		Thread.sleep(3000);
		}
	//invalid username&validpass
	@Test(priority=2,enabled=false)
	private void tc2() throws IOException, InterruptedException {
		PojoClass l = new PojoClass();
		buttonClick(l.getTxtsign());
		Thread.sleep(3000);
		passValue(l.getTxtuser(),getData(2,1));
		Thread.sleep(3000);
		passValue(l.getTxtpass(),getData(2,3));
		Thread.sleep(3000);
		buttonClick(l.getTxtcon());
		Thread.sleep(3000);
	}
	//invalid username&invalid pass
	@Test(priority= -2)
	private void tc3() throws IOException, InterruptedException {
		PojoClass l = new PojoClass();
		buttonClick(l.getTxtsign());
		Thread.sleep(3000);
		passValue(l.getTxtuser(),getData(2,1));
		Thread.sleep(3000);
		passValue(l.getTxtpass(),getData(2,1));
		Thread.sleep(3000);
		buttonClick(l.getTxtcon());
		Thread.sleep(3000);


	}
	@Test(priority=2)
	private void tc4() throws IOException, InterruptedException {
		PojoClass l = new PojoClass();
		buttonClick(l.getTxtsign());
		Thread.sleep(3000);
		passValue(l.getTxtuser(),getData(2,2));
		Thread.sleep(3000);
		passValue(l.getTxtpass(),getData(2,3));
		Thread.sleep(3000);
		buttonClick(l.getTxtcon());
		Thread.sleep(3000);
	}
}
