package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithEditFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window ().maximize();
		driver.findElement(By.id("email")).sendKeys("pinkypops@testleaf.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("TestLeaf");
		System.out.println(driver.findElement(By.xpath("//input[@name='username']")).getAttribute("Value"));
		
		
		
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
boolean check = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
System.out.println(check);

	}

}
