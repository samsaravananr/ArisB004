import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1_Selenium {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB4\\Driver\\chromedriver.exe");
		
		WebDriver myD=new ChromeDriver();
		//WebDriver myD=new FireFoxDriver();
		myD.get("https://www.google.com");
		String vTitle=myD.getTitle();
		System.out.println("URL is "+myD.getCurrentUrl());
		System.out.println("Title is "+vTitle);
		myD.close();
		
		
		
		

	}

}
