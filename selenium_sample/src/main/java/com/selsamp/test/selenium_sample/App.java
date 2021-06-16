package com.selsamp.test.selenium_sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )  throws InterruptedException 
    {
        System.out.println( "Hello World!" );
     
       // System.setProperty("webdriver.gecko.driver","E:\\\\Softwares\\\\geckodriver.exe");
        
        //WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver();
        
        WebDriver driver = null;
        //WebDriverManager.chromedriver().browserVersion("90.0.4430.212").setup();
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); 
        options.addArguments("enable-automation"); 
        options.addArguments("--no-sandbox"); 
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation"); 
        options.addArguments("--disable-gpu"); 
        driver = new ChromeDriver(options); 
       // driver.get("https://www.google.com/");
        driver.get("http://localhost:8888/");
        //driver.manage().window().maximize(); 
        Thread.sleep(5000); 
        driver.quit();
        
        
        
		
		/*
		 * WebDriver driver = new ChromeDriver(); driver.get("https://www.google.com/");
		 * driver.manage().window().maximize(); Thread.sleep(5000); driver.quit();
		 */
		 
            	
      	}
    }
    
    

