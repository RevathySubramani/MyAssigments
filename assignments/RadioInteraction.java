package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Select favorite browser
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		
		//Click on a radio button and deselect again
		//Note:: isSelected will work only on input tags
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		WebElement radio = driver.findElement(By.xpath("//label[text()='Chennai']//preceding::input[contains(@id,'city2')]"));
		Boolean selectedStatus = radio.isSelected();
		System.out.println("Radio button select status is " + selectedStatus);
		
		driver.findElement(By.xpath("//label[text()='Chennai']")).click();
		Boolean unselectedStatus = radio.isSelected();
		System.out.println("Radio button select status is " + unselectedStatus);
		
		if(!radio.isSelected()) {
		System.out.println("Radio button is unselected as expected"); 
		} 
		else {
		System.out.println("Radio button is still selected"); 
		}
		  
		Boolean defaultValue = driver.findElement(By.xpath("//div[contains(@class,'ui-state-active')]//preceding::input[contains(@value,'Option')][1]")).isSelected();
		if(defaultValue) {
		String selectedValue = driver.findElement(By.xpath("//h5[text()='Find the default select radio button']/following::div[contains(@class,'ui-state-active')]/following::label")).getText();
		System.out.println("Selected Value is " + selectedValue);
		}
		
		//Check and select age group
		if(driver.findElement(By.xpath("//label[text()='21-40 Years']//preceding::input[contains(@value,'21')]")).isSelected()) { 
			System.out.println("Age group is already selected"); 
		} 
		else {
			driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();
			System.out.println("Age group is selected now"); 
		} 
		driver.close();
	}

}
