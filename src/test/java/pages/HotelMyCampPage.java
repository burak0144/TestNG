package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampPage {
   public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLogin;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement login;

    @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement sayfaAcilisiPass;

    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement girisYapilamadiYaziElementi;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelListLinki;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotelLinki;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement addHotelCodeKutusu;

    @FindBy(xpath = "//select[@id='IDGroup']" )
    public WebElement addHotelDropdown;

    @FindBy(xpath ="//button[@id='btnSubmit']" )
    public WebElement addHotelSaveButonu;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement basariliEklendi;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement lastButtonOK;

 public void bekle(int saniye) {
  try {
   Thread.sleep(saniye * 1000);
  } catch (InterruptedException e) {
   e.printStackTrace();
  }
 }
 public void girisYap(){
  Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampPageUrl"));
  ilkLogin.click();
  username.sendKeys(ConfigReader.getProperty("hotelMyCampUsername"));
  password.sendKeys(ConfigReader.getProperty("hotelMyCampPassword"));
  login.click();
 }
}
