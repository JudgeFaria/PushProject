package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginTest {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {



		init();
		loginTest();
		tearDown(); 

		init();
		negloginTest();
		tearDown();

   }

	public static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Judge\\Selenium_eclipse\\crm\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://techfios.com/billing/?ng=admin/");
	}
	public static void loginTest() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}
	public static void negloginTest() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1234");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}
	public static void tearDown(){

		driver.close();
	}
}
