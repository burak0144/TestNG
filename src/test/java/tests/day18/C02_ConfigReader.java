package tests.day18;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReader {
    @Test(groups="gp2")
    public void PositiveLoginTest() {

        //https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampPageUrl"));
        //login butonuna bas
        HotelMyCampPage hotelMyCampPage= new HotelMyCampPage();
        hotelMyCampPage.ilkLogin.click();
        //test data username: manager ,
        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("hotelMyCampUsername"));
        //test data password : Manager1!
        hotelMyCampPage.password.sendKeys(ConfigReader.getProperty("hotelMyCampPassword"));
        hotelMyCampPage.login.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.sayfaAcilisiPass.isDisplayed());

        Driver.closeDriver();
    }
}
