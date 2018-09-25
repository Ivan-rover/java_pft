package ru.stqa.pft.mantis.appmanager;


//import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
	WebDriver wd;


	private String browser;

	public ApplicationManager(String browser)
	{
		this.browser = browser;
	}


	public void init() {

			wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		wd.get("http://localhost/addressbook/");

		//sessionHelper.login("admin", "secret");
	}



	public void stop() {
		wd.quit();
	}






//	public void setContactHelper(ContactHelper contactHelper) {
//		this.contactHelper = contactHelper;
	}

