package com.nest.ictak.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nest.ictak.common.BaseClass;
import com.nest.ictak.utilities.PageUtils;

public class Login extends BaseClass {
	
	public Login() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	//locate elements
	@FindBy(xpath="//input[@id='txtUsername' and @name='txtUsername']")
	private WebElement userNameField;
	
	@FindBy(id="txtPassword")
	private WebElement passwordField;
	
	@FindBy(id="btnSubmit")
	private WebElement submitButton;
	
	@FindBy(xpath="//div[@id='messages']//child::span[@id='lblMsg']")
	public WebElement invalidText;
	
	public void setCredentials(String UNameData, String pwdData)
	{
		PageUtils.sendElementData(userNameField,UNameData);
		PageUtils.sendElementData(passwordField, pwdData);
		PageUtils.actionPerform(submitButton);
	}

}
