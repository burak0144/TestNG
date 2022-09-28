package day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {


    @Test(priority = 1)
    public void bestbuyTesti() {
        driver.get("https://bestbuy.com");
    }
    @Test(priority=3)
    public void techproeducationTesti() {
        driver.get("https://techproeducation.com");
    }
    @Test(priority = 2)
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }
}
