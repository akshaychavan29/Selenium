package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementStudy {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		//1.to take mouse actions, need to create object of Actions class and pass webDriver object as parameter
		Actions act=new Actions(driver);
		
		//2.find Eelement to be act
		WebElement ContactUs = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		
		//3.now take action add perform
		act.moveToElement(ContactUs).perform();
		
		WebElement aboutUs = driver.findElement(By.xpath("//a[text()='About Us']"));
		act.moveToElement(aboutUs).perform();
		
		//aboutUs.click();   // using WebElement method
		//act.click().perform();  //click method using action class
		
		WebElement radio = driver.findElement(By.xpath("//input[@value='Radio3']"));
		
		//act.moveToElement(radio).perform();
		//act.click().perform();
				
		//act.moveToElement(radio).click().build().perform();
				
		act.click(radio).perform();
		
		
	}

}
