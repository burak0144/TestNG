package pages;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class HepsiburadaPage {
    Actions actions;

   public HepsiburadaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='sf-MenuItems-UHHCg2qrE5_YBqDV_7AC'])[1]")
    public WebElement Elektronik;

   @FindBy(xpath = "//a[text()='Bilgisayar/Tablet']")
    public WebElement BilgisayarTablet;


    public void weList() throws IOException {
        for (int i = 1; i <=16 ; i++) {
            actions=new Actions(Driver.getDriver());
            actions.moveToElement(Elektronik).perform();
            actions.moveToElement(BilgisayarTablet).perform();

            WebElement list=Driver.getDriver()
                    .findElement(By.xpath("(//ul[@class='sf-ChildMenuItems-xEXsQvaJD0cslMw9rBZM'])["+i+"]"));


            list.click();
            ReusableMethods.waitFor(5);

            ReusableMethods.getScreenshot("Hepsiburada");
            Driver.getDriver().navigate().back();

        }
        }

    }


