import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class DrpdownCheckboxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.className("paxinfo")).click();
		for(int i=0;i<4;i++) {
			driver.findElement(By.cssSelector("div span[id='hrefIncAdt']")).click();
		}
		for(int i=0;i<2;i++) {
			driver.findElement(By.id("hrefIncChd")).click();
		}
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		driver.findElement(By.cssSelector("select[id*='DropDownListCurrency']")).click();
		driver.findElement(By.xpath("//option[@value='AED']")).click();
		
	}

}
