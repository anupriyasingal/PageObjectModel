package com.qa.pageObjects;

import com.qa.Utility.Utility;

public class LoginPage extends Utility {
	public HomePage login(String username, String password) {
		sendData("id", "email", username);
		sendData("id" , "pass" , password);
		clickOnElm("xpath" , "//input[@value='Log In']");
		return new HomePage();
	}
}
