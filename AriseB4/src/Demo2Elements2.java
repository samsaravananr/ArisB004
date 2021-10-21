import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Elements2 {

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
		//myD.findElement(By.className("btn__primary--large from__button--floating")).click();
		myD.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
		
		//Capture Error Message and Print
		String vError=myD.findElement(By.id("error-for-username")).getText();
		System.out.println("Error Message is :"+vError);
		
		//6. CLICK Forgot Password
		myD.findElement(By.partialLinkText("Forgot")).click();
		System.out.println("Title "+myD.getTitle());
		
		//7. CLICK JOIN NOW
		myD.findElement(By.linkText("Join now")).click();
		System.out.println("Title "+myD.getTitle());
		
		//WAIT for 5 Seconds
		Thread.sleep(5000);
		
		//COUNT the Total Number of Links in the Signup Page
		int vSize=myD.findElements(By.tagName("a")).size();
		System.out.println("Total Links : "+vSize);
		
		
		
		//6. CLOSE APP
		myD.close();

	}

}

