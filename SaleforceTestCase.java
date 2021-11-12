package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SaleforceTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("UserFirstName")).sendKeys("Ragavi");
		driver.findElement(By.name("UserLastName")).sendKeys("sreenath");
		driver.findElement(By.name("UserEmail")).sendKeys("rags3898@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("cts");
		driver.findElement(By.name("UserPhone")).sendKeys("987654321");
		WebElement jobtitle = driver.findElement(By.name("UserTitle"));
		Select select=new Select(jobtitle);
		select.selectByIndex(5);
		WebElement employees = driver.findElement(By.name("CompanyEmployees"));
		Select select1=new Select(employees);
		select1.selectByIndex(2);
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select select2=new Select(country);
		select2.selectByIndex(1);
		WebElement state = driver.findElement(By.name("CompanyState"));
		Select select3=new Select(state);
		select3.selectByIndex(1);
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following::div")).click();
		driver.close();

	}

}
