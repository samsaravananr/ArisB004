import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Elements3 {

	public static void main(String[] args) throws InterruptedException 
	{
		//If it is firefox - webdriver.gecko.driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB4\\Driver\\chromedriver.exe");
		WebDriver myD= new ChromeDriver();

		//1. OPEN LinkedIN APP
		myD.get("https://www.linkedin.com/");
		System.out.println("Title "+myD.getTitle());
		
		//2. CLICK ON SIGN IN
		myD.findElement(By.className("nav__button-secondary")).click();
		System.out.println("Title "+myD.getTitle());
		
		//3. ENTER Username
		myD.findElement(By.id("username")).sendKeys("samsaravananr");
		
		
		//4. ENTER Password
		myD.findElement(By.name("session_password")).sendKeys("1234566");
		
		
		//5. CLICK Signin
	
		//1. myD.findElement(By.xpath("//button[@aria-label='Sign in']")).click();
		//2. myD.findElement(By.xpath("//*[@aria-label='Sign in']")).click();
		//3. myD.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
		//4. myD.findElement(By.xpath("//button[@type='submit' and @aria-label='Sign in']")).click();
		//5. myD.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		
		//Capture Error Message and Print
				String vError=myD.findElement(By.id("error-for-username")).getText();
				System.out.println("Error Message is :"+vError);
		
		
		Thread.sleep(4000);
		
		
		//6. CLOSE APP
		myD.close();

	}

}

