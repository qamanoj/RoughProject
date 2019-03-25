package com.corejava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RolesTable {

	public static WebDriver driver;

	public void WebTable(String operation)
	{
		try 
		{
			boolean flag=false;
			boolean status=false;

			WebElement table=driver.findElement(By.id("DGRoles"));

			List<WebElement> rows=table.findElements(By.tagName("tr"));
			//System.out.println(rows.size());

			String[] pagelinks=rows.get(rows.size()-1).getText().split(" ");

			for (int i = 1; i < pagelinks.length; i++) 
			{
				table=driver.findElement(By.id("DGRoles"));
				rows=table.findElements(By.tagName("tr"));
				for(WebElement r:rows)
				{
					List<WebElement> columns=r.findElements(By.tagName("td"));
					System.out.println(columns.size());
					for(WebElement c:columns)
					{
						if(c.getText().matches("112"))
						{
							if(operation.equalsIgnoreCase("edit"))
							{
								columns.get(columns.size()-2).findElement(By.tagName("a")).click();
							}
							else if(operation.equalsIgnoreCase("delete"))
							{
								columns.get(columns.size()-1).findElement(By.tagName("a")).click();	
							}
							else
							{
								System.out.println("operation not found");
							}
							flag=true;
							break;
						}
					}
					if (flag == true)
					{
						break;
					}
				}
				if (flag == true)
				{
					break;
				}
				try
				{
					if(pagelinks[i].contains("...") && status==true)
					{
						driver.findElement(By.xpath("//a[text()='...']")).click();
					}
					else
					{
						table.findElement(By.linkText(pagelinks[i])).click();
					}
				} 
				catch (Exception e) 
				{

					e.printStackTrace();
				}
				if(pagelinks[i].contains("..."))
				{
					status=true;
					WebTable(operation);
				}
			}
		} 
		catch (Exception e) 
		{	
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		driver=new FirefoxDriver();
		driver.get("http://srssprojects.in/home.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//img[@src='images/Roles_but.jpg']")).click();
		RolesTable w=new RolesTable();
		w.WebTable("edit");
		driver.findElement(By.id("btnupdate")).click();
	}

}
