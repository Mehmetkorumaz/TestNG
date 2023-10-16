package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BestbuyPage {
    public BestbuyPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//img[@src='https://www.bestbuy.com/~assets/bby/_com/header-footer/images/bby_logo-a7e90594729ed2e119331378def6c97e.png'])[1]")
    public WebElement bestbuyLogo;
    @FindBy(xpath = "//button[normalize-space()='Français']")
    public WebElement fransiyisLinkElement;

















    8

}
