import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1_EdgeBrowser {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB4\\Driver\\msedgedriver.exe");
		
		WebDriver myD=new EdgeDriver();
		//WebDriver myD=new FireFoxDriver();
		myD.get("https://www.google.com");
		String vTitle=myD.getTitle();
		System.out.println("URL is "+myD.getCurrentUrl());
		System.out.println("Title is "+vTitle);
		myD.close();
		
		
		
		

	}

}
