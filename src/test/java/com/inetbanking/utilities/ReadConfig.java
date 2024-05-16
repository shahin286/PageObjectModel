package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File src = new File("./src/test/resources/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {

			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}

	public String getUserName() {
		String username = pro.getProperty("userID");
		return username;
	}

	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}

	public String getCusName() {
		String cusName = pro.getProperty("customerName");
		return cusName;
	}

	public String getCusDoB() {
		String cusDoB = pro.getProperty("dateOfBirth");
		return cusDoB;
	}

	public String getCusAddress() {
		String cusAddress = pro.getProperty("address");
		return cusAddress;
	}

	public String getCusCity() {
		String cusCity = pro.getProperty("city");
		return cusCity;
	}

	public String getCusState() {
		String cusState = pro.getProperty("state");
		return cusState;
	}

	public String getCusPin() {
		String cusPin = pro.getProperty("pin");
		return cusPin;
	}

	public String getCusMobileNumber() {
		String cusMobileNumber = pro.getProperty("mobileNumber");
		return cusMobileNumber;
	}

	public String getCusEmail() {
		String cusEmail = pro.getProperty("eMail");
		return cusEmail;
	}

	public String getCusPassword() {
		String cusPassword = pro.getProperty("cuPassword");
		return cusPassword;
	}

}
