package homeassignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//PreConditions
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//Test Steps
		//Step 1 - Click Create New Account
		driver.findElement(By.linkText("Create new account")).click();
		
		
		//Step 2 - Enter First Name
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		//Step 3 - Enter Surname
		driver.findElement(By.name("lastname")).sendKeys("User");
		
		//Step 4 - Enter email or mobile
		driver.findElement(By.name("reg_email__")).sendKeys("selenium.user@gmail.com");
		
		//Step 6 - Enter password
		driver.findElement(By.id("password_step_input")).sendKeys("Se@sep2023");
		
		//Step 7 - Select date of birth
		//Step 7a - Select day
		WebElement day = driver.findElement(By.name("birthday_day"));
		
		Select daySelection = new Select(day);
		daySelection.selectByIndex(2);
		
		//Step 7b - Select month
		WebElement month = driver.findElement(By.name("birthday_month"));
		
		Select monthSelection = new Select(month);
		monthSelection.selectByValue("3");
		
		//Step 7c - Select year
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		Select yearSelection = new Select(year);
		yearSelection.selectByVisibleText("1988");
		
		//Step 8 - Select gender
		driver.findElement(By.name("sex")).click();
		
		driver.close();
		
	}

}

