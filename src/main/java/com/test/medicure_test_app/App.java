package com.test.medicure_test_app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriver driver = new ChromeDriver();
		
		//1.Open the browser and get to the url
        driver.get("http://3.17.71.241:8082/contact.html");
        Thread.sleep(3000);
        
        //Enable wait of 2 seconds
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        driver.findElement(By.cssSelector("input[placeholder='Your Name']")).sendKeys("Anil");
        Thread.sleep(1000);
        
        driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("1234567890");
        Thread.sleep(1000);
        
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Anil@test.com");
        Thread.sleep(1000);
        
        driver.findElement(By.cssSelector("input[placeholder='Message']")).sendKeys("Hello, How are you?");
        Thread.sleep(1000);
        
        driver.findElement(By.className("btn_box")).click();
        Thread.sleep(1000);
        
        String response = driver.findElement(By.id("message")).getText();
        
        System.out.println("Response: " + response);
        
        driver.quit();
        
//        //Click	on new Contact button
//        driver.findElement(By.className("v-button")).click();
//        Thread.sleep(1000);
//        
//        //Locate First Name and enter
//        driver.findElement(By.id("gwt-uid-5")).sendKeys("Subhas");
//        
//        Thread.sleep(1000);
//        //Locate Last Name and enter
//        driver.findElement(By.id("gwt-uid-7")).sendKeys("Nongthombam");
//        Thread.sleep(1000);
//        
//        //Locate Phone and enter
//        driver.findElement(By.id("gwt-uid-9")).sendKeys("123456789");
//        Thread.sleep(1000);
//        
//        //Locate Email and enter
//        driver.findElement(By.id("gwt-uid-11")).sendKeys("test@test.com");
//        Thread.sleep(1000);
//        
//        //Locate Birth Date and enter
//        driver.findElement(By.id("gwt-uid-13")).sendKeys("2/8/24,");
//        Thread.sleep(1000);
//        
//        //Click save button and click
//        driver.findElement(By.className("v-button-primary")).click();
//        Thread.sleep(1000);
//        
//        driver.quit();
    }
}
