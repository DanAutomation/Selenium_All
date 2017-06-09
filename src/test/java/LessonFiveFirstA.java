import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by QAEngineer on 07.06.2017.
 */
public class LessonFiveFirstA extends BaseClass{

    @Test
    public void checkCountries(){
        login();

        ArrayList<String> defaultSorting = new ArrayList<>();
        List<WebElement> getCountry = driver.findElements(By.cssSelector(".dataTable tr > td:nth-child(5)"));

        for(WebElement country : getCountry){
            defaultSorting.add(country.getText());
        }
        ArrayList<String> listSortedCountries = new ArrayList<>();
        for(String s:defaultSorting){
            listSortedCountries.add(s);
        }
        Collections.sort(listSortedCountries);
        Assert.assertTrue(listSortedCountries.equals(defaultSorting));

        }



    public void login() {
        driver.get("http://localhost/litecart/admin/?app=countries&doc=countries");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }
}
