package seleniumPractice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class WebDriverMethod {
	@Test
	public void lunchBrowser()
	{
System.setProperty("webdriver.chrome.driver","G:\\\\chromedriver_win32 (6)\\\\chromedriver-win64\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		System.out.println("Page Title:"+driver.getTitle());
			
		System.out.println("Page Title:"+driver.getTitle());
			
		System.out.println("Page Title:"+driver.getTitle());	
		System.out.println("Page Title:"+driver.getTitle());
			
		System.out.println("Page Title:"+driver.getTitle());
		
		System.out.println("Page Title:"+driver.getCurrentUrl());
		System.out.println("Page Title:"+driver.getCurrentUrl());
		System.out.println("Page Title:"+driver.getCurrentUrl());
		
	}

}
