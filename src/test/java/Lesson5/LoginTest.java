package Lesson5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class LoginTest {


    static  WebDriver driver;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\Mine\\Install\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

    @Test
    public void test1() {
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("life7773@gmail.com");
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("qwerty");
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Test
    public void test2() {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a/span")).click();
    }

    @Test
    public void test3() {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a/span")).click();
    }

    @Test
    public void test4() {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a/span")).click();
    }

    @Test
    public void test5() {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a/span")).click();
    }

    @Test
    public void test6() {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"mywishlist\"]/ul/li[1]/a/span\n")).click();
    }
}
