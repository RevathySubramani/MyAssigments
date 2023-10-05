package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		//Login Information
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class, 'Submit')]")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Menu navigation and action
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Create Lead Information
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("TestLeaf1");
		driver.findElement(By.xpath("//td/input[@name='lastName']")).sendKeys("Account1");
		driver.findElement(By.xpath("//input[contains(@id,'firstNameLocal')]")).sendKeys("User1");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This user is created for automation department");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("account1@testleaf.com");
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select province = new Select(state);
		province.selectByVisibleText("Connecticut");
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		//Edit Lead and update
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is an important note section");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		//Getting page title
		System.out.println("Current page title :" + driver.getTitle());
		
		driver.close();
	}

}
