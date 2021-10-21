import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2Elements6 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB4\\Driver\\chromedriver.exe");
		WebDriver myD= new ChromeDriver();

		
		myD.get("https://www.amazon.in/");
		System.out.println("Title "+myD.getTitle());
		
		
		
		Select ProductSelect=new Select(myD.findElement(By.id("searchDropdownBox")));
		ProductSelect.selectByIndex(2);
		Thread.sleep(4000);
		ProductSelect.selectByValue("search-alias=mobile-apps");
		Thread.sleep(4000);
		ProductSelect.selectByVisibleText("Electronics");
		Thread.sleep(4000);
		myD.close();

	}

}

