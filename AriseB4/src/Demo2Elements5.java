import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Elements5 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB4\\Driver\\chromedriver.exe");
		WebDriver myD= new ChromeDriver();

		
		myD.get("https://www.amazon.in/");
		System.out.println("Title "+myD.getTitle());
		
		myD.findElement(By.xpath("//div[@id='navbar']/div[5]/div[2]/div/div/a[1]")).click();
		
		Thread.sleep(4000);
		
		
		myD.close();

	}

}

