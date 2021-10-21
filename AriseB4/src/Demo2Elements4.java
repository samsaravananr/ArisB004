import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Elements4 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB4\\Driver\\chromedriver.exe");
		WebDriver myD= new ChromeDriver();

		
		myD.get("https://www.google.com/");
		System.out.println("Title "+myD.getTitle());
		
		myD.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(3000);
		
		myD.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
		
		
		Thread.sleep(4000);
		
		
		
		myD.close();

	}

}

