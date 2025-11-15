import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2e_adding_basket {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String Username= driver.findElement(By.xpath("//b//i[contains(text(),'rahulshettyacademy')]")).getText();
		String Password= driver.findElement(By.xpath("//b//i[contains(text(),'learning')]")).getText();
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("usertype")).click();
		driver.findElement(By.xpath("//select[@class='form-control']//option[@value='teach']")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
