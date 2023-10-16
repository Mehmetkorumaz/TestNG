package TestJUnic_Sorulari_TestNG_cozumleri;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class S03_ {
// Amazon anasayfaya gidin
// 3 farkli test method'u olusturarak asagidaki gorevleri yapin
// 1- Title'in Amazon icerdigini test edin
// 2- Arama kutusuna "Nutella" yazip aratin ve sonucun Nutella icerdigini test edin
// 3- Arama kutusuna "Java" yazip aratin ve sonucun Java icerdigini test edin
   @Test
    public void amazonJavaTest(){

       Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
       AmazonPage amazonPage=new AmazonPage();
       amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("java")+ Keys.ENTER);
       String expectedSonucElementi="Java";
       String actualSonucElementi=amazonPage.javaAramaSonucYazisi.getText();
       Assert.assertTrue(actualSonucElementi.contains(expectedSonucElementi));
   }
}
