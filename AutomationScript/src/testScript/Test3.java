package testScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
    	//System.setProperty("webdriver.chrome.driver","C:\\\\Program Files (x86)\\\\Google\\\\Chrome\\\\Application\\\\chrome.exe");
		WebDriver driver1 = new ChromeDriver();
        driver1.get("https://facegenie-ams-school.web.app/");
        driver1.findElement(By.id("//*[@id=\\\"root\\\"]/div/div[2]/div/div/div[2]")).click();
        Alert alert = driver1.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);
        alert.accept();
        driver1.quit();
    }
}

	


