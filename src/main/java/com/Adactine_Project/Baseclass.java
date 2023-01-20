package com.Adactine_Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {


	
	public static WebDriver driver;
	
	public static WebDriver browzer (String browzer) {
		if (browzer.equalsIgnoreCase("chrome")) {	
			
   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"chrome Driver 2\\chromedriver.exe");
		
   driver=new ChromeDriver();
		}		
		
		driver.manage().window().maximize();
		return driver;
	}
	

	public static void geturl(String url) {
		driver.get(url);
	}
	
	public static void click(WebElement element) {
      element.click();
      
	}
	
	public static void inputtext (WebElement element,String value) {
		element.sendKeys(value);
	
	}
	public static  void screenshot(WebElement element,String name) throws IOException {
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = name + ".png";
		File destination = new File("C:\\Users\\AMUDHAVAN\\eclipse-workspace\\Adactine_Project\\screenshot//image.png" + path);
       //org.apache.commons.io.FileUtils.copyFile(src, destination);
	 FileUtils.copyFile(src, destination);
	
}
	public static void dropdown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("ByVisibleText")) {
			s.selectByVisibleText(value);

		} else if (type.equalsIgnoreCase("byindex")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		}
		else if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);
		}

}


		  
}        
		 

	

