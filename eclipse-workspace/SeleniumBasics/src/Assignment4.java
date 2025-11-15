import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> iter = windows.iterator();
		String ParentId=iter.next();
		String ChildId=iter.next();
		driver.switchTo().window(ChildId);
		System.out.println(driver.findElement(By.xpath("//div//h3")).getText());
		driver.switchTo().window(ParentId);
		System.out.println(driver.findElement(By.xpath("//div//h3")).getText());
		
		
		

	}

}
