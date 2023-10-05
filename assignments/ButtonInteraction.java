package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click the button and verify page title
		driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only mr-2 mb-2']")).click();
		String pageTitle = driver.getTitle();
		if(pageTitle.equalsIgnoreCase("dashboard")) {
			System.out.println(pageTitle + " - Title matches");
		}
		
		//Navigate back 
		driver.navigate().back();
		
		//Check button is disabled
		boolean enabled = driver.findElement(By.xpath("//span[text()='Disabled']/parent::button")).isEnabled();
		if(!enabled) {
		System.out.println("Button is disabled");
		}
		else { 
			System.out.println("Button is enabled");
		}
		
		//Get the location of the element
		Point location = driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-bookmark']/parent::button")).getLocation();
		System.out.println("Location of the element is " + location);
		
		//Get the background color of the element
		String cssValue = driver.findElement(By.xpath("//h5[contains(text(),'Find the Save button color')]/following-sibling::button")).getCssValue("color");
		System.out.println("Background color of the element is " + cssValue);
		
		//Get the height and width of the element
		Dimension size = driver.findElement(By.xpath("//span[text()='Submit']/parent::button[contains(@class,'ui-button-text-icon-right')]")).getSize();
		System.out.println("Size of the element is " + size);
		
		driver.close();
		
		}
}
