package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		//8	Click on Phone
        driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner']/span)[2]")).click();
        //9	Enter phone number
        driver.findElement(By.name("phoneNumber")).sendKeys("98");
//10	Click find leads button
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(2000);
//11	Capture lead ID of First Resulting lead
        String LeadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
        System.out.println(LeadId);
        Thread.sleep(2000);
//12	Click First Resulting lead
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
        //Thread.sleep(2000);
    //13	Click Delete
        driver.findElement(By.linkText("Delete")).click();
//14	Click Find leads
        driver.findElement(By.linkText("Find Leads")).click();
//15	Enter captured lead ID
         driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadId);
         
         //16	Click find leads button
        driver.findElement(By.linkText("Find Leads")).click();
        Thread.sleep(8000);
       
//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
        String verification = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
       
      if ( verification.equals("No Records to display"))
      {
        System.out.println("Recordfound");
        
      }
      else
      {
      
    	  System.out.println(" NoRecord found");
      
	}
    //18	Close the browser (Do not log out)
      driver.close();
}
}
        

	


