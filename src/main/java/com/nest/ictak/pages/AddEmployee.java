package com.nest.ictak.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nest.ictak.common.BaseClass;
import com.nest.ictak.utilities.PageUtils;

public class AddEmployee extends BaseClass
{
	public AddEmployee() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="ContentPlaceHolder1_txtName")
	private WebElement name;
	
	@FindBy(id="ContentPlaceHolder1_txtEmployeeId")
	private WebElement employee_id;
	
	@FindBy(id="ContentPlaceHolder1_txtPassword")
	private WebElement password;
	
	@FindBy(id="ContentPlaceHolder1_txtConfirmPassword")
	private WebElement confirm_password;
	
	@FindBy(id="ContentPlaceHolder1_txtEmail")
	private WebElement email;
	
	@FindBy(id="ContentPlaceHolder1_txtMobileNumber")
	private WebElement mobileNum;
	
	@FindBy(id="ContentPlaceHolder1_drpDesignation")
	private WebElement select_designation;
	
	@FindBy(id="ContentPlaceHolder1_drpEmployeeType")
	private WebElement select_employeeType;
	
	@FindBy(id="ContentPlaceHolder1_drpReportingTo")
	private WebElement select_reporting;
	
	@FindBy(id="ContentPlaceHolder1_ChkReportingStaff")
	private WebElement check_staff;
	
	@FindBy(id="ContentPlaceHolder1_drpGroup")
	private WebElement select_member;
	
	@FindBy(id="ContentPlaceHolder1_txtAddress")
	private WebElement address;
	
	@FindBy(id="ContentPlaceHolder1_btnSubmit")
	private WebElement submitButton;
	
	@FindBy(id="Reset")
	private WebElement resetButton;
	
	@FindBy(id="ContentPlaceHolder1_btnBack")
	private WebElement backButton;
	
	public void addEmployeeValid(String exname, String exempID, String expass, String expassconfirm, String exemail, String exnum, String exdesign, String exempType, String exreport, String exaddress, String exmember)
	{
		PageUtils.sendElementData(name,exname);
		PageUtils.sendElementData(employee_id, exempID);
		PageUtils.sendElementData(password,expass);
		PageUtils.sendElementData(confirm_password, expassconfirm);
		PageUtils.sendElementData(email, exemail);
		PageUtils.sendElementData(address, exaddress);
		PageUtils.sendElementData(mobileNum, exnum);
		PageUtils.selectValue(select_designation, exdesign);
		PageUtils.selectValue(select_employeeType, exempType);
		PageUtils.selectValue(select_reporting, exreport);
		PageUtils.selectValue(select_member, exmember);
		PageUtils.actionPerform(submitButton);
		PageUtils.actionPerform(backButton);
	}
	public void addEmployeeInvalid(String exname, String exempID, String expass, String expassconfirm, String exemail, String exnum, String exdesign, String exempType, String exreport, String exaddress, String exmember) throws InterruptedException
	{
		PageUtils.sendElementData(name,exname);
		PageUtils.sendElementData(employee_id, exempID);
		PageUtils.sendElementData(password,expass);
		PageUtils.sendElementData(confirm_password, expassconfirm);
		PageUtils.sendElementData(email, exemail);
		PageUtils.sendElementData(address, exaddress);
		PageUtils.sendElementData(mobileNum, exnum);
		PageUtils.selectValue(select_designation, exdesign);
		PageUtils.selectValue(select_employeeType, exempType);
		PageUtils.actionPerform(check_staff);
		PageUtils.selectValue(select_reporting, exreport);
		PageUtils.selectValue(select_member, exmember);
		PageUtils.actionPerform(submitButton);
		Thread.sleep(100);
		PageUtils.actionPerform(resetButton);
		PageUtils.actionPerform(backButton);
	}

}
