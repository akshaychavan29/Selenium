package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethod {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("https://www.onlinesbi.com/");  //get- to enter url in browser or to open an application.
		
		driver.manage().window().minimize();  //maximize/ minimize() - used to maximize/ minimize the browser

		driver.manage().window().maximize();  // cascaded methods(methods me methods)

	    driver.close(); //close: to close the current tab of the browser opened by Selenium tool.
		
		driver.quit(); //quit: to close the all the tabs present in browser opened by Selenium tool
		
		
	}

}
