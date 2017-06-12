import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by QAEngineer on 07.06.2017.
 */
public class TestLessonFive extends BaseClass{


//    @Test
//    public void checkcSS(){
//        driver.get("http://selenium2.ru");  // page-header
//        System.out.println(driver.findElement(By.cssSelector(".page-header h2")).getCssValue("color"));
//        System.out.println(driver.findElement(By.cssSelector(".page-header h2")).getCssValue("background-color"));
//        System.out.println(driver.findElement(By.cssSelector(".page-header h2")).getCssValue("border-color"));
//    }

    @Test
    public void testFirst(){
        login();
        driver.get("http://localhost/litecart/admin/");
        System.out.println(driver.findElement(By.cssSelector("..list-vertical li")).getText().contains("Geo Zones"));
    }

    public void login() {
        driver.get("http://localhost/litecart/admin/?app=countries&doc=countries");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }


}

/*
    @Test
        public void getAttribute() throws InterruptedException {
        driver.get("http://localhost/litecart");

        WebElement login = driver.findElement(By.cssSelector("[name=login]"));

        System.out.println(login.getAttribute("value"));
        System.out.println(login.getAttribute("textContent"));
        System.out.println(login.getAttribute("outerHTML"));

        WebElement nameQuery = driver.findElement(By.cssSelector("[name=query]"));   // recheck

        WebElement homeLink = driver.findElement(By.cssSelector("#breadcrumbs a"));
        System.out.println(homeLink.getAttribute("href"));

        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".fancybox-region")).click();
        Thread.sleep(2000);


//        WebElement currencyCode = driver.findElement(By.cssSelector("[name=currency_code][value=USD]"));
//        System.out.println(currencyCode.getAttribute("selected"));

//        System.out.println(nameQuery.getAttribute("value"));
    }
*/