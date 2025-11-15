import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
		driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys("IND");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li//div[contains(text(),'India')]")).click();
		driver.findElement(By.id("dropdown-class-example")).click();
		driver.findElement(By.xpath("//option[@value='option2']")).click();
		driver.findElement(By.id("checkBoxOption3")).click();
		driver.findElement(By.cssSelector("#openwindow")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> iter = window.iterator();
		String parentid = iter.next();
		String childid = iter.next();
		driver.switchTo().window(childid);
		String name = driver.findElement(By.xpath("//div[@class='cont']//span[contains(text(),'info@qaclickacademy.com')]")).getText();
		driver.close();
		driver.switchTo().window(parentid);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		driver.switchTo().alert().accept();  
		
		driver.findElement(By.id("opentab")).click();
		Set<String> tab = driver.getWindowHandles();  
		
		Iterator<String> iter2 = tab.iterator();
		String parentid2 = iter2.next();
		String childid2 = iter2.next();
		
		driver.switchTo().window(childid2);
		String name2= driver.findElement(By.cssSelector("div[class='section-title mt-50'] h2")).getText();
		driver.close();
		driver.switchTo().window(parentid2);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name2);
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
	}

}
