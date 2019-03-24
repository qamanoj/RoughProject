package com.corejava;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpiceJet {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com");
		String dipartue = "//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']";
		driver.findElement(By.xpath(dipartue)).click();
		String diparturetable = "//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[*]/li[*]";
		List<WebElement> wb = driver.findElements(By.xpath(diparturetable));
		System.out.println(wb.size());
		
		for(int i=0;i<=wb.size()-1;i++)
		{
			String expdata=wb.get(i).getText();
			System.out.println(expdata);
			if(expdata.contains("Goa"))
			{
				wb.get(i).click();
			}
		}
	}
}
