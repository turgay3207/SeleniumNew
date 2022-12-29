package day07;

import Utilities.TestBase01;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import seleniumEnglishPractie.utiliespackage.TestBase;

public class C04_PromtAlert extends TestBase01 {

    @Test
    public void sendKeysMethod() throws InterruptedException {


        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Turgay");
        driver.switchTo().alert().accept();

        String sonuc = driver.findElement(By.xpath("//*[@id='result']")).getText();
        Assert.assertEquals(sonuc, "You entered: Turgay");
        Thread.sleep(3000);

    }
}
