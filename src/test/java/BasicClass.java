import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by QAEngineer on 05.06.2017.
 */
public class BasicClass {
    public static ThreadLocal <WebDriver> tlDriver = new ThreadLocal<>();
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void start(){
        if(tlDriver.get() != null){
            driver = tlDriver.get();
            wait = new WebDriverWait(driver,10);
            return;
        }

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");
        options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tlDriver.set(driver);
        System.out.println(((HasCapabilities) driver).getCapabilities());
        wait = new WebDriverWait(driver, 10);

//        Runtime.getRuntime().addShutdownHook(
//                new Thread(() -> {driver.quit(); driver = null;}));


    }

    @AfterClass
    public static void end(){
        driver.quit();
        driver = null;
    }
}
