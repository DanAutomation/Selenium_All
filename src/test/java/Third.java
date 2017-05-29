import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by QAEngineer on 29.05.2017.
 */
public class Third extends BaseClass{

    @Test
    public void firstTesty() throws InterruptedException {
        driver.get("http://localhost/litecart/admin/login.php");
        Thread.sleep(2000);

        driver.findElement(By.name("username")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
    }

    @Test
    public void firstTest() throws InterruptedException {
        driver.get("http://localhost/litecart/admin/login.php");
        Thread.sleep(2000);

        driver.findElement(By.name("username")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
    }
}
