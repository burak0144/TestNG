package tests.day22;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {
    BrcPage brcPage;
    @Test
    public void test01() {
        extentTest=extentReports.createTest("Pozitif Test", "Gecerli kullanici adi ve password ile giris yapildi");
   //-https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("blueRentaCarUrl"));
        extentTest.info("Blue RentaCar sitesine gidildi");
   //-login butonuna bas
        brcPage=new BrcPage();
        brcPage.ilkLogin.click();
        extentTest.info("Login butonuna basildi");
   //-test data user email: customer@bluerentalcars.com ,
   //-test data password : 12345 dataları girip login e basın
   brcPage.email.sendKeys(ConfigReader.getProperty("brcUserEmail"));
   brcPage.password.sendKeys(ConfigReader.getProperty("brcPassword"));
   //-login butonuna tiklayin
        brcPage.login.click();
        extentTest.info("Dogru kullanici email ve password girildi");
        extentTest.info("Ikinci login butonuna basildi");
   //-Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(brcPage.sayfaAcildi.isDisplayed());
        extentTest.pass("Sayfaya basarili bir sekilde girildi");
    }
}
