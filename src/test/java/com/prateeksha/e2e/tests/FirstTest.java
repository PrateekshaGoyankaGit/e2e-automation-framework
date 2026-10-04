package com.prateeksha.e2e.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

    public class FirstTest {

        @Test
        public void openSeleniumSite() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.selenium.dev");
            System.out.println("Title: " + driver.getTitle());
            Assert.assertTrue(driver.getTitle().contains("Selenium"));
            driver.quit();
        }
    }

