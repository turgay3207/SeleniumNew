package calismalar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Q01 {

    static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        //    1. Launch browser
        //    2. Navigate to url 'http://automationexercise.com'
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://automationexercise.com");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        driver.close();
    }


    @Test
    public void test01() {
        //3. Verify that home page is visible successfully
        Assert.assertTrue(driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed());

    }

    @Test
    public void test02() {
        //4. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        //5. Verify user is navigated to ALL PRODUCTS page successfully
        Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed());
    }

    @Test
    public void test03() {
        // 6. Enter product name in search input and click search button
        driver.findElement(By.xpath("//input[@id='search_product']")).
                sendKeys("Fancy Green Top");
        driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
        //        7. Verify 'SEARCHED PRODUCTS' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//h2[@class='title text-center']")).isDisplayed());

    }

    @Test
    public void tets04() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        //  8. Verify all the products related to search are visible---4-6-8-10-12-70(3-5-7--69)  size: 73
        List<WebElement> products = driver.findElements(By.tagName(""));


        for (int i = 3; i < products.size() - 3; i = i + 2) {
            Thread.sleep(1000);
            driver.navigate().refresh();
            try {

                System.out.println("product = " + products.get(i).getText());
                driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys(products.get(i).getText());
                driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
                Assert.assertTrue(driver.findElement(By.className("productinfo text-center")).isDisplayed());
            }catch (Exception e) {
                e.getMessage();
            }



        }


    }



}
