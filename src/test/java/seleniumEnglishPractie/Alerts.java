package seleniumEnglishPractie;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import seleniumEnglishPractie.utiliespackage.TestBase;

public class Alerts extends TestBase {
    @Test
    public void acceptAlert() throws InterruptedException {

//        acceptAlert() => click on the first alert,
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(2000);
//                verify the text “I am a JS Alert” ,
        String alertText = driver.switchTo().alert().getText();
        Assert.assertEquals("I am a JS Alert", alertText);
        Thread.sleep(2000);
//        click OK ,
        driver.switchTo().alert().accept();//click okey/ we have to accepted
//        and Verify “You successfully clicked an alert”
     String resultText=   driver.findElement(By.xpath("//p[@id='result']")).getText();
     Assert.assertEquals("You successfully clicked an alert",resultText);
        Thread.sleep(2000);
    }
}
