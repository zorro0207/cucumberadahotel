package org.base;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LibGlobal {
	
	public static WebDriver driver;
		
		
		public  void  browserLaunch() throws IOException {
			
			System.setProperty("webdriver.chrome.driver","E:\\workspace\\DataTable\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("browser launched");
				
		screenshot();
			
			
			
			}
		public  void loadUrl(String value) throws IOException {
			try {
	       driver.get(value);
	       System.out.println("url loaded successfully");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("url not loaded");
			}
			screenshot();
			
		}
		public  void windowmax() throws IOException {
			try
			{
				driver.manage().window().maximize();
				System.out.println("window maxmize done");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("window didnt maximize");
			}
	screenshot();
		}
		public String getAttribute(WebElement ele, String value)  {
			
			
				String attribute = ele.getAttribute(value);
				System.out.println("printed attribute value"+attribute);
			
			
	return attribute;
			
		}
		
		public  void fill(WebElement ele, String value) {
			
			try
			{
				ele.sendKeys(value);
				System.out.println("value passed using sendkeys");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("value not passed");
			}

			
		}	
			
			
			
	public void click(WebElement ele)  {
			
			try
			{
				ele.click();
				System.out.println("click success");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("click fail");
				
			}

		}		
			


	public  void selectByVisibletext(WebElement ele, String name) throws IOException{
		new Select(ele).selectByVisibleText(name);
		screenshot();
		
	}	


	public  void selectByValue(WebElement ele, String name) throws IOException{
		new Select(ele).selectByValue(name);
		
		screenshot();
		
	}	

	public String randomDate() {
		return new SimpleDateFormat("EEE_MMM_dd_yyyy_hhmmsss").format(new Date());
		
		

	}
			
	public void screenshot() throws IOException {
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		File d = new File("E:\\workspace\\DataTable\\screenshot\\"+randomDate()+".png");
		
	     FileUtils.copyFile(s, d);
	     
		
		
		

			}		
			
			
			
			
		
				
			
			
			
			
			
			
			
			
			
			
			
			
			

		
		
		

	}


