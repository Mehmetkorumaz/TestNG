package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;



public class Us_011 {

    @Test
    public void test2(){
        Driver.getDriver().get(ConfigReader.getProperty("smartCardLinkUrl"));
        UserDashboard userDashboard=new UserDashboard();
        userDashboard.signInButtonu.click();
        userDashboard.kullaniciEmail.sendKeys(ConfigReader.getProperty("kullaniciEmail2"));
        userDashboard.kullaniciPassword.sendKeys(ConfigReader.getProperty("kullaniciPassword2"));
        userDashboard.kullaniciLoginButonu.click();
        userDashboard.virtualBackButtonu.click();
        userDashboard.birinciKartButtonu.click();
        WebElement dropDownElementi = userDashboard.vcardIsimSeleckt;
        Select select = new Select(dropDownElementi);
        select.selectByValue("1");

        userDashboard.firstNameArkaPlan.sendKeys(ConfigReader.getProperty("firstName"));
        userDashboard.lastNameArkaPlan.sendKeys(ConfigReader.getProperty("lastName"));
        userDashboard.emailArkaPlan.sendKeys(ConfigReader.getProperty("kullaniciEmail2"));
        userDashboard.occupationArkaPlan.sendKeys(ConfigReader.getProperty("occupation"));
        userDashboard.phoneNummerArkaPlan.sendKeys(ConfigReader.getProperty("phone"));
        userDashboard.websiteArkaPlan.sendKeys(ConfigReader.getProperty("urlAlias"));
        userDashboard.saveArkaPlan.click();

    }
}
