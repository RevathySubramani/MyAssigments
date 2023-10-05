package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Login Information
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class, 'Submit')]")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Menu navigation and action
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Enter phone number and search
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("1");
		//driver.findElement(By.name("phoneAreaCode")).sendKeys("123");
		//driver.findElement(By.name("phoneNumber")).sendKeys("1234567");
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		Thread.sleep(3000);
		
		//Get the first lead id and click
		
		String leadID = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText(); 
		System.out.println("The lead id going to be deleted is " +leadID);
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
		//Delete the lead
		driver.findElement(By.linkText("Delete")).click();
		
		//Search for the above deleted lead and confirm
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		
		Thread.sleep(2000);
		String message = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		if(message!=null) {
		System.out.println(message + " is displayed");
		}
		else System.out.println("Given Record is not deleted properly");
		
		driver.close();
	}

}
