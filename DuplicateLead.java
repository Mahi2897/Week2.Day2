package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
				//8	Click on Email
				driver.findElement(By.xpath("//span[text()='Email']")).click();
				//9	Enter Email
				driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
				//10	Click find leads button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				//11	Capture name of First Resulting lead
				 String leadno = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)")).getText();
				System.out.println(leadno);
				Thread.sleep(4000);
				//12	Click First Resulting lead
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
				//13	Click Duplicate Lead
				driver.findElement(By.xpath("//a[text()=\"Duplicate Lead\"]")).click();
				//14	Verify the title as 'Duplicate Lead'
				String title = driver.getTitle();
				System.out.println(title);
				//15	Click Create Lead
				driver.findElement(By.name("submitButton")).click();
				//16	Confirm the duplicated lead name is same as captured name
				String capturedname = driver.findElement(By.className("linktext")).getText();
				if(capturedname.equals("duplicatename"))
				{
					System.out.println(" not duplicate");
					
				}
				else
				{
					System.out.println("duplicate");
				}
				
				
				
				//17	Close the browser (Do not log out)
				driver.close();

	}

}
