import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsprac3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver","D:/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.className("inputtext")).sendKeys("9688798959");
		driver.findElement(By.name("pass")).sendKeys("Vinoth~99");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.findElement(By.className("_9ay7")).getText());
		driver.close();
	}

}
