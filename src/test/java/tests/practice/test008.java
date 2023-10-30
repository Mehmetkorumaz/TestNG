package tests.practice;

import org.testng.annotations.Test;
import pages.UserDashboard;
import utilities.ConfigReader;
import utilities.Driver;

public class test008 {
    @Test
    public void test008(){
        Driver.getDriver().get(ConfigReader.getProperty("samartCarLinkUrl"));
        UserDashboard userDashboard=new UserDashboard();
        userDashboard.signInButtonu.click();
        userDashboard.kullaniciEmail.sendKeys(ConfigReader.getProperty("kullaniciEmail2"));
        userDashboard.kullaniciPassword.sendKeys(ConfigReader.getProperty("kullaniciPassword2"));
        userDashboard.kullaniciLoginButonu.click();
        userDashboard.vcardButonu.click();
        userDashboard.newVCardButonu.click();
        userDashboard.urlAlias.click();
        userDashboard.vcardName.sendKeys(ConfigReader.getProperty("vcardName"));
        userDashboard.saveButton.click();
    }
}
