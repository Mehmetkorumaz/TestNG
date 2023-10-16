package TestJUnic_Sorulari_TestNG_cozumleri;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BestbuyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class S04_ {
    //2) https://www.bestbuy.com/ Adresine gidin
    //   farkli test method’lari olusturarak asagidaki testleri yapin
    //      ○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
    //      ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
    //      ○ logoTest => BestBuy logosunun görüntülendigini test edin
    //      ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
    BestbuyPage bestbuyPage=new BestbuyPage();
    @Test
    public void bestBuyTesting(){
        Driver.getDriver().get(ConfigReader.getProperty("bestbuyUrl"));
        BestbuyPage bestbuyPage=new BestbuyPage();
        String actualLogoElementi=bestbuyPage.bestbuyLogo.getText();
        Assert.assertTrue(actualLogoElementi.isDisplay);


    }
    @Test
    public void test2(){
        String actualFransizcaElement=bestbuyPage.fransiyisLinkElement.getText();
        Assert.assertTrue(actualFransizcaElement);

    }
}
