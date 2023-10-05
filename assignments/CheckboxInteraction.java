package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click basic checkbox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		//Click notification checkbox
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
		//Verify the message
		String message = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if(message.equalsIgnoreCase("Checked")) {
			System.out.println("Notification checkbox is checked");
		}
		else { 
			System.out.println("Issue in checking notification checkbox"); 
		}
		Thread.sleep(7000);
		//Click Language
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Javascript']")).click();
		
		//Click Tri-state checbox and check it is selected
		WebElement triState = driver.findElement(By.xpath("//div[contains(@id,'TriState')]/div[contains(@class,'ui-chkbox-box')]"));
		triState.click();
		triState.isSelected();
		
		//Toggle and verify message
		driver.findElement(By.xpath("//div[contains(@class,'toggleswitch')]")).click();
		Thread.sleep(2000);
		
		String toggleSelection = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		if(toggleSelection.equalsIgnoreCase("Checked")) {
			System.out.println("Toggle switch is on");
		}
		else { 
			System.out.println("Issue in toggle switch"); 
		}
		
		Thread.sleep(7000);
		//Verify CB disabled
		boolean cbState = driver.findElement(By.xpath("//span[text()='Disabled']/preceding::input[@aria-label='Disabled']")).isEnabled();
		if(!cbState) {
			System.out.println("Checbox is disabled");
		}
		else {
			System.out.println("Checkbox is enabled");
		}
		
		//Select multiple options
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Miami']/label")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Amsterdam']/label")).click();
		
		driver.close();
	
	}

}
