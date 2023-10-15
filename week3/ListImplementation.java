package homeassignments.week3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListImplementation {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Search for bags
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags", Keys.ENTER);
		//Select Men checkbox 
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		//Wait for refresh and Select Fashion Bags
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		//Wait for refresh and get the product count
		Thread.sleep(3000);
		String totalProducts = driver.findElement(By.xpath("//div[@class='length']")).getText();
		String number = totalProducts.replaceAll("//D", "");
		System.out.println("Total Products: " + number);
		//Get the list of brand names
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='items']//following::div[@class='brand']"));
		//Get the list of product names
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='items']//following::div[@class='nameCls']"));
		
		//Print the brand names
		System.out.println("###Brand Names###");
		for (WebElement brandName : brands) {
			System.out.println(brandName.getText());
		}
		//Print the product names
		System.out.println("###Product Names###");
		for (WebElement productName : names) {
			System.out.println(productName.getText());
		}
		
		driver.close();
	}

}
