package kiteBASE;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner implements ITestListener
{
	BaseClassNew2 b=new BaseClassNew2();
	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("TC execution is started "+result.getName(), true);
	}
	
	public void onTestFailure(ITestResult result) 
	{
		String TCID=result.getName();
		try {
			b.captureScreenShot( TCID);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("TC execution is failed "+result.getName(), true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC execution is skipped "+result.getName(), true);
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("TC execution is succesful "+result.getName(), true);
	}

}
