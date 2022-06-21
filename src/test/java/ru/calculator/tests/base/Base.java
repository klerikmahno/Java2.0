package ru.calculator.tests.base;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Base {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("@BeforeAll -> beforAll()\n");
    }

    @BeforeClass
    public static void beforCless() {
        System.out.println();
    }

    @BeforeAll
    final public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resurces/webdriver/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        return webDriver;
        /*try {

            if (webDriver.equals(null)) {
                webDriver = new ChromeDriver();
            } else {
                return webDriver;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return webDriver;
        }*/
    }
}

