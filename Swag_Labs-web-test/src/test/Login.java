package test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		 
		//Launch web page
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver.exe");
	
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.saucedemo.com/v1/");
		 
		 try {
		 driver.findElement(By.name("user-name")).sendKeys("standard_user");
		 driver.findElement(By.name("password")).sendKeys("secret_sauce");
		 WebElement signbtn = driver.findElement(By.className("btn_action"));
		 signbtn.click();
		 
		 System.out.println("Login successfully!");
		 
		 }catch (Exception e) {
			System.out.println("Error:-"+e);
		}

	}

}
