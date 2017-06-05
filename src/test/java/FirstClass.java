import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by QAEngineer on 29.05.2017.
 */
public class FirstClass {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        wait = new WebDriverWait(driver, 10);
        DesiredCapabilities caps = new DesiredCapabilities();
        driver = new FirefoxDriver(
                new FirefoxBinary(new File("C:\\Program Files (x86)\\Nightly\\firefox.exe")),
                new FirefoxProfile(),caps);
        System.out.println(((HasCapabilities) driver).getCapabilities());
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void firstTest() throws InterruptedException {
        driver.get("http://localhost/litecart/admin/login.php");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }

    @After
    public void end(){
        driver.quit();
        driver = null;
    }

}
