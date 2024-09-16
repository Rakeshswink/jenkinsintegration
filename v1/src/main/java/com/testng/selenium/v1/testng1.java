package com.testng.selenium.v1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testng1 
{
    WebDriver driver;

    // This method sets up the WebDriver before any test runs
    @BeforeClass
    public void setUp() {
        // Set the path to your chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:/Users/Rakesh/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

        // Initialize the class-level WebDriver (Chrome in this case)
        driver = (WebDriver) new ChromeDriver();
        System.out.println("Driver Initialized done1.");
    }

    // Test case to load a URL and verify the page title
    @Test
    public void loadUrlTest() {
        // Open the desired URL
        String url = "https://sandbox.swinkpay-fintech.com/mosv1";
        driver.get(url);https://marketplace.eclipse.org/marketplace-client-intro?mpc_install=3680354
        
        // Print the current URL
        System.out.println("Opened URL: " + driver.getCurrentUrl());
        System.out.println("current URL: " +driver.getTitle());

        // Verify the page title
        String expectedTitle = "SwinkPay";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title doesn't match.");
        
        System.out.println("Page title verified successfully.");
    }

    // This method closes the browser after all tests are completed
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            // Close the browser
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
