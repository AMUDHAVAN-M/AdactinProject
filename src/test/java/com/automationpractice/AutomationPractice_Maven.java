package com.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Adactine_Project.Baseclass;

public class AutomationPractice_Maven extends Baseclass{

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+"\\chrome Driver 2\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get("http://automationpractice.com/index.php");
		
	
    WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));	
    //(signIn).click();
    click(signIn);
    
    
	WebElement username = driver.findElement(By.id("email"));
	//username.sendKeys("ilu@gmail.com");
	inputtext(username,"ilu@gmail.com");
	
	WebElement pass = driver.findElement(By.id("passwd"));
	//pass.sendKeys("14300");
	inputtext(pass,"14300");
	
	WebElement submit = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
	//submit.click();
	click(submit);
	
	driver.close();
	
	
	}	
	

}
	

