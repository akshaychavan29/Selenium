package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethod1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
//		Thread.sleep(3000);
//		
//		navigate: this method is use to open an application, move forward, backward & refresh the webpage.
//		
//		driver.navigate().to("https://www.youtube.com/");
//		Thread.sleep(3000);
//		
//		driver.navigate().back();
//		Thread.sleep(3000);
//
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		
//		driver.navigate().refresh();
//		Thread.sleep(3000);
		
		//getTitle: this method is use to get title of a webpage. return type of getTitle method is String.
		String Title = driver.getTitle(); //driver.getTitle() is stored in tital variable
		System.out.println(Title);
		
		//System.out.println(driver.getTitle()); //we can write like this also
		
		//getCurrentURL: this method is use to get URL of a webpage. return type of getCurrentURL method is String
		String url = driver.getCurrentUrl(); //driver.getCurrentUrl() is stored in url variable
		System.out.println(url);
		
		//System.out.println(driver.getCurrentUrl());  //we can write like this also

	}

}
