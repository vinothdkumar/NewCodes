import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPRac {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver", "C:/Users/VINOTH/OneDrive/Documents/chrome`driver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Vinoth");
		driver.findElement(By.name("inputPassword")).sendKeys("bhdcsbaj1");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Vinoth");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vinothdharmaraja@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876598765");
		driver.findElement(By.xpath("//div/button[2]")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		driver.close();		
		

	}

}
