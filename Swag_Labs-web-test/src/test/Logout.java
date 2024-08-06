package test;

import java.time.Duration;

import org.checkerframework.checker.index.qual.LengthOf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.saucedemo.com/v1/");
		 
		 try {
		 driver.findElement(By.name("user-name")).sendKeys("standard_user");
		 driver.findElement(By.name("password")).sendKeys("secret_sauce");
		 WebElement signbtn = driver.findElement(By.className("btn_action"));
		 signbtn.click();
		 
		 System.out.println("Login successfully!");
		 
		 Thread.sleep(2000);
		 
		 WebElement menu =driver.findElement(By.className("bm-burger-button"));
		 menu.click();
		 
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
          WebElement logoutLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));
          
         
          logoutLink.click();
		 
		 }catch (Exception e) {
			System.out.println("Error:-"+e);
		}
		
		
		
	}

}
