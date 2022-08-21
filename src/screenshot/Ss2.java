package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.opentelemetry.semconv.trace.attributes.SemanticAttributes.FaasTriggerValues;
import net.bytebuddy.utility.RandomString;

public class Ss2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		 
		//driver.get("https://vctcpune.com/selenium/practice.html");
		driver.get("https://www.w3schools.com/");

		Thread.sleep(2000);
				
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random=RandomString.make(3);
		//System.out.println(random);
		
		File destination=new File("D:\\javaselenium\\screenshot\\snapshot"+random+ ".png");
		
		FileHandler.copy(source, destination);
		
	}

}
