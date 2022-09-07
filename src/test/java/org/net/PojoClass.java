package org.net;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {
	public PojoClass () {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(xpath="//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']")
		
	private WebElement txtsign;
	@CacheLookup
	@FindAll({
		@FindBy(name="email"),
		@FindBy(id="join_neu_email_field")
		})
	private WebElement txtuser;
	@CacheLookup
	@FindAll({
		@FindBy(name="surya"),
		@FindBy(id="join_neu_password_field")
		})
	private WebElement txtpass;
	@CacheLookup
	@FindBy(name="submit_attempt")
	private WebElement txtcon;
	public WebElement getTxtsign() {
		return txtsign;
	}
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getTxtcon() {
		return txtcon;
	}
}
