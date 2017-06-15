import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by QAEngineer on 14.06.2017.
 */
public class Lesson11 extends BaseClass{
    @Test
    public void registration() throws IOException {
        driver.get("http://localhost/litecart/en/");

        String TaxId = RandomStringUtils.randomAlphabetic(8);
        String companyName = RandomStringUtils.randomAlphabetic(10);
        String firstName = RandomStringUtils.randomAlphabetic(8);
        String lastName = RandomStringUtils.randomAlphabetic(10);
        String firstAdrress = RandomStringUtils.randomAlphanumeric(10);
        String secondAdrress = RandomStringUtils.randomAlphanumeric(12);
        String postcode = RandomStringUtils.randomNumeric(5);
        String city = RandomStringUtils.randomAlphabetic(12);
        String email = RandomStringUtils.randomAlphanumeric(10) + "@mail.com";
        String phone = "+" + RandomStringUtils.randomNumeric(10);
        String passwords = RandomStringUtils.randomAlphanumeric(12);

        driver.findElement(By.linkText("New customers click here")).click();
        driver.findElement(By.cssSelector(("[name=tax_id]"))).sendKeys(TaxId);
        driver.findElement(By.cssSelector(("[name=company]"))).sendKeys(companyName);
        driver.findElement(By.cssSelector(("[name=firstname]"))).sendKeys(firstName);
        driver.findElement(By.cssSelector(("[name=lastname]"))).sendKeys(lastName);

        driver.findElement(By.cssSelector(("[name=address1]"))).sendKeys(firstAdrress);
        driver.findElement(By.cssSelector(("[name=address2]"))).sendKeys(secondAdrress);
        driver.findElement(By.cssSelector(("[name=postcode]"))).sendKeys(postcode);
        driver.findElement(By.cssSelector(("[name=city]"))).sendKeys(city);
        driver.findElement(By.cssSelector(".selection .select2-selection__rendered")).click();
        driver.findElement(By.cssSelector(".select2-search__field")).sendKeys("United States");
        driver.findElement(By.cssSelector(".select2-results li:first-child")).click();
        driver.findElement(By.cssSelector(("[name=email]"))).sendKeys(email);
        driver.findElement(By.cssSelector(("[name=phone]"))).sendKeys(phone);
        driver.findElement(By.cssSelector(("[name=password]"))).sendKeys(passwords);
        driver.findElement(By.cssSelector(("[name=confirmed_password]"))).sendKeys(passwords);
        //Submit
        driver.findElement(By.cssSelector("[name='create_account']")).click();
        driver.findElement(By.linkText("Logout")).click();
//        driver.findElement(By.cssSelector("")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("box-account-login"))));
        driver.findElement(By.cssSelector(("[name=email]"))).sendKeys(email);
        driver.findElement(By.cssSelector(("[name=password]"))).sendKeys(passwords);
        driver.findElement(By.cssSelector(("[name=login]"))).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Logout"))));
        driver.findElement(By.linkText("Logout")).click();

}
}
