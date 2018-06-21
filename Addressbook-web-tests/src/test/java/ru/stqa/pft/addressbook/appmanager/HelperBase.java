package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class HelperBase {
	protected FirefoxDriver wd;

	public HelperBase(WebDriver wd) {
		this.wd = wd;
	}

	protected void click(By locator) {
		wd.findElement(locator).click();
	}

	protected void type(By locator, String text) {
		click(locator);
		wd.findElement(locator).clear();
		wd.findElement(locator).sendKeys(text);
	}
	public  boolean isAlertPresent() {
		try {
			wd.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	public void fillContactForm(ContactData contactData) {
	}

	public void submitContactCreation() {
	}
}
