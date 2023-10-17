package TestJUnic_Sorulari_TestNG_cozumleri;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;

public class S05_7Gun_2Assertion_soru {
    //2) https://www.youtube.com adresine gidin
    //3) Aşağıdaki adları kullanarak 4 test metodu oluşturun
    //   ve gerekli testleri yapin
    //  ○ titleTest   => Sayfa başlığının “YouTube” oldugunu test edin
    //  ○ imageTest   => YouTube resminin görüntülendiğini (isDisplayed()) test edin
    //  ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
    //  ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
@Test
    public void youtubeTest(){
    Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));
}
}
