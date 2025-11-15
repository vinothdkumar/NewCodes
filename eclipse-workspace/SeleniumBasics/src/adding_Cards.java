import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adding_Cards {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/shop");

        String[] itemsNeeded = {"iphone X", "Samsung Note 8", "Blackberry"};
        addItems(driver, itemsNeeded);
        driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
        driver.findElement(By.cssSelector("button.btn.btn-success")).click();
        driver.findElement(By.id("country")).sendKeys("ind");
        Thread.sleep(8000);
        driver.findElement(By.xpath("//div//li/a[contains(text(),'India')]")).click();
        driver.findElement(By.id("checkbox2")).click();
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        System.out.println(driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText());
        
    }

    private static void addItems(WebDriver driver, String[] itemsNeeded) {
        List<WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));
        List<String> itemsList = Arrays.asList(itemsNeeded);

        for (int i = 0; i < products.size(); i++) {
            String productName = products.get(i).getText();
            if (itemsList.contains(productName)) {
                // Click the corresponding "Add" button
                driver.findElements(By.cssSelector("button.btn.btn-info")).get(i).click();
            }
        }
    }
}
