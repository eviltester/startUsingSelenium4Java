package com.eviltester.webdriver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyFirstChromeTest {

    /**
     The following code is for the Chrome Driver.
    */

    @Test
    public void startWebDriver(){

        ChromeOptions options = new ChromeOptions();
        if(System.getenv().
                getOrDefault("BROWSER_STATE","show").
                equals("Headless")){
            options.addArguments("--headless");
        }

        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://testpages.eviltester.com/styled/basic-web-page-test.html");

        Assertions.assertEquals(
            driver.findElement(By.tagName("h1")).getText(),
        "Basic Web Page Example"
        );

        driver.close();
        driver.quit();
    }

    /*

     if https://testpages.herokuapp.com is not working then you can download the
     test pages app from github

     https://github.com/eviltester/TestingApp/tree/master/java/testingapps/seleniumtestpages

     The herokuapp and github release are maintained.

     If you want to learn more about Selenium WebDriver then check out my online courses:

     https://eviltester.com/courses

     */

}
