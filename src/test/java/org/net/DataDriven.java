package org.net;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DataDriven extends BaseClass{
	public static void main(String[] args) throws InterruptedException, IOException {
		launchChrome();
		launchUrl("https://www.etsy.com");
		winMax();
		Thread.sleep(3000);
		printTitle();
		printCurrentTitle();
		PojoClass l = new PojoClass();
		WebElement txtsign = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']"));

		buttonClick(txtsign);
		Thread.sleep(3000);
		WebElement txtuser = driver.findElement(By.name("email"));
		passValue(txtuser,getData(2,2));
		Thread.sleep(3000);
		WebElement txtpass = driver.findElement(By.name("password"));
		passValue(txtpass,getData(2,3));
		Thread.sleep(3000);
		WebElement txtcon = driver.findElement(By.xpath("(//button[@type='submit'])[4]"));
		buttonClick(txtcon);
		
	}
}
