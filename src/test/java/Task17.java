import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by QAEngineer on 27.06.2017.
 */
public class Task17 extends BaseClass {

    @Test
    public void getLogsBrowsers(){
        login();

        for (int i = 5; i < 11; i++) {
            driver.findElement(By.cssSelector("tr:nth-child(" + i + ") > td:nth-child(3) > a")).click();
            driver.get("http://localhost/litecart/admin/?app=catalog&doc=catalog&category_id=1");
            if (driver.manage().logs().get("browser").getAll().size() > 0) {
                System.out.println(("Logs from browser " + i + " product \n"));
            }
        }
    }



    void login(){
        driver.get("http://localhost/litecart/admin/?app=catalog&doc=catalog&category_id=1");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }
}