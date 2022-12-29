package day07;

import Utilities.TestBase01;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class C02_AlertsAccept extends TestBase01 {
    @Test
    public void acceptAlertTest() throws InterruptedException {
        //        1. butona tıklayın,
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(2000);
        //        uyarıdaki OK butonuna tıklayın
        driver.switchTo().//degistir
                alert().//alerte degistir
                accept();//ok secenegini tikla
        //        ve result mesajının
        //       “You successfully clicked an alert” oldugunu test edin.
        String resultText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals("You successfully clicked an alert", resultText);

        Thread.sleep(2000);
    }

    /*
    Alert leri nasil otomate edersin?
    how to handle alerts in selenium?
    -alertler javascript ile olusturulur inspect edilemezler Oncelikle alerte switch etmemiz gerekir.
     */

}

