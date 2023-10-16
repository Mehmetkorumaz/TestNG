package TestJUnic_Sorulari_TestNG_cozumleri;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class S02_ {
    // Amazon anasayfaya gidin
// 3 farkli test method'u olusturarak asagidaki gorevleri yapin
// 1- Title'in Amazon icerdigini test edin
// 2- Arama kutusuna "Nutella" yazip aratin ve sonucun Nutella icerdigini test edin
// 3- ilk urunu tiklayin ve urun isminde Nutella gectigini test edin
    @Test
    public void AmazonTitelTest(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        String expectedSonucYaziElementi="Nutella";
        String actualSonucYaziElementi=amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYaziElementi.contains(expectedSonucYaziElementi));
        Driver.closeDriver();

    }
    @Test
    public void aamazonTitelTest(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        String expectedSonucYaziElementi="Nutella";
        String actualSonucYaziElementi=amazonPage.sonucYaziElementi.getText();
        amazonPage.ilkUrunElementi.click();
        String expectedUrunIsmiElementi="Nutella";
        String actualUrunIsmiElementi=amazonPage.ilkUrunIsimElementi.getText();
        Assert.assertTrue(actualUrunIsmiElementi.contains(expectedUrunIsmiElementi));
        Driver.closeDriver();

    }
}
