package tests.day18;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Configuration;
import utilities.Driver;

public class C02_ConfigReader {
    @Test
    public void PositiveLoginTest() {

        //https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(Configuration.getProperty("hotelMyCampPageUrl"));
        //login butonuna bas
        HotelMyCampPage hotelMyCampPage= new HotelMyCampPage();
        hotelMyCampPage.ilkLogin.click();
        //test data username: manager ,
        hotelMyCampPage.username.sendKeys(Configuration.getProperty("hotelMyCampUsername"));
        //test data password : Manager1!
        hotelMyCampPage.password.sendKeys(Configuration.getProperty("hotelMyCampPassword"));
        hotelMyCampPage.login.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.sayfaAcilisiPass.isDisplayed());
    }
}
