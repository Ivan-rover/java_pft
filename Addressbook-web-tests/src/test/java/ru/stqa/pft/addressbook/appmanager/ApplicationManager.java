package ru.stqa.pft.addressbook.appmanager;


//import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
	WebDriver wd;

	private SessionHelper sessionHelper;
	private NavigationHelper navigationHelper ;
	private GroupHelper groupHelper;
	private ContactHelper contactHelper;
	private String browser;

	public ApplicationManager(String browser)
	{
		this.browser = browser;
	}


	public void init() {
		//if (browser.equals(BrowserType.FIREFOX)){
		//wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("C://Users//i.arkhipov//AppData//Local//Mozilla Firefox//firefox.exe"));
		//new ChromeOptions().setBinary("C://Program Files (x86)//Google//Chrome//Application//chrome.exe");


		//}
		//else if (browser.equals(BrowserType.CHROME)) {
			wd = new ChromeDriver();
	//		new ChromeOptions().setBinary("C://Program Files (x86)//Google//Chrome//Application//chrome.exe");
		//}
		//else if (browser == BrowserType.IE){
		//	wd = new InternetExplorerDriver();

		//}
	//	wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("C://Users//i.arkhipov//AppData//Local//Mozilla Firefox//firefox.exe"));
		wd.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		wd.get("http://localhost/addressbook/");
		groupHelper = new GroupHelper(wd);
		navigationHelper = new NavigationHelper(wd);
		sessionHelper = new SessionHelper(wd);
		contactHelper = new ContactHelper(wd);
		sessionHelper.login("admin", "secret");
	}



	public void stop() {
		wd.quit();
	}

	public GroupHelper getGroupHelper() {
		return groupHelper;
	}
	public ContactHelper getContactHelper() {
		return contactHelper;
	}

	public NavigationHelper getNavigationHelper() {
		return navigationHelper;
	}


//	public void setContactHelper(ContactHelper contactHelper) {
//		this.contactHelper = contactHelper;
	}

