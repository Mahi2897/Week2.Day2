package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window ().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); ;
		driver.findElement(By.id("password")).sendKeys("crmsfa"); 
		driver.findElement(By.className("decorativeSubmit")).click() ;
		driver.findElement(By.linkText( "CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//6. Click on Create Contact
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		   
		//7. Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Roja");
		  
		 // 8. Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("Raghu");
		 
		 // 9. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("pinky");
		  
		 // 10. Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("pops");
		  
		// 11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("IT");
		 
		 // 12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createContactForm_description")).sendKeys("NA");
		  
		  //13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.xpath("//span[text()='E-Mail Address']/following::input")).sendKeys("pinkypops@gmail.com");
		
		//14. Select State/Province as NewYork Using Visible Text
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select select=new Select(state);
		select.selectByVisibleText("New York");
		  
		 // 15. Click on Create Contact
		driver.findElement(By.name("submitButton")).click();
		  
		 // 16. Click on edit button
		driver.findElement(By.linkText("Edit")).click();
		 
		 // 17. Clear the Description Field using .clear
		driver.findElement(By.id("updateContactForm_description")).clear();
		 
		 // 18. Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("No Comments");
		 
		 // 19. Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		 
		 // 20. Get the Title of Resulting Page.
		String title = driver.getTitle();
		System.out.println("Title:"+title);
		

		 
	}

}
