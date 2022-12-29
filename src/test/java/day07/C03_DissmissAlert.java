package day07;

import Utilities.TestBase01;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class C03_DissmissAlert extends TestBase01 {
 //   2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının “You clicked: Cancel” oldugunu test edin.

    @Test
    public void test1() throws InterruptedException {

        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        String actualTitle=     driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expected ="You clicked: Cancel";
        Thread.sleep(2000);
        Assert.assertEquals(expected,actualTitle);
        Thread.sleep(2000);

    }
}
