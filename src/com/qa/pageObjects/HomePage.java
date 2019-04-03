package com.qa.pageObjects;

import com.qa.Utility.Utility;

public class HomePage extends Utility{
	public void Search(String text) {
		sendData("name", "q", text);
	}
	public void postStatus(String status) throws InterruptedException {
		Thread.sleep(10000);
		clickOnElm("xpath", "//textarea[@name='xhpc_message']");
		sendData("xpath", "//textarea[@name='xhpc_message']", status);
		//sendData("name", "xhpc_message", status);
		clickMethod("xpath", "//button[@type='submit' and @value='1']", 7);
		}
}
