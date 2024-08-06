package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		 try {
			 driver.findElement(By.name("user-name")).sendKeys("standard_user");
			 driver.findElement(By.name("password")).sendKeys("secret_sauce");
			 WebElement signbtn = driver.findElement(By.className("btn_action"));
			 signbtn.click();
			 
			 System.out.println("Login successfully!");
			 
			 
			 //ADD TO CART ITEMS
			 
			 List<WebElement> addToCartButtons = driver.findElements(By.className("btn_primary"));
		        
		        // Click each "ADD TO CART" button
		        for (WebElement button : addToCartButtons) {
		            button.click();
		        }
		        
		        WebElement checkpage =driver.findElement(By.id("shopping_cart_container"));
		        checkpage.click();
		        
		        Thread.sleep(1500);
		        
		        WebElement checkoutpage =driver.findElement(By.className("checkout_button"));
		        checkoutpage.click();
		        
		        driver.findElement(By.id("first-name")).sendKeys("test first name");
		        driver.findElement(By.id("last-name")).sendKeys("test last name");
		        driver.findElement(By.id("postal-code")).sendKeys("12345");
		        
		        Thread.sleep(1500);

		        WebElement continuebtn = driver.findElement(By.className("btn_primary"));
		        continuebtn.click();
		        
		        Thread.sleep(1500);

		        WebElement finishbtn =driver.findElement(By.className("btn_action"));
		        finishbtn.click();
		        
		        System.out.println("Purchase is Successfull!");
			 
			 }catch (Exception e) {
				System.out.println("Error:-"+e);
			}
		
	}

}
