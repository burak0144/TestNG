package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {
    //1) smokeTest paketi altinda yeni bir Class olustur: NegativeTest
    //3 Farkli test Methodunda 3 senaryoyu test et
    //- yanlisSifre
    //- yanlisKulllanici
    //- yanlisSifreKullanici
    //test data yanlis username: manager1 , yanlis password : manager1
    //2) https://www.hotelmycamp.com adresine git
    //3) Login butonuna bas
    //4) Verilen senaryolar ile giris yapilamadigini test et

    @Test
    public void yanlisSifre() {
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampPageUrl"));

        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLogin.click();

        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("hotelMyCampUsername"));

        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("hotelMyCampWrongPassword"));
        hotelMyCampPage.login.click();
        Assert.assertTrue(hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlisKulllanici() {
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampPageUrl"));

        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLogin.click();

        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("hotelMyCampWrongUsername"));

        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("hotelMyCampPassword"));
        hotelMyCampPage.login.click();
        Assert.assertTrue(hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void yanlisSifreKullanici() {
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampPageUrl"));

        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLogin.click();

        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("hotelMyCampWrongUsername"));

        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("hotelMyCampWrongPassword"));
        hotelMyCampPage.login.click();
        Assert.assertTrue(hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());
        Driver.closeDriver();
    }
}
