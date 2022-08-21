package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\javaselenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		// how to find no of rows
		List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		System.out.println(noOfRows.size());
		
		// how to find no of columns
		List<WebElement> noOfColumn = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
		System.out.println(noOfColumn.size());
		
		for(WebElement c:noOfColumn) 
		{
			System.out.print(c.getText()+"       ||       ");
		}
		System.out.println();	
	
//		for(WebElement r:noOfRows)
//		{
//			System.out.println(r.getText()+" || ");
//			System.out.println();
//		}
		System.out.println("=======================================");
		
		int r = driver.findElements(By.xpath("//table[@id='product']//tr")).size();
		System.out.println(r);
		
		int c = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th")).size();
		System.out.println(c);
		System.out.println("=======================================");

		for(int i=2;i<=r;i++) 
		{
			for(int j=1;j<=c;j++)
			{
				System.out.print(driver.findElement(By.xpath("//table[@id='product']//tr[" +i+ "]/td[" +j+ "]")).getText()+ " || ");
			}
			System.out.println();
		}
		
	}

}
