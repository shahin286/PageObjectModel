package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerObjects {

	WebDriver ldriver;
	
	
	public AddCustomerObjects(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	@CacheLookup
	WebElement txCustomerName;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
	@CacheLookup
	WebElement rbGender;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"dob\"]")
	@CacheLookup
	WebElement tpDOB;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
	@CacheLookup
	WebElement txtAddress;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
	@CacheLookup
	WebElement txtPin;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")
	@CacheLookup
	WebElement txtMobileNumber;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(how = How.XPATH, using = "/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")
	@CacheLookup
	WebElement btnSubmit;
	
	
	
	public void addNewCustomer() {
		lnkAddNewCustomer.click();
	}
	
	public void cusName (String custName) {
		txCustomerName.sendKeys(custName);
	}
	
	
	public void cusGender () {
		rbGender.click();
	}

	public void cusDoB (String mm, String dd, String yyyy ) {
		tpDOB.sendKeys(mm);
		tpDOB.sendKeys(dd);
		tpDOB.sendKeys(yyyy);
	}


	public void cusAddress(String address) {
		txtAddress.sendKeys(address);
	}


	public void cusCity (String city) {
		txtCity.sendKeys(city);
	}


	public void cusState(String state) {
		txtState.sendKeys(state);
	}


	public void cusPin(String pin) {
		txtPin.sendKeys(pin);
	}


	public void cusMobileNumber(String moblNumber) {
	txtMobileNumber.sendKeys(moblNumber);
	}


	public void cusEmail(String email) {
	txtEmail.sendKeys(email);
	}


	public void cusPassword(String password) {
	txtPassword.sendKeys(password);
	}


	public void clickSubmitButton() {
	btnSubmit.click();
	}



	
}
