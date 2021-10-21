import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1_TitleVerification {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB4\\Driver\\msedgedriver.exe");
		
		WebDriver myD=new EdgeDriver();
		//WebDriver myD=new FireFoxDriver();
		myD.get("https://www.google.com");
		String vTitle=myD.getTitle();
		
		if(vTitle.equalsIgnoreCase(("google")))
		{
			System.out.println("PASS");
		}
		
		else
		{
			System.out.println("FAIL");
		}
		
		
		myD.close();
		
		
		
		
		// 1. Open google.com
		// 2. Get the Title
		// 3. if the Title contains google.com
		// 4. Then Test is PASS
		// 5. Else - Test is FAIL
		
		
		

	}

}
