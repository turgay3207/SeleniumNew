package day05_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_BeforeClassAfterClass {
    /*
        @BeforeClass ve @AfterClass notasyonlari sadece static method'lar icin calisir.
    @BeforeClass ve @AfterClass kullanirsak olusturdugumuz @Test method'larinin hepsini ayni anda calistirip
    en son @AfterClass'i calistiririz.
        Ama sadece @Before ve @After kullanirsak her test icin @Before ve @After'i kullanir.
        ******       ********      ******
        @BeforeClass--->Test01, Test02, Test03....-->@AfterClass
        Before--> Test01---> After
        Before--> Test02---> After
     */
    @BeforeClass
    public static void setUp() {
        System.out.println("Butun Testlerden once calisti");
    }
    @AfterClass
    public static void tearDown() {
        System.out.println("Butun Testlerden sonra calisti.");
    }
    @Before
    public void setUp01() {
        System.out.println("Her testten once calisir");
    }
    @After
    public void tearDown01() {
        System.out.println("Her testten sonra calisir");
    }
    @Test
    public void test01() {
        System.out.println("Ilk Test");
    }
    @Test
    public void test02() {
        System.out.println("Ikinci Test");
    }
}
