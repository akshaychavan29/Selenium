package setSizeSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/#loggedout");
		Thread.sleep(500);
		
		//to set size we need to create object of Dimension class and pass width and height as parameters 
		Dimension d=new Dimension(500, 500);
		
		//call setSize method which will ask you object of Dimension class
		driver.manage().window().setSize(d);
		
		
		
		
		
		
		
	}

}
