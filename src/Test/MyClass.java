package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyClass {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\compu malek\\Downloads\\task\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.out.println("Hello Google...");
		driver.get("https://www.phptravels.net/register");
		driver.findElement(By.name("firstname")).sendKeys("Marina");
		driver.findElement(By.name("lastname")).sendKeys("Saad");
		driver.findElement(By.name("phone")).sendKeys("01284006531");
		driver.findElement(By.name("email")).sendKeys("marina.saad28@hotmail.com");
		driver.findElement(By.name("password")).sendKeys("1234@test");
		driver.findElement(By.name("confirmpassword")).sendKeys("1234@test");
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/button")).submit();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"//header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[3]/div/div/div/a[1]")).click();
		
		driver.findElement(By.name("username")).sendKeys("marina.saad28@hotmail.com");
		driver.findElement(By.name("password")).sendKeys("1234@test");
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();
		
		

	}

}
