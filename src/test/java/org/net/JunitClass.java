package org.net;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitClass extends BaseClass {
	@BeforeClass
	public static void browserLaunch() {
		launchChrome();
		
		winMax();
	}
	@Before
	public void startTime() {
		launchUrl("https://www.etsy.com");
		Date d = new Date();
		System.out.println(d);

	}
	@After
	public  void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
	//@AfterClass
		public static void browserClose() {
			closeUrl();
		}
		@Test
		//valid username&invalid password
			public void test1() throws IOException, InterruptedException {
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
		@Test
		//invalid username&validpass
		public void test2() throws IOException, InterruptedException {
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
		@Test
		//valid username&valid pass
		public void test3() throws IOException, InterruptedException {
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
