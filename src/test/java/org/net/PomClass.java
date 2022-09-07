package org.net;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PomClass extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		launchChrome();
		launchUrl("https://www.etsy.com");
		winMax();
		Thread.sleep(3000);
		printTitle();
		printCurrentTitle();
		PojoClass l = new PojoClass();

		buttonClick(l.getTxtsign());
		Thread.sleep(3000);
		passValue(l.getTxtuser(),getData(2,2));
		Thread.sleep(3000);
		passValue(l.getTxtpass(),getData(2,3));
		Thread.sleep(3000);
		buttonClick(l.getTxtcon());
		
	}
}
