package ElementNoClickable;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NotClickableTest {

	WebDriver driver;
	
	//Comment2: run test below
	//That is all
	
	@Test
	public void runTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		Reporter.log("Enter website");
		System.out.println("Website launched");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		WebElement web = driver.findElement(By.xpath("//input[@id='persistent']"));
		action.moveToElement(web).click().build().perform();
		Assert.assertTrue(web.isSelected(), "This Test Case passed");

		System.out.println("Action clicked");
		//driver.findElement(By.xpath("//input[@id='persistent']")).click();
		
		driver.quit();;
		//webLink.click();
	}
//	@FindBy(how =How.ID, using = "//input[@id='persistent']")
//	WebElement webLink;
}
