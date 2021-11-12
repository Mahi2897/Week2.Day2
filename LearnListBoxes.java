package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnListBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/home.html");
		driver.manage().window ().maximize();
		driver.findElement(By.xpath("//h5[text()='Drop down']")).click();
		WebElement box1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select select=new Select(box1);
		select.selectByIndex(1);
		
		WebElement box2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select select1=new Select(box2);
		select1.selectByVisibleText("Appium");
		
		WebElement box3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select select2=new Select(box3);
		select2.selectByValue("3");
		driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Loadrunner");
	driver.findElement(By.xpath("//option[@selected='selected']")).sendKeys("Loadrunner");
	
	}

}
