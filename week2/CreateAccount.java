package homeassignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//In login page, enter username, password and click on login button 
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on Accounts
		driver.findElement(By.linkText("Accounts")).click();
		
		//Click on Create Account
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter Account Name
		String accName = "TestLeafAccount5";
		driver.findElement(By.id("accountName")).sendKeys(accName);
		
		//Enter Description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		//Select industry
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select ind = new Select(industry);
		ind.selectByVisibleText("Computer Software");
		
		//Select Ownership
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select owner = new Select(ownership);
		owner.selectByVisibleText("S-Corporation");
		
		//Select Source
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select source1 = new Select(source);
		source1.selectByValue("LEAD_EMPLOYEE");
		
		//Select Marketing Campaign
		WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		Select mktCamp = new Select(marketing);
		mktCamp.selectByIndex(5);
		
		//Select State/province
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select province = new Select(state);
		province.selectByValue("TX");
		
		//Click on Create Account
		driver.findElement(By.className("smallSubmit")).click();
		
		//Get the Account name
		String verifyAccount = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		
		//Print the account name
		
		System.out.println("The account name created is " + verifyAccount);
		
		driver.close();

	}

}
