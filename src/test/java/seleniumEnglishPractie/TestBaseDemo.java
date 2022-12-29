package seleniumEnglishPractie;

import org.junit.Test;
import seleniumEnglishPractie.utiliespackage.TestBase;

public class TestBaseDemo extends TestBase {


    @Test
    public void test1(){

        driver.get("https://testcenter.techproeducation.com/");
        System.out.println(driver.getTitle());

    }



}
