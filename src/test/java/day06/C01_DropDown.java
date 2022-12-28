package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C01_DropDown {
    WebDriver driver;
    //Eger test  sinifinda birden fazla method olusturulmussa , @before kullanilir.
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }
   @Test
    public void selectByIndexText(){

       //        Given kullanici https://testcenter.techproeducation.com/index.php?page=dropdown sayfasindayken

     // Dogun yilini, ayini, ve gununu su sekilde secer : 2000, January, 10
//1.dropdown element locate
       WebElement year= driver.findElement(By.xpath("//*[@id='year']"));
//2.select objesi olustur
       Select yearDropDown=new Select(year);
//3.select object i kullanarak uc farkli sekilde secim yapabilirm
       yearDropDown.selectByIndex(22);//secenek sirasi 0 dan baslar  2000 yili

//ay secimi
       WebElement ay= driver.findElement(By.xpath("//select[@id='month']"));

       Select ayDropDown=new Select(ay);
       ayDropDown.selectByValue("0");//option in value degeri ile secim yapilabilir.

       WebElement gun= driver.findElement(By.xpath("//select[@id='day']"));
       Select gunDropDown=new Select(gun);
       gunDropDown.selectByVisibleText("10");//case sensitive - buyuk kucuk harf onemli
   }

   @Test
    public void printAllTest(){

       //tum eyaletlerin isimleriniconsola yazdiralim
       WebElement state= driver.findElement(By.xpath("//select[@id='state']"));
       Select stateDropDown=new Select(state);
    List<WebElement> stateList=stateDropDown.getOptions();
    for (WebElement eachstate:stateList){
        System.out.println(eachstate.getText());
    }
    //stateList.stream().map(WebElement::getText).forEach(System.out::println);
   }
   @Test
    public void getSelectedOptionsTest(){

       //State dropdown indaki varsayilan secili secenegin select  astate oldugunu otomasyonla verify edelim
       WebElement state=driver.findElement(By.xpath("//select[@id='state']"));
       Select stateDropDown=new Select(state);
     String varsayilanText=  stateDropDown.getFirstSelectedOption().getText();

       Assert.assertEquals("Select a State",varsayilanText);
   }
   @After
    public void tearDown(){
        driver.close();
   }
   /*
   1.What is dropdown?
   dropdown liste olusturmak icin kullanilir
   2.How to handle dropdown elements? Dropdown nasil automate edilir?
   -drodown i locate ederim
   -select objesi olustururum
   -select objesi ile istedigim secenegi secerim
   NOT:select objesi olusturma nedenim,dropdownlarin select classi ile olusturulmasi
   3.Tum dropdown seceneklerini nasil print ederiz ?
   -tum dropdown elementlerini getOptions() methodu ile listeye koyariz
   -sonra seceneekleri loop ile yazdirabiliriz
   4.Bir secenegin secili oldugunu otomate etmeek icin ne yapilir?
   Ornek:Gun olarak 10 i secik ama ya secilmediyse?
   getFirstSelectedOptions() secili olan secenegi return eder
    */
}












