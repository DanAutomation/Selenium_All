import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by QAEngineer on 29.05.2017.
 */
public class BaseClass {

    public static ThreadLocal <WebDriver> tlDriver = new ThreadLocal<>();
    public WebDriver driver;
    public WebDriverWait wait;

    @BeforeClass
    public void start(){
        if(tlDriver.get() != null){
            driver = tlDriver.get();
            wait = new WebDriverWait(driver,10);
            return;
        }


        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 10);



    }

    @AfterClass
    public void end(){
//        driver.quit();
//        driver = null;
    }
    }
