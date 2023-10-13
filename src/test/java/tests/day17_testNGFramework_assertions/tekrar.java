package tests.day17_testNGFramework_assertions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.dom.model.ShadowRootType;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import pages.QualitydemyPage;
import pages.ZeroAppPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tekrar {

    @Test
    public  void test(){
        // amazon anasayfaya gidin
       Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // parantezin icin configuration.properties dosyasindan amazonUrl'i
        // bana getirecek bir seyler yazmam lazim
        // arama kutusuna aranacak kelimeyi yazdirin ve aratin
       AmazonPage amazonPage=new AmazonPage();
       amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+Keys.ENTER);



        // arama sonuclarinin aranan kelimeyi icerdigini test edin
        String expectedArananKelime=ConfigReader.getProperty("amazonAranacakKelime");
        String actualKelime=amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualKelime.contains(expectedArananKelime));

        // sayfayi kapatin
        ReusableMethods.bekle(3);
        Driver.closeDriver();

    }

    @Test
    public void pozitifLoginTesti() {
        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.cookieButon1.click();
        //2- login linkine basin
        qualitydemyPage.ilkLoginLinki.click();


        //3- Kullanici email'i olarak valid email girin
        qualitydemyPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliEmail"));

        //4- Kullanici sifresi olarak valid sifre girin
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        //5- Login butonuna basarak login olun
        qualitydemyPage.loginButonu.click();

        //6- Basarili olarak giris yapilabildigini test edin,resminide cekiniz

    }
    @Test
    public void zeroAppTesti(){
        //. “http://zero.webappsecurity.com/” Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));
        // 2. Sign in butonuna basin
        ZeroAppPage zeroAppPage=new ZeroAppPage();
        zeroAppPage.ilkSingButon.click();


        // 3. Login kutusuna “username” yazin
        zeroAppPage.userName.sendKeys(ConfigReader.getProperty("zerouserName"));
        // 4. Password kutusuna “password” yazin
        zeroAppPage.password.sendKeys(ConfigReader.getProperty("zeroPassword"));
        // 5. Sign in tusuna basin
        zeroAppPage.signButon2.click();
        // 6. back tusuna basin, Online banking menusu icinde Pay Bills sayfasina gidin
        Driver.getDriver().navigate().back();
        zeroAppPage.onlineBankingButon.click();
        zeroAppPage.payBildsButon.click();
        // 7. “Purchase Foreign Currency” tusuna basin
        zeroAppPage.purchaseForeignCurrencyButon.click();

        // 8. “Currency” drop down menusunden Eurozone’u secin
        Select select=new Select(zeroAppPage.currencyDropdown);
        select.selectByValue("EUR");

        // 9. soft assert kullanarak "Eurozone (euro)" secildigini test edin
        SoftAssert softAssert=new SoftAssert();
        String actualOption=select.getFirstSelectedOption().getText();
        String expectedOption="Eurozone (euro)";
        softAssert.assertEquals(actualOption,expectedOption,"secilen option 'Eurozone (euro)' degil");

        // 10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        // "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"
        String[] dropDownElementList= {"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"};
        List<String> expectedDropdownList= Arrays.asList(dropDownElementList);
        List<WebElement> dropdownList=select.getOptions();
        List<String> actualDropdownList=new ArrayList<>();

        for (WebElement each:dropdownList
             ) {
            actualDropdownList.add(each.getText());
        }

        softAssert.assertEquals(actualDropdownList,expectedDropdownList,"listeler ayni degil");
        softAssert.assertAll();

        Driver.closeDriver();
    }
}
