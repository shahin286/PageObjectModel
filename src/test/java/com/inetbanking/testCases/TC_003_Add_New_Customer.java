package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerObjects;
import com.inetbanking.pageObjects.LoginPageObjects;

public class TC_003_Add_New_Customer extends BasePage{

	
	@Test
	public void addNewCustomer() throws IOException {
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.setUserName(userID);
		lpo.setPassword(password);
		lpo.clickSubmit();
		lpo.titleVerification();
		
		AddCustomerObjects aco = new AddCustomerObjects(driver);
		aco.addNewCustomer();
		aco.cusName(customerName);
		aco.cusGender();
		aco.cusDoB(dateOfBirth, dateOfBirth, dateOfBirth);
		aco.cusAddress(address);
		aco.cusCity(city);
		aco.cusState(state);
		aco.cusPin(pin);
		aco.cusMobileNumber(mobileNumber);
		aco.cusEmail(eMail);
		aco.cusPassword(cuPassword);
		aco.clickSubmitButton();
		
	}
	
}
