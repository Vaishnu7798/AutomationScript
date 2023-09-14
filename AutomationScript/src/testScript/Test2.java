package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// Tab button functionality to check it
		
				WebDriver driver = new ChromeDriver();
				driver.get("https://facegenie-ams-school.web.app/");
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				Thread.sleep(2000);
				WebElement e = driver.findElement(By.xpath("//input[@id='email']"));
				e.click();
				e.sendKeys("testbams@gmail.com");
				e.sendKeys(Keys.TAB);
				
				WebElement p = driver.findElement(By.xpath("//input[@id='password']"));
				p.click();
				p.sendKeys("facegenie");
				p.sendKeys(Keys.TAB);
				p.sendKeys(Keys.ENTER);
		}

	}


