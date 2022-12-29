package day07;

import Utilities.TestBase01;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class C05_IFrame extends TestBase01{

    @Test
    public void iframeTest() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");
      String actualTitle=  driver.findElement(By.xpath("//p[normalize-space()='An iframe with a thin black border:']")).getText();
      String exceptTitle="An iframe with a thin black border:";
        Assert.assertEquals(exceptTitle,actualTitle);


        Thread.sleep(3000);

    }
}
