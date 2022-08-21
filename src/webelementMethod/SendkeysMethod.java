package webelementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");

		//1. Sendkeys(): This method is use to enter value in the input/text field
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Welcome");
		Thread.sleep(2000);
		
		//2. Clear():This method is use to clear value in the text field.
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		
		//3. Click(): Click method is use to click on buttons, links also use to select radio buttons & checkboxes.
		driver.findElement(By.xpath("//input[@value='Radio4']")).click();
		
		//4. getText: This method is use to get text present in a webpage. Return type of getText function is String.
		String text = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
		System.out.println(text);
		
		WebElement Textbox = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		//we stored xpath of textbox
		
		Textbox.sendKeys("hiiiiiiiiii");
		Textbox.clear();
	}

}
