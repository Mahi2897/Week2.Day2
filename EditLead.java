package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//1.Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window ().maximize();
		//2	Enter the username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager"); ;
		//3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa"); 
		//4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click() ;
		//5	Click crm/sfa link
		driver.findElement(By.linkText( "CRM/SFA")).click();
		//6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		//7	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		// 8	Enter first name
		driver.findElement(By.xpath("(//input[@name='id'])[1]/following::input[@name='firstName']")).sendKeys("Mahi");
		//9	Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(4000);
		//10 Click on first resulting lead
		WebElement leadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		leadID.click();
	    //11 Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
		//12 Click Edit
		driver.findElement(By.linkText("Edit")).click();
		//13 Change the company name
		WebElement change = driver.findElement(By.id("updateLeadForm_companyName"));
		change.clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("wvo");
		//14 Click Update
		driver.findElement(By.name("submitButton")).click();
		//15 Confirm the changed name appears
		String text = driver.findElement(By.xpath("//span[text()='Company Name']")).getText();
		if(text.equals("WVO"));
		{
			System.out.println("confirmed");
		}
		
		//16 Close the browser (Do not log out)
		//
		driver.close();

	}

}
