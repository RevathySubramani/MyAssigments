package homeassignments.week3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAssignment {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Login Information
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class, 'Submit')]")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click Contacts and Merge Contacts
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		//Click on the From Contact widget 
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		//Switch to the child window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		//Click on first column data in first row
		driver.findElement(By.xpath("//table[contains(@class,'row-table')]/tbody/tr[1]/td[1]//a")).click();
		//Switch to parent window from child window
		driver.switchTo().window(window.get(0));
		//Click on the To Contact widget 
		driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
		//Switch to the child window
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> window1 = new ArrayList<String>(windowHandles1);	
		driver.switchTo().window(window1.get(1));
		//Click on second column data in first row
		driver.findElement(By.xpath("(//table[contains(@class,'row-table')])[2]/tbody/tr[1]/td[1]//a")).click();
		//Switch to parent window from child window
		driver.switchTo().window(window1.get(0));
		//Click on Merge
		driver.findElement(By.linkText("Merge")).click();
		//Accept the alert
		driver.switchTo().alert().accept();
		//Verify page title
		if(driver.getTitle().equals("View Contact | opentaps CRM")) {
			System.out.println(driver.getTitle() + " matches the given title");
		}
		driver.close();
}
}
