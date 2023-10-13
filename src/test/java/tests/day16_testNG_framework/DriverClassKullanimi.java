package tests.day16_testNG_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

public class DriverClassKullanimi {
    @Test
    public void amazonTest(){
        // amazona git
        Driver.getDriver().get("https://www.amazon.com");

        //Nutella icin arama yapalim

        WebElement aramaKutusu=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
                aramaKutusu.sendKeys("nutella"+ Keys.ENTER);
        //kapatin
        Driver.closeDriver();
    }
}
