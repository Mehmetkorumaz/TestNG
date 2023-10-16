package TestJUnic_Sorulari_TestNG_cozumleri;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class S01_ {
    // 3 test method'u olusturup asagidaki gorevleri
    // bagimsiz olarak calisabilecek sekilde olusturun
    // 1- Amazon anasayfaya gidip, url'in amazon icerdigini test edin,sayfayi kapatin
    // 2- Wisequarter anasayfaya gidip, title'in Wise icerdigini test edin,sayfayi kapatin
    // 3- Youtube anasayfaya gidip, title'in best icermedigini test edin,sayfayi kapatin
    @Test
    public void amazonUrlTest(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expectedAmazonUrl="amazon";
        String actualAmazonUrl=ConfigReader.getProperty("amazonUrl");
        Assert.assertTrue(actualAmazonUrl.contains(expectedAmazonUrl));
        Driver.closeDriver();
    }
    @Test
    public void wisequarterUrlTest(){
        // failed verdi
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
        String expectedAmazonUrl="Wise";
        String actualAmazonUrl=ConfigReader.getProperty("wiseUrl");
        Assert.assertTrue(actualAmazonUrl.contains(expectedAmazonUrl));
        Driver.closeDriver();
    }
    @Test
    public void youtubeUrlTest(){
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));
        String expectedAmazonUrl="youtube";
        String actualAmazonUrl=ConfigReader.getProperty("youtubeUrl");
        Assert.assertTrue(actualAmazonUrl.contains(expectedAmazonUrl));
        Driver.closeDriver();
    }

}
