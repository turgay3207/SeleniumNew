package calismalar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Q03 {
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://automationexercise.com/");
    }
    @Test
    public void test01(){
//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'

//        3. Verify that home page is visible successfully
        Assert.assertTrue("sayfa gorunurlugu ",driver.findElement(By.xpath("//div[@class='header-middle']//div[@class='col-sm-4']")).isDisplayed());

//        4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
//        5. Verify 'New User Signup!' is visible
       Assert.assertTrue("yazi gorunur mu", driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']")).isDisplayed());
//        6. Enter name and already registered email address
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("admin", Keys.TAB,"admin@gmail.com");
//        7. Click 'Signup' button
        driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
//        8. Verify error 'Email Address already exist!' is visible
          Assert.assertTrue("already yazisi ",driver.findElement(By.xpath("//p[normalize-space()='Email Address already exist!']")).isDisplayed());;


       }


}
