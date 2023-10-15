package homeassignments.week3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on first product
		driver.findElement(By.xpath("//div[@class='product-content']//a[contains(text(),'FIT X SMART WATCH')]")).click();
		//Enter pin code in product page
		driver.findElement(By.id("wk_zipcode")).sendKeys("600073");
		//Click on Check pin code
		driver.findElement(By.xpath("//input[@value='Check']")).click();
		//Click on Add to cart
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		//Wait for the popup to disappear and click on view cart
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='View Cart']")).click();
		//Click on checkout without agreeing to the conditions
		driver.findElement(By.id("checkout")).click();
		//Accept the alert 
		driver.switchTo().alert().accept();
		//Get the title of the page
		System.out.println(driver.getTitle());
		driver.close();
	}

}
