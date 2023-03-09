package com.ERP.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    //create a private constructor to remove access to this object


    private Driver() {
    }


    /*
    We make WebDriver Private because we want to close access from outside the classs
    We are making is static because we will use it in a static method
     */
    //private static WebDriver driver; - single run only
    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();//parallel run

    public static WebDriver getDriver() {
        // if (driver == null) { - single run
        if (driverPool.get() == null) {

            String browserType = ConfigurationReader.getProperty("browser");
            switch (browserType) {
                case "chrome":
                    // WebDriverManager.chromedriver().setup();
                    //driver = new ChromeDriver(); single run
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    driverPool.set(new ChromeDriver(options));
                    // driver.manage().window().maximize(); single run
                    driverPool.get().manage().window().maximize();
                    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":
                    //WebDriverManager.firefoxdriver().setup();
                    //driver = new FirefoxDriver(); single run
                    driverPool.set(new FirefoxDriver());
                    //driver.manage().window().maximize();// single run
                    driverPool.get().manage().window().maximize();
                    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// single
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//parallel
                    break;

            }
        }
        return driverPool.get();
    }

    public static void closeDriver() {

        // if (driver!= null){// single
        if (driverPool.get() != null) //parallel
            // driver.quit(); -single
            driverPool.get().quit();

        driverPool.remove();

    }
}


