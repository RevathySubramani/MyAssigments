package selenium.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Driver Initialization 
		ChromeDriver driver = new ChromeDriver();
		
		//Launch the given URL using get
		driver.get("http://www.facebook.com");
		
		//Maximize the browser window
		driver.manage().window().maximize();
		
		//Locate the element using findElement and By is an abstract class
		//Locating by id
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		//Locating by name
		driver.findElement(By.name("login")).click();
		
		//Locating by partial link text
		driver.findElement(By.partialLinkText("Find")).click();
		
		//Printing the current page title using getTitle
		System.out.println(driver.getTitle());
		
		//closes all the automated browser windows
		driver.quit();
	}
	
}
