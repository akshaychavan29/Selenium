package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("(//span[@class='pr-1'])[1]")).click();

		//we are focusing from main page to alert
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
	
		alt.accept();  //click on ok button
		
		//alt.dismiss();  //click on cancel button
		
		driver.findElement(By.xpath("(//span[@class='pr-1'])[1]")).click();
		
		
		
		
		
		
	}

}
