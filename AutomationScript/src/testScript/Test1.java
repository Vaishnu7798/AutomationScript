package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		//It check the browser testing works fine or not
		
		WebDriver driver = new ChromeDriver();
		String baseurl = "https://facegenie-ams-school.web.app/";
		driver.get(baseurl);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.quit();
		
		
		WebDriver driver1 = new EdgeDriver();
		String baseurl2 = "https://facegenie-ams-school.web.app/";
		driver1.get(baseurl2);
		driver1.manage().deleteAllCookies();
		driver1.manage().window().maximize();
		Thread.sleep(1000);
		driver1.quit();
		
		
		
		WebDriver driver2 = new FirefoxDriver();
		String baseurl3 = "https://facegenie-ams-school.web.app/";
		driver2.get(baseurl3);
		driver2.manage().deleteAllCookies();
		driver2.manage().window().maximize();
		Thread.sleep(1000);
		driver2.quit();
		
		
		
	}

}
