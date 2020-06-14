package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyClass {
	// Registration with all valid data

		public static void valid() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\compu malek\\Downloads\\task\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver.get("https://www.phptravels.net/register");
				driver.findElement(By.name("firstname")).sendKeys("Marina");
				driver.findElement(By.name("lastname")).sendKeys("Saad");
				driver.findElement(By.name("phone")).sendKeys("01284006531");
				driver.findElement(By.name("email")).sendKeys("marina.saad28@hotmail.com");
				driver.findElement(By.name("password")).sendKeys("1234@Test");
				driver.findElement(By.name("confirmpassword")).sendKeys("1234@Test");
				driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button")).submit();
				
			/*	Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div")).click();
				driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[1]")).click();
				
				driver.findElement(By.name("username")).sendKeys("marina.saad28@hotmail.com");
				driver.findElement(By.name("password")).sendKeys("1234@test");
				driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();*/
				/*
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div")).click();
				driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[2]")).click();
				driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div")).click();
				driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[1]")).click();
				
				driver.findElement(By.name("username")).sendKeys("marina.saad28@hotmail.com");
				driver.findElement(By.name("password")).sendKeys("1234@Test");
				driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();
*/
		 }
		
		//Registration with first and last name with start with small letter
		 public static void StartWithSmallLetterInFirstAndLastNamesTest() throws InterruptedException{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\compu malek\\Downloads\\task\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//System.out.println("Hello Google...");
				driver.get("https://www.phptravels.net/register");
				driver.findElement(By.name("firstname")).sendKeys("marina");
				driver.findElement(By.name("lastname")).sendKeys("saad");
				driver.findElement(By.name("phone")).sendKeys("01284006531");
				driver.findElement(By.name("email")).sendKeys("marina.saad22@hotmail.com");
				driver.findElement(By.name("password")).sendKeys("1234@test");
				driver.findElement(By.name("confirmpassword")).sendKeys("1234@test");
				driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button")).submit();
				
			
		 }
		 //registration with password with no letters
		 public static void nolettersInPassword() throws InterruptedException{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\compu malek\\Downloads\\task\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//System.out.println("Hello Google...");
				driver.get("https://www.phptravels.net/register");
				driver.findElement(By.name("firstname")).sendKeys("M");
				driver.findElement(By.name("lastname")).sendKeys("S");
				driver.findElement(By.name("phone")).sendKeys("01284006531");
				driver.findElement(By.name("email")).sendKeys("m.s1@hotmail.com");
				driver.findElement(By.name("password")).sendKeys("1234567");
				driver.findElement(By.name("confirmpassword")).sendKeys("1234567");
				driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button")).submit();
				
			 }
		 
		 //registration with password with no capital letters
		 public static void nocapitalLettersInPassword() throws InterruptedException{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\compu malek\\Downloads\\task\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//System.out.println("Hello Google...");
				driver.get("https://www.phptravels.net/register");
				driver.findElement(By.name("firstname")).sendKeys("M");
				driver.findElement(By.name("lastname")).sendKeys("S");
				driver.findElement(By.name("phone")).sendKeys("01284006531");
				driver.findElement(By.name("email")).sendKeys("m.s@hotmail.com");
				driver.findElement(By.name("password")).sendKeys("1234@test");
				driver.findElement(By.name("confirmpassword")).sendKeys("1234@test");
				driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button")).submit();
				
			 }
		 
		 //registration with not match between password and confirmed passowrd 
		 public static void NoMatchInPassword() throws InterruptedException{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\compu malek\\Downloads\\task\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//System.out.println("Hello Google...");
				driver.get("https://www.phptravels.net/register");
				driver.findElement(By.name("firstname")).sendKeys("m");
				driver.findElement(By.name("lastname")).sendKeys("s");
				driver.findElement(By.name("phone")).sendKeys("01284006531");
				driver.findElement(By.name("email")).sendKeys("m.s22@hotmail.com");
				driver.findElement(By.name("password")).sendKeys("1234@test");
				driver.findElement(By.name("confirmpassword")).sendKeys("1234test");
				driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button")).submit();
				
						 
		 }
			public static void main(String args[]) throws InterruptedException {

				//System.out.println("Hello Google...");
				// Registration without providing start with capital letter of First Name field
				valid();
				Thread.sleep(2000);
				StartWithSmallLetterInFirstAndLastNamesTest();
				nolettersInPassword();
				nocapitalLettersInPassword();
				NoMatchInPassword();
			}

	 
			
/*
    // Registration with all valid data
    @Test
    public void validRegistrationTest(){            

        By driver;
		WebElement companyName = driver.findElement((SearchContext) By.name("organization_name"));
        companyName.sendKeys("TestCompany");

        WebElement fullName = driver.findElement((SearchContext) By.name("name"));
        fullName.sendKeys("TestName");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("test6.lambdatest@gmail.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Test@12345");

        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("9876543210");

        WebElement termsOfServices = driver.findElement(By.id("terms_of_service"));
        termsOfServices.click();

        WebElement signUp = driver.findElement(By.xpath("//button[contains(@class,'btn sign-up-btn-2 btn-block')]"));
        signUp.click();

        String expectedURL = "https://accounts.lambdatest.com/email/verify";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);

        String expectedTitle = "Verify Your Email Address - LambdaTest";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);


    }*/
}
