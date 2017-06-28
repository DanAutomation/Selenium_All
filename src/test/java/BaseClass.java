import com.google.common.io.Files;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;


/**
 * Created by QAEngineer on 29.05.2017.
 */
public class BaseClass {

    public static ThreadLocal <EventFiringWebDriver> tlDriver = new ThreadLocal<>();
    public EventFiringWebDriver driver;
    public WebDriverWait wait;
    BrowserMobProxy proxy;

    public static class MyListener extends AbstractWebDriverEventListener{

        @Override
        public void beforeFindBy(By by, WebElement element, WebDriver driver) {
            System.out.println(by);
        }

        @Override
        public void afterFindBy(By by, WebElement element, WebDriver driver) {
            System.out.println(by + " found");
        }

        @Override
        public void onException(Throwable throwable, WebDriver driver) {
            System.out.println(throwable);
            File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File screen = new File("screen-" + System.currentTimeMillis() + ".png");
            try{
                Files.copy(tmp, screen);
            } catch (IOException e ){
                e.printStackTrace();
            }
            System.out.println(screen);
            }
    }

    @BeforeClass
    public void start(){
        if(tlDriver.get() != null){
            driver = tlDriver.get();
            wait = new WebDriverWait(driver,10);
            return;
        }


//        driver = new InternetExplorerDriver();
        proxy = new BrowserMobProxyServer();
        proxy.start(0);

        // get the Selenium proxy object
        Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);

        // configure it as a desired capability
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");
        options.addArguments("start-maximized");
        driver = new EventFiringWebDriver (new ChromeDriver(capabilities));
        driver.register(new MyListener());
        wait = new WebDriverWait(driver, 10);



    }

    @AfterClass
    public void end(){
//        driver.quit();
//        driver = null;
    }
    }
