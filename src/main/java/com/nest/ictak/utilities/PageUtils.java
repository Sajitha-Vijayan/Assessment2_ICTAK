package com.nest.ictak.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtils {
	
	public static void sendElementData(WebElement eleLocated, String eleData) //Type Elements Data
	{
		eleLocated.clear();
		eleLocated.sendKeys(eleData);
	}
	public static void actionPerform(WebElement clickAction) //Click Elements
	{
		clickAction.click();
	}
	public static void mouseHover(WebElement elemHover, WebDriver driver) throws InterruptedException
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(elemHover).build().perform();
	}
	
	public static void selectValue(WebElement elemSelect, String selectValue)
	{
		Select select = new Select(elemSelect);
		select.selectByVisibleText(selectValue);
	}
	

}
