package assignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class MultipleWindowHandle { //as like child window popup

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Start Selenium Practice")).click();
		
		String idOfMainPage = driver.getWindowHandle();
		System.out.println(idOfMainPage);
		
		Set<String> idOfAllPage = driver.getWindowHandles();
		System.out.println(idOfAllPage);
		
		ArrayList<String> al=new ArrayList<String>(idOfAllPage);
		
		 String NewidOfMainPage = al.get(0);
		 String idOfChildPage = al.get(1);
		 
		 driver.switchTo().window(idOfChildPage);
		
		driver.findElement(By.id("autocomplete")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		WebElement Selectbox = driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(Selectbox);
		s.selectByVisibleText("Option2");
		Thread.sleep(2000);

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(3);
		File dest=new File("D:\\javaselenium\\screenshot\\snapshot"+random+ ".png");
		FileHandler.copy(src, dest);
		
		driver.switchTo().window(NewidOfMainPage);
		String Text = driver.findElement(By.xpath("//h2[text()='Start Practicing Now']")).getText();
		System.out.println(Text);
		
	}

}
