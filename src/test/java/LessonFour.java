import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


/**
 * Created by QAEngineer on 02.06.2017.
 */
public class LessonFour extends BaseClass {


    @Test( priority = 1 )
    public void checkAppearance(){
        login();
        driver.findElement(By.cssSelector(".list-vertical li:nth-child(1)")).click();
        driver.findElement(By.cssSelector("li#doc-template")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-logotype")).click();
        isPresent();
    }

    @Test( priority = 2 )
    public void checkCatalog(){
        driver.findElement(By.cssSelector(".list-vertical > li:nth-child(2)")).click();
        driver.findElement(By.cssSelector("li#doc-catalog")).click();
        isPresent();

        driver.findElement(By.cssSelector("li#doc-product_groups")).click();
        isPresent();

        driver.findElement(By.cssSelector("li#doc-option_groups")).click();
        isPresent();

        driver.findElement(By.cssSelector("li#doc-manufacturers")).click();
        isPresent();

        driver.findElement(By.cssSelector("li#doc-suppliers")).click();
        isPresent();

        driver.findElement(By.cssSelector("li#doc-delivery_statuses")).click();
        isPresent();

        driver.findElement(By.cssSelector("li#doc-sold_out_statuses")).click();
        isPresent();

        driver.findElement(By.cssSelector("li#doc-quantity_units")).click();
        isPresent();

        driver.findElement(By.cssSelector("li#doc-csv")).click();
        isPresent();
    }

    @Test( priority = 3 )
    public void checkCountries(){
        driver.findElement(By.cssSelector(".list-vertical > li:nth-child(3)")).click();
        isPresent();
    }

    @Test( priority = 4 )
    public void checkCurrencies(){
        driver.findElement(By.cssSelector(".list-vertical > li:nth-child(4)")).click();
        driver.findElement(By.cssSelector("#content td")).click();
        isPresent();
    }

    @Test( priority = 5 )
    public void checkCustomers() {
        driver.findElement(By.cssSelector(".list-vertical > li:nth-child(5)")).click();
        driver.findElement(By.cssSelector("li#doc-customers")).click();
        isPresent();

        driver.findElement(By.cssSelector("li#doc-csv")).click();
        isPresent();

        driver.findElement(By.cssSelector("li#doc-newsletter")).click();
        isPresent();
    }

    @Test( priority = 6 )
    public void checkGeoZones(){
        driver.findElement(By.cssSelector(".list-vertical > li:nth-child(6)")).click();
        driver.findElement(By.cssSelector("#content td")).click();
        isPresent();
    }

    @Test( priority = 7 )
    public void checkLanguages() {
        driver.findElement(By.cssSelector(".list-vertical > li:nth-child(7)")).click();
        driver.findElement(By.cssSelector("li#doc-languages")).click();
        isPresent();

        driver.findElement(By.cssSelector("li#doc-storage_encoding")).click();
        isPresent();
    }

    @Test( priority = 8 )
    public void checkModules(){
        driver.findElement(By.cssSelector(".list-vertical > li:nth-child(8)")).click();
        driver.findElement(By.cssSelector("li#doc-jobs")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-customer")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-shipping")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-payment")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-payment")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-order_total")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-order_success")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-order_action")).click();
        isPresent();
    }

    @Test( priority = 9 )
    public void checkOrders(){
        driver.findElement(By.cssSelector(".list-vertical > li:nth-child(9)")).click();
        driver.findElement(By.cssSelector("li#doc-orders")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-order_statuses")).click();
        isPresent();
    }

    @Test( priority = 10 )
    public void checkPages(){
        driver.findElement(By.cssSelector(".list-vertical > li:nth-child(10)")).click();
        driver.findElement(By.cssSelector("#content td")).click();
        isPresent();
    }

    @Test( priority = 11)
    public void checkReports(){
        driver.findElement(By.cssSelector(".list-vertical > li:nth-child(11)")).click();
        driver.findElement(By.cssSelector("li#doc-monthly_sales")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-most_sold_products")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-most_shopping_customers")).click();
        isPresent();
    }

    @Test( priority = 12 )
    public void checkSettings(){
        driver.findElement(By.cssSelector(".list-vertical > li:nth-child(12)")).click();
        driver.findElement(By.cssSelector("li#doc-store_info")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-defaults")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-general")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-listings")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-images")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-checkout")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-advanced")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-security")).click();
        isPresent();
    }

    @Test( priority = 13 )
    public void checkSlides(){
        driver.findElement(By.cssSelector(".list-vertical > li:nth-child(13)")).click();
        driver.findElement(By.cssSelector("#content td")).click();
        isPresent();
    }

    @Test( priority = 14 )
    public void checkTax(){
        driver.findElement(By.cssSelector(".list-vertical > li:nth-child(14)")).click();
        driver.findElement(By.cssSelector("li#doc-tax_classes")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-tax_rates")).click();
        isPresent();
    }

    @Test( priority = 15 )
    public void checkTranslations(){
        driver.findElement(By.cssSelector(".list-vertical > li:nth-child(15)")).click();
        driver.findElement(By.cssSelector("li#doc-search")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-scan")).click();
        isPresent();
        driver.findElement(By.cssSelector("li#doc-csv")).click();
        isPresent();
    }

    @Test( priority = 16 )
    public void checkUsers(){
        driver.findElement(By.cssSelector(".list-vertical > li:nth-child(16)")).click();
        driver.findElement(By.cssSelector(".list-vertical > li:nth-child(16)")).click();
        driver.findElement(By.cssSelector("#content td")).click();
        isPresent();
    }

    @Test( priority = 17 )
    public void checkvQmods(){
        driver.findElement(By.cssSelector(".list-vertical > li:nth-child(17)")).click();
        driver.findElement(By.cssSelector("#content td")).click();
        isPresent();
    }


    public void login() {
        driver.get("http://localhost/litecart/admin/login.php");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }

    public boolean isPresent() {
        return driver.findElements(By.cssSelector("#content h1")).size() > 0;
    }

}