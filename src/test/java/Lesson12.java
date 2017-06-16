import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by QAEngineer on 15.06.2017.
 */
public class Lesson12 extends BaseClass {
    @Test
    public void addCard() throws IOException, InterruptedException {
    driver.get("http://localhost/litecart/admin/");
    login();
    driver.findElement(By.cssSelector("#box-apps-menu li:nth-child(2)")).click();
    driver.findElement(By.cssSelector("#content .button:nth-child(2)")).click();
    // General
    driver.findElement(By.cssSelector("[name='status'][value='1']")).click();
    driver.findElement(By.cssSelector("[name='name[en]']")).sendKeys(RandomStringUtils.randomAlphabetic(5));
    driver.findElement(By.cssSelector("[name='code']")).sendKeys(RandomStringUtils.randomNumeric(5));
    for(int i = 0; i < 3; i++) {
        driver.findElement(By.cssSelector("[type='checkbox'][value='" + i + "']")).click();
    }
        driver.findElement(By.cssSelector("[type='checkbox'][value='1-2']")).click();
        driver.findElement(By.cssSelector("[name='quantity'][value='0.00']")).clear();
        driver.findElement(By.cssSelector("[name='quantity'][value='0.00']")).sendKeys("1");
        driver.findElement(By.cssSelector("[type='file']")).sendKeys("//resources/1.jpg");
        driver.findElement(By.cssSelector("[name='date_valid_from']")).sendKeys("16062017");
        driver.findElement(By.cssSelector("[name='date_valid_to']")).sendKeys("15012017");
        Thread.sleep(1000);
        // Information
        driver.findElement(By.cssSelector("[href='#tab-information']")).click();
        driver.findElement(By.cssSelector("[name='manufacturer_id']")).click();
        driver.findElement(By.xpath(".//option[text()='ACME Corp.']")).click();
        driver.findElement(By.cssSelector("[name='keywords']")).sendKeys(RandomStringUtils.randomAlphabetic(5));
        driver.findElement(By.cssSelector("[name='short_description[en]']")).sendKeys(RandomStringUtils.randomAlphabetic(10));
        driver.findElement(By.cssSelector("[dir='ltr']")).sendKeys(RandomStringUtils.randomAlphabetic(70));
        driver.findElement(By.cssSelector("[name='head_title[en]']")).sendKeys(RandomStringUtils.randomAlphabetic(20));
        driver.findElement(By.cssSelector("[name='meta_description[en]']")).sendKeys(RandomStringUtils.randomAlphabetic(20));
        Thread.sleep(1000);
        // Price
        driver.findElement(By.linkText("Prices")).click();   //purchase_price
        driver.findElement(By.cssSelector("[name='purchase_price']")).clear();
        driver.findElement(By.cssSelector("[name='purchase_price']")).sendKeys(RandomStringUtils.randomNumeric(4)+".00");
        driver.findElement(By.cssSelector("[name='purchase_price_currency_code']")).click();
        driver.findElement(By.xpath(".//option[text()='US Dollars']")).click();

        driver.findElement(By.cssSelector("[name='gross_prices[USD]']")).clear();
        driver.findElement(By.cssSelector("[name='gross_prices[USD]']")).sendKeys(RandomStringUtils.randomNumeric(2));
        driver.findElement(By.cssSelector("[name='gross_prices[EUR]']")).sendKeys(RandomStringUtils.randomNumeric(2));
//        driver.findElement(By.cssSelector("button [name='save']")).click();
        driver.findElement(By.cssSelector("[type='submit']:nth-child(1)")).click();
//        wait.until(ExpectedConditions.urlContains("catalog"));
  }

    public void login() {
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }

}