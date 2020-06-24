package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Amazon {
    static WebDriver driver;
    public static void main(String [] args){
        System.setProperty("webdriver.ie.driver","C:\\soft\\IEDriverServer.exe");
        driver=new InternetExplorerDriver() ;
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.close();

    }
}
