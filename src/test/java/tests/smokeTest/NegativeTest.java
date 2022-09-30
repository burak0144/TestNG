package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeTest {
    @Test
    public void NegativeLoginTest() {
        //1 ) Bir Class olustur : NegativeTest
        //2) Bir test method olustur NegativeLoginTest()
        //https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampPageUrl"));
        //login butonuna bas
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLogin.click();
        //test data username: manager1 ,
        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("hotelMyCampWrongUsername"));
        //test data password : manager1!
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("hotelMyCampWrongPassword"));
        hotelMyCampPage.login.click();
        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());

        Driver.closeDriver();

    }
}
