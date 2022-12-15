package com.nest.ictak.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nest.ictak.common.BaseClass;
import com.nest.ictak.utilities.PageUtils;

public class AdminHome extends BaseClass{
	
	public AdminHome() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText = "Employee")
	private WebElement navbarEmployee;
	
	@FindBy(xpath="//a[@href='Employee.aspx' and text()='Add Employee']")
	private WebElement addEmployee;
	
	@FindBy(xpath="//a[@href='ListEmployee.aspx']")
	private WebElement listEmployee;
	
	
	public void	Employee() throws InterruptedException
	{
		PageUtils.mouseHover(navbarEmployee,driver);
	}
	
	public void selectAddEmployee()
	{
		PageUtils.actionPerform(addEmployee);
	}
	public void ListEmployees()
	{
		PageUtils.actionPerform(listEmployee);
	}
}
