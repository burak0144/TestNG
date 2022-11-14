package tests.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeMethodAfterMethod;
import utilities.TestBaseCross;

public class C02_SoftAssert extends TestBaseCross {
    @Test(groups = "gp1")
    public void testName() {
/*
SoftAssert baslangic ve bitis satirlari arasindaki tum assertion'lari yapip
bitis olarak belirtmemiz gereken assertAll() methoduyla test methodumuzdaki
butun assertion'lari kontrol eder. Failed olan olursa assertion yaptigimiz
methodun sonuna yazdigimiz mesaji bize konsolda verir.
 */
//1-amazon anasayfaya gidin
    driver.get("https://amazon.com");
    //2-title in Amazon içerdigini test edin
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(driver.getTitle().contains("Amazon"));
    //3-arama kutusnun erişilebilir oldugunu tets edin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled());
    //4-arama kutusuna Nuella yazıp aratın
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    //5-arama yapıldıgını test edin
        WebElement resultWE = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(resultWE.isDisplayed());
    //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(resultWE.getText().contains("Nutella"));

        softAssert.assertAll();

}
}