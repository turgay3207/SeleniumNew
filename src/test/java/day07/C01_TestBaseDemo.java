package day07;

import Utilities.TestBase01;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class C01_TestBaseDemo extends TestBase01 {
    /*
   UTILITIES
   -Utilities tekrar tekrar kullanacagimiz class'lari koydugumuz paketin adidir.
        - TestBase
        - Driver -> Sonra
        - ExcelUtil -> Sonra
        - Configuration -> Sonra
        -utulities paketinde testcase ler yazilmaz
        -Sadece Tekrar kullanilabilecek destek siniflari (support class) olusturulur. Bu support classlar test caselerin yazilmasini hizlandirir.

 */

    @Test
    public void test1() {
        //techproeducation sayfasina git
        driver.get("https://techproeducation.com");

        //ve title nin "bootcamp" kelimesini icerdigini test edelim
        String pageTitle=driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Bootcamps"));

    }
}
