package seleniumAssignment2;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumAssignment2 {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		Thread.sleep(5000);
	     element.sendKeys("Cheese!");
	     element.submit();
	     Thread.sleep(5000);
	   

	        driver.quit();
	}
	
}
