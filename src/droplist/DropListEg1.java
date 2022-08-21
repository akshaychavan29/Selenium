package droplist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropListEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		//1. Identify list/select box to be handled and store it in reference variable

		WebElement SelectBox = driver.findElement(By.id("dropdown-class-example"));
		
		//2. Create an object of Select class which will accept WebElement as argument
		Select s=new Select(SelectBox);
		
		//3. By using one of the select class methods we can select values form list box like
		// 1. selectByVisibleText: selectByVisibleText(String arg0)
		// 2. selectByIndex: selectByIndex(int arg0)
		// 3. selectByValue: selectByValue(String arg0)
		
		// 2. selectByIndex: selectByIndex(int arg0)
		s.selectByIndex(2);
		Thread.sleep(1000);

		// 3. selectByValue: selectByValue(String arg0)
		s.selectByValue("option3");
		Thread.sleep(1000);

		// 1. selectByVisibleText: selectByVisibleText(String arg0)
		s.selectByVisibleText("Option1");
	}

}
