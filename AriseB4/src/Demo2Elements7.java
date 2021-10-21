import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2Elements7 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB4\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com");
		System.out.println("title is : "+driver.getTitle());
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		
		//System.out.println(ids);
		
		String GmailWindowID=it.next();
		String HelpWindowID=it.next();
		
		//System.out.println("Gmail Window ID : "+GmailWindowID);
		//System.out.println("Hwlp Window ID : "+HelpWindowID);
		
		driver.switchTo().window(HelpWindowID);
		
		System.out.println("title is : "+driver.getTitle());
		
		//driver.close();
		driver.quit();
		
		

		
		}


	}



