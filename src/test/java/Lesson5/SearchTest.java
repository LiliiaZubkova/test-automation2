package Lesson5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;


public class SearchTest {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\Mine\\Install\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

    @Test
    public void firstResultShouldContainExpectedText() {
        driver.findElement(By.id("search_query_top")).click();
        driver.findElement(By.id("search_query_top")).sendKeys("Printed Summer Dress");

        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"index\"]/div[2]/ul/li"));

        if (elements.size() != 3){
            System.out.println("There are more than 3 elements in search list");
        }

        driver.findElement(By.id("search_query_top")).submit();
        assertThat(driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).getText(),
               containsString("Printed Summer Dress"));
    }

}
