import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2Elements10 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB4\\Driver\\chromedriver.exe");
		WebDriver myD= new ChromeDriver();
		myD.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		myD.manage().window().maximize();
		
		myD.get("https://www.google.com/");
		System.out.println("Title "+myD.getTitle());
		
		
		
		WebDriverWait wait=new WebDriverWait(myD, 20);
		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name("q")));
		myD.findElement(By.name("q")).sendKeys("Selenium");
		
		
		
		
		
		myD.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
		
		
		
		
		
		
		myD.close();

	}

}

