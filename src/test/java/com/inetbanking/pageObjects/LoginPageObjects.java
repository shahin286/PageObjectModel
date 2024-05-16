package com.inetbanking.pageObjects;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.inetbanking.testCases.BasePage;



public class LoginPageObjects {
	
	WebDriver ldriver;
	
	
	public LoginPageObjects (WebDriver rdriver) {
		
		ldriver=rdriver;
		
	PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy (name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy (name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void clickSubmit() {
		btnLogin.click();
	}
	
	public void clickLogout() {
		lnkLogout.click();
	}
	
	
	
	
	public void titleVerification() throws IOException {
		
		BasePage bp = new BasePage();
		
		if (ldriver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true, "Page Title Validation Passed");
		}
		else {
			bp.captureScreenShot(ldriver, "LoginPage");
			Assert.assertTrue(false, "Page Title Validation Failed");
			 
		}
		
	}
	
}
