package tests.day18;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_FacebookLoginTest {
    @Test
    public void facebookLoginTest() {
        // https://www.facebook.com/ adresine gidin
        FacebookPage facebookPage = new FacebookPage();
        Faker faker = new Faker();
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        // POM’a uygun olarak email, sifre kutularini ve giris yap
        // butonunu locate edinb
        // Faker class’ini kullanarak email ve sifre degerlerini
        // yazdirip, giris butonuna basin
        facebookPage.username.sendKeys(faker.internet().emailAddress());
        facebookPage.password.sendKeys(faker.internet().password());
        facebookPage.login.click();
        // Basarili giris yapilamadigini test edin


        try {
            String actualText = facebookPage.girisYapilamadi.getText();
            Assert.assertTrue(actualText.contains("Facebook"));
        } catch (Exception e) {
            String acturalText2 = facebookPage.getGirisYapilamadiEvetBendim.getText();
            Assert.assertTrue(acturalText2.contains("Evet, Devam Et"));
        }


     Driver.closeDriver();
    }

}