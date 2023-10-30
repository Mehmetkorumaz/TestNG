package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDashboard {
    public UserDashboard(){PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy (xpath = "//a[@class='btn btn-white fs-18 ms-3 d-lg-block d-none']")
    public WebElement signInButtonu;
    @FindBy (xpath = "//input[@name='email']")
    public WebElement kullaniciEmail;
    @FindBy (xpath = "//input[@name='password']")
    public WebElement kullaniciPassword;
    @FindBy (xpath = "//button[text()='Login']")
    public WebElement kullaniciLoginButonu;
    @FindBy (xpath = "(//span[@class='aside-menu-title'])[2]")
    public WebElement vcardButonu;
    @FindBy (xpath = "//a[@type='button']")
    public WebElement newVCardButonu;
    @FindBy (xpath = "//*[@*='vcard-url-alias']")
    public WebElement urlAlias;
    @FindBy (xpath = "//input[@name='name']")
    public WebElement vcardName;
    @FindBy (xpath = "//input[@value='Save']")
    public WebElement saveButton;
    @FindBy (xpath = "//input[@id='first_name']")
    public WebElement firstName;
    @FindBy (xpath = "//input[@id='last_name']")
    public WebElement lastName;
    @FindBy (xpath = "//*[@*='col-12 text-muted pagination-record ms-sm-3']")
    public WebElement sayininGoruntulenebilirligi;
    @FindBy (xpath = "//input[@value='Save']")
    public WebElement save2Button;
    @FindBy (xpath = "//a[@title='QR Code'])[2]")
    public WebElement qaKodeAktifButton;
    @FindBy (xpath = "(//*[@*='download'])[1]")
    public WebElement dowloadVCardButton;
    @FindBy (xpath = "(//*[@*='Enquiries'])[1]")
    public WebElement enquiriesButton;
    @FindBy (xpath = "(//*[@*='pen-to-square'])[1]")
    public WebElement editButton;
    @FindBy (xpath = "(//*[@*='trash'])[1]")
    public WebElement deleteButton;
    @FindBy (xpath = "//*[text()='Manage Subscription']")
    public WebElement editGorunurlugu;
    @FindBy (xpath = "(//*[@class='swal-button-container'])[1]")
    public WebElement deleteOnayButtonu;
    @FindBy (xpath = "(//*[@class='svg-inline--fa fa-id-card'])[2]")
    public WebElement virtualBackButtonu;
    @FindBy (xpath = "(//img[@data-id='1'])[2]")
    public WebElement birinciKartButtonu;
    //span[@id='select2-e-vcard-id-container']
    @FindBy (xpath = "(//span[@id='select2-e-vcard-id-container']")
    public WebElement vcardIsimSeleckt;

    @FindBy (xpath = "//*[@data-select2-id='select2-data-64-vu3e']")
    public WebElement vcardIsimValue;

    @FindBy (xpath = "//input[@id='e-card-first-name']")
    public WebElement firstNameArkaPlan;
    @FindBy (xpath = "//input[@id='e-card-last-name']")
    public WebElement lastNameArkaPlan;
    @FindBy (xpath = "//input[@id='e-card-email']")
    public WebElement emailArkaPlan;
    @FindBy (xpath = "//input[@id='e-card-occupation']")
    public WebElement occupationArkaPlan;
    @FindBy (xpath = "//input[@id='e-card-location']")
    public WebElement locationArkaPlan;
    @FindBy (xpath = "//*[@*='phoneNumber']")
    public WebElement phoneNummerArkaPlan;
    @FindBy (xpath = "//*[@*='e-card-website']")
    public WebElement websiteArkaPlan;

    @FindBy (xpath = "//*[@*='e-card-website']")
    public WebElement saveArkaPlan;

}
