package com.qa.testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pageObjects.HomePage;
import com.qa.pageObjects.LoginPage;

public class LoginTest extends LoginPage {
	@BeforeClass
	public void setUp() {
		launchBrowser("chrome", "Browsers//chromedriver.exe");
		launchApp("https://www.facebook.com/");
	}
	@Test
	public void loginScenario() throws InterruptedException {
		HomePage homeObj=login("anupriyasingal995@gmail.com", "testing123");
		//Thread.sleep(5000);
		//HomePage obj= new HomePage();
		homeObj.postStatus("anupriya");

	}

}
