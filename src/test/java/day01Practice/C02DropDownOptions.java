package day01Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02DropDownOptions {


// https://www.amazon.com/ sayfasina gidin
// dropdown'dan "Baby" secenegini secin
// sectiginiz option'i yazdirin
// dropdown'daki optionlarin toplam sayısının 28'e esit oldugunu test edin

    static WebDriver driver;




    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
}
