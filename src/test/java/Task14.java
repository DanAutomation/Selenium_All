import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

/**
 * Created by QAEngineer on 22.06.2017.
 */
public class Task14 extends BaseClass{

    @Test
    public void getWindow() {

        login();
        driver.findElement(By.xpath(".//span[text()='Countries']")).click();
        driver.findElement(By.xpath(".//a[text()='Albania']")).click();

        List<WebElement> icons = driver.findElements(By.cssSelector("td a i.fa.fa-external-link"));
        for (int i = 1; i < icons.size(); i++) {
            icons.get(i).click();
            String firstWindow = driver.getWindowHandle();
            Set<String> windows = driver.getWindowHandles();
            String nextWindow = "";


            for (String window : windows){
                if(!window.equals(firstWindow)){
                    nextWindow = window;
                }
            }
            driver.switchTo().window(nextWindow);
            driver.close();
            driver.switchTo().window(firstWindow);
            }
        }

    void login(){
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }
}
