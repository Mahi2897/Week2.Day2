package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmailTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        driver.findElement(By.name("firstname")).sendKeys("mahi");
        driver.findElement(By.name("lastname")).sendKeys("raja");
        driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following::input")).sendKeys("mahiraja@gmail.com");
        driver.findElement(By.xpath("(//div[text()='Re-enter email address']/following::input)[1]")).sendKeys("mahiraja@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("mahi*28");
        WebElement date = driver.findElement(By.id("day"));
        Select select= new Select(date);
        select.selectByVisibleText("28");
        WebElement month = driver.findElement(By.id("month"));
        Select select1=new Select(month);
        select1.selectByVisibleText("Sep");
        WebElement year = driver.findElement(By.id("year"));
        Select select2=new Select(year);
        select2.selectByVisibleText("1997");
        driver.findElement(By.xpath("//label[text()='Female']")).click();
      driver.findElement(By.name("websubmit")).click();
        
        
        
        
        
        
        
	}

}
