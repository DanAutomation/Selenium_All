import com.google.common.collect.Ordering;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by QAEngineer on 09.06.2017.
 */
public class LessonFivePartTwo extends BaseClass{



        @Test
        public void checkGeoZonesSorting() {
            login();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("box-apps-menu")));

            By countryMenuItemLocator = By.xpath("//span[contains(text(), 'Geo Zones')]");
            driver.findElement(By.xpath("//span[contains(text(), 'Geo Zones')]")).click();


            List<WebElement> zonesRows = driver.findElements(By.cssSelector("tr .row")); // td#content tr.row
//            List<WebElement> zonesRows = driver.findElements(By.xpath("//tr[@class='row']")); // td#content tr.row
            String rowLocator = "//tr[@class='row'][%s]";

            for (int i = 1; i <= zonesRows.size(); i++) {
                WebElement currentRow = driver.findElement(By.xpath(String.format(rowLocator, i)));
                WebElement clickToCountry = currentRow.findElement(By.cssSelector("a:not([title=Edit])"));
                clickToCountry.click();

//                List<WebElement> zones = driver.findElements(By.cssSelector("#table-zones select[name$='[zone_code]']"));
                List<WebElement> zones = driver.findElements(By.cssSelector(".row"));
                List<String> nameOfZone = new ArrayList<>(zones.size());
                for (WebElement zone : zones) {
                    nameOfZone.add(zone.findElement(By.cssSelector("[selected='selected']")).getText());
                }
                if (!Ordering.natural().isOrdered(nameOfZone)) {
                    System.out.println("error");
                }
                driver.findElement(countryMenuItemLocator).click();
            }
        }


    public void login() {
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }
}
