import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


/**
 * Created by QAEngineer on 25.05.2017.
 */
public class First extends BaseClass{

//    private WebDriver driver;
//    private WebDriverWait wait;
/*
    @Before
    public void start(){
//        driver = new InternetExplorerDriver();
        driver = new ChromeDriver();
//        driver = new OperaDriver();
//        driver = new EdgeDriver();
//        driver = new FirefoxDriver();
/*
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(FirefoxDriver.MARIONETTE,false);
        driver = new FirefoxDriver(caps);
  */
//        caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
//        caps.setCapability("unexpectedAlertBehaviour", "dismiss");
//        driver = new InternetExplorerDriver(caps);
//        System.out.println(((HasCapabilities) driver).getCapabilities());

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /*
        driver.manage().addCookie(new Cookie("test", "test"));
        Cookie testCookie = driver.manage().getCookieNamed("test");
        Set<Cookie> cookies = driver.manage().getCookies();
        driver.manage().deleteCookieNamed("test");
        driver.manage().deleteAllCookies();
*/
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-fullscreen");/
//        ChromeOptions options = new ChromeOptions();
//        options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//        options.addArguments("start-maximized");
//        driver = new ChromeDriver(options);
//        wait = new WebDriverWait(driver, 10);

//    }

    @Test
    public void firstTest() throws InterruptedException {
        driver.get("http://localhost/litecart/admin/login.php");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }

    @Test
    public void firstTestg() throws InterruptedException {
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

//    @After
//    public void end(){
//        driver.quit();
//        driver = null;
//    }

}
