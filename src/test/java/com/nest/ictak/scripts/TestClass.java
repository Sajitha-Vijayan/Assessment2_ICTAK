package com.nest.ictak.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nest.ictak.common.BaseClass;
import com.nest.ictak.constants.AutomationConstants;
import com.nest.ictak.pages.AddEmployee;
import com.nest.ictak.pages.AdminHome;
import com.nest.ictak.pages.Login;
import com.nest.ictak.utilities.ExcelUtils;

public class TestClass extends BaseClass{

	public TestClass() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	
	}
	Login loginobj;
	AdminHome adminobj;
	AddEmployee addempobj;
	
	@Test(priority=1)
	void caseLoginInvalid() throws IOException, InterruptedException
	{
		loginobj = new Login();
		String InvaliduserName= ExcelUtils.readExcelData(1, 0);
		String Invalidassword = ExcelUtils.readExcelData(1, 1);
		Thread.sleep(1000);
		loginobj.setCredentials(InvaliduserName, Invalidassword);
		String invalidText = loginobj.invalidText.getText();
		Assert.assertEquals(AutomationConstants.invalidText,invalidText);
	}
	
	@Test(priority=2)
	void caseLoginValid() throws IOException, InterruptedException
	{
		loginobj = new Login();
		String exUsername = ExcelUtils.readExcelData(0, 0);
		String exPassword = ExcelUtils.readExcelData(0, 1);
		Thread.sleep(1000);
		loginobj.setCredentials(exUsername, exPassword);
		Assert.assertEquals(AutomationConstants.expUserName, exUsername);
		Assert.assertEquals(AutomationConstants.expPassword, exPassword);
		
		String expURL = getDriver().getCurrentUrl();
		Assert.assertEquals(AutomationConstants.expAdminHome, expURL);//Testing whether login to expected url or not / login successful or not
	}
	@Test(priority=3)
	void adminHome() throws IOException, InterruptedException
	{
		adminobj =  new AdminHome();
		Thread.sleep(1000);
		adminobj.Employee();
	}
	@Test(priority=4)
	void selectAddEmployee() throws IOException, InterruptedException
	{
		adminobj =  new AdminHome();
		Thread.sleep(1000);
		adminobj.selectAddEmployee();
	}
	@Test(priority=6)
	void addEmployeeValid() throws IOException, InterruptedException
	{
		addempobj =  new AddEmployee();
		String exname = ExcelUtils.readExcelData(3, 0);
		String exempID = ExcelUtils.readExcelData(4, 0);
		String expass = ExcelUtils.readExcelData(5, 0);
		String expassconfirm = ExcelUtils.readExcelData(6, 0);
		String exemail = ExcelUtils.readExcelData(7, 0);
		String exnum = ExcelUtils.readExcelData(8, 0);
		String exdesign = ExcelUtils.readExcelData(9, 0);
		String exempType = ExcelUtils.readExcelData(10, 0);
		String exreport = ExcelUtils.readExcelData(11, 0);
		String exaddress = ExcelUtils.readExcelData(12, 0);
		String exmember = ExcelUtils.readExcelData(13, 0);
		Thread.sleep(3000);
		addempobj.addEmployeeValid(exname,exempID,expass,expassconfirm,exemail,exnum,exdesign,exempType,exreport,exaddress,exmember);
		Assert.assertEquals(AutomationConstants.expName,exname);
		Assert.assertEquals(AutomationConstants.expEmployee_id,exempID);
		Assert.assertEquals(AutomationConstants.expAddPassword,expass);
		Assert.assertEquals(AutomationConstants.expconfirmPass,expassconfirm);
		Assert.assertEquals(AutomationConstants.expEmail, exemail);
		Assert.assertEquals(AutomationConstants.expMobNum,exnum);
		Assert.assertEquals(AutomationConstants.expDesignation,exdesign);
		Assert.assertEquals(AutomationConstants.expEmployeeType,exempType);
		Assert.assertEquals(AutomationConstants.expReporting,exreport);
		Assert.assertEquals(AutomationConstants.expAddress,exaddress);
		Assert.assertEquals(AutomationConstants.expMember,exmember);
		
	}
	@Test(priority=5)
	void addEmployeeInValid() throws IOException, InterruptedException
	{
		addempobj =  new AddEmployee();
		String exname = ExcelUtils.readExcelData(15, 0);
		String exempID = ExcelUtils.readExcelData(16, 0);
		String expass = ExcelUtils.readExcelData(17, 0);
		String expassconfirm = ExcelUtils.readExcelData(18, 0);
		String exemail = ExcelUtils.readExcelData(19, 0);
		String exnum = ExcelUtils.readExcelData(20, 0);
		String exdesign = ExcelUtils.readExcelData(21, 0);
		String exempType = ExcelUtils.readExcelData(22, 0);
		String exreport = ExcelUtils.readExcelData(23, 0);
		String exaddress = ExcelUtils.readExcelData(24, 0);
		String exmember = ExcelUtils.readExcelData(25, 0);
		Thread.sleep(3000);
		addempobj.addEmployeeValid(exname,exempID,expass,expassconfirm,exemail,exnum,exdesign,exempType,exreport,exaddress,exmember);
		Assert.assertEquals(AutomationConstants.expName,exname);
		Assert.assertEquals(AutomationConstants.expEmployee_id,exempID);
		Assert.assertEquals(AutomationConstants.expAddPassword,expass);
		Assert.assertEquals(AutomationConstants.expconfirmPass,expassconfirm);
		Assert.assertEquals(AutomationConstants.expEmail, exemail);
		Assert.assertEquals(AutomationConstants.expMobNum,exnum);
		Assert.assertEquals(AutomationConstants.expDesignation,exdesign);
		Assert.assertEquals(AutomationConstants.expEmployeeType,exempType);
		Assert.assertEquals(AutomationConstants.expReporting,exreport);
		Assert.assertEquals(AutomationConstants.expAddress,exaddress);
		Assert.assertEquals(AutomationConstants.expMember,exmember);
		
	}
	
	@Test(priority=7)
	void Listmployee() throws IOException, InterruptedException
	{

		adminobj =  new AdminHome();
		Thread.sleep(1000);
		adminobj.Employee();
		Thread.sleep(1000);
		adminobj.ListEmployees();
	}
	
}
