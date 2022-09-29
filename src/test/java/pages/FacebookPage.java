package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {
   public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement login;

    @FindBy(xpath = "//div[text()=\"Facebook'a Giriş Yap\"]")
    public WebElement girisYapilamadi;

    @FindBy(xpath = "//button[text()='Evet, Devam Et']")
    public WebElement getGirisYapilamadiEvetBendim;
}
