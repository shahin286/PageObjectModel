package com.inetbanking.testCases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.LoginPageObjects;

public class TC_001_Verify_LoginPage extends BasePage {

	@Test
	public void LoginPage() throws IOException {

		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.setUserName(userID);
		log.info("Entering the UserName");
		lpo.setPassword(password);
		log.info("Entering the Password");
		lpo.clickSubmit();
		lpo.titleVerification();

	}

}
