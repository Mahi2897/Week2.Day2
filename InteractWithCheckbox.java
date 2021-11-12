package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractWithCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leafground.com/home.html");
				driver.manage().window ().maximize();
				driver.findElement(By.xpath("//h5[text()='Checkbox']/parent::a")).click();
				driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
				driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
				boolean selected = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected();
				System.out.println(selected);
				List<WebElement> allchk = driver.findElements(By.xpath("//input[@type='checkbox']"));
				allchk.size();
				int size = allchk.size();
				   allchk.get(size-6).click();
				 List<WebElement> allchk1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
			   System.out.println(allchk1.size());
			   int size1 = allchk1.size();
			   allchk1.get(size1-1).click();
			   allchk1.get(size1-2).click();
			   allchk1.get(size1-3).click();
			   allchk1.get(size1-4).click();
			   allchk1.get(size1-5).click();;
			   
			   
				
				
				

	}

}
