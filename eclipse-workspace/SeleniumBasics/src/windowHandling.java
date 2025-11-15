import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();
		Set<String> window= driver.getWindowHandles();
		Iterator<String> iter = window.iterator();
		String parentId = iter.next();
		String childId = iter.next();
		driver.switchTo().window(childId);
		String UserName = driver.findElement(By.cssSelector(".im-para.red")).getText();
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(UserName);
		
		
	}

}
