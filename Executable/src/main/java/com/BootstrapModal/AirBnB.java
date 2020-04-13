package com.BootstrapModal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AirBnB {

	@Test
	public void useBnB() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.airbnb.com/");
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='_iglww7']"))).click().build().perform();
		//driver.findElement(By.xpath("//div[@class='_iglww7']")).click();
		
		driver.switchTo().frame("WebElement");
		
		WebElement webE = driver.findElement(By.xpath("//input[@id='phoneNumber']"));
		webE.sendKeys("2087571413");
		
		WebElement clickButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickButton.click();
	}
}
