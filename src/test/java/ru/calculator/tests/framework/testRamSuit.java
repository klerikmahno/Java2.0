package ru.calculator.tests.framework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.calculator.tests.base.Base;


public class testRamSuit extends Base {

    //WebDriver driver;

    @Test
    @DisplayName("Тест1")
    public void test() throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        //driver = new ChromeDriver();
        //max size browser
        getDriver().manage().window().maximize();

        getDriver().get("https://r-am.ru/");

        WebDriverWait wait = new WebDriverWait(getDriver(),10, 10000);

        ////div[@class="container"]//div[@class="top-links nav norazmivcont hidden-xs hidden-sm col-md-6"] (общее мейнменю))
        //WebElement novosti = driver.findElement(By.xpath("//*[@id=\"top3_links\"]/div/div/div/ul/li[1]/a"));
        //WebElement katalog = driver.findElement(By.xpath("//*[@id=\"menu2_button\"]/div[2]))"));
        //katalog.click();
        WebElement search = getDriver().findElement(By.xpath("//*[@id=\"top2\"]/div/div/div[2]/div/input"));

        search.click();
        search.clear();
        search.sendKeys("Pandora DX-9x"+"\n");



    }

}