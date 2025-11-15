package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class wrapup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		driver.findElement(By.id("userEmail")).sendKeys("vinothdharmaraja@gmail.com");
		Actions a = new Actions(driver);
		a.sendKeys(driver.findElement(By.id("userPassword")),"Vino@2001").build().perform();
		a.click(driver.findElement(By.cssSelector("input[type='submit']"))).build().perform();
		
		
		

	}

}
