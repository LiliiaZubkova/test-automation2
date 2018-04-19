package Lesson7.b_use_local_instead_pagefactory;

import Lesson7.a_proxy_elements_and_page_factory.FirstTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;

public class SecondTest {


    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void firstResultShouldContainExpectedText() throws InterruptedException {
        String query1 = "Dress";
        String query2 = "T-Shirt";
       // FirstTest.MainPage mainPage = new FirstTest.MainPage();
      //  mainPage.enterQuery(query1);

        // driver.findElement(By.id("search_query_top")).click();
        //driver.findElement(By.id("search_query_top")).sendKeys(query1);
      //  (new WebDriverWait(driver, 10))
        //        .until(textToBePresentInElementLocated(mainPage.ADVICE_LOCATOR, query1));

        //   driver.findElement(By.id("search_query_top")).clear();


        //   driver.findElement(By.id("search_query_top")).click();
        //   driver.findElement(By.id("search_query_top")).sendKeys(query2);

        /*mainPage.enterQuery(query2);
        (new WebDriverWait(driver, 10))
                .until(textToBePresentInElementLocated(mainPage.ADVICE_LOCATOR, query2));*/

    }

    class MainPage {
        By ADVICE_LOCATOR = By.xpath("//*[@id=\"index\"]/div[2]/ul/li[1]");
        By FIELD_QUERY_LOCATOR = By.id("search_query_top");
       // @FindBy(xpath = "//*[@id=\"index\"]/div[2]/ul/li[1]")
       // private WebElement advice;

       // @FindBy (id = "search_query_top")
      //  private WebElement fieldQuery;

        private WebDriver driver;


        MainPage (WebDriver driver) {
           // PageFactory.initElements(driver, this);
            this.driver = driver;
        }

        void enterQuery (String query){
            //fieldQuery.click();
            //fieldQuery.clear();
            //fieldQuery.sendKeys(query);
        }


    }
}
