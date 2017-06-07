import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;


/**
 * Created by QAEngineer on 02.06.2017.
 */
public class LessonFour extends BaseClass {

    @Test
    public void checkElements() {
        login();
        checkMenu();
        }



    public void login() {
        driver.get("http://localhost/litecart/admin/login.php");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }

    public boolean isPresent() {
        return driver.findElements(By.cssSelector("#content h1")).size() > 0;
    }


    public void checkMenu() {
        List<WebElement> parents = driver.findElements(By.cssSelector(".list-vertical li"));
        int parInd = parents.size();

        for (int i = 0; i < parInd; i++) {
            driver.findElements(By.cssSelector("li#app-")).get(i).click();
            if(isPresent()){
                System.out.println("ok");
            }

            List<WebElement> childs = driver.findElements(By.cssSelector(".docs li"));
        for (int j = 0; j < childs.size(); j++){
            driver.findElements(By.cssSelector(".docs li")).get(j).click();
            if(isPresent()){
                System.out.println("ok");
            }
        }
        }
    }
}
