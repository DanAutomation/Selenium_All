import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

/**
 * Created by QAEngineer on 19.06.2017.
 */
public class Task13 extends BaseClass {

    @Test
    public void checkShoppingBasket() throws InterruptedException {
        driver.get("http://localhost/litecart/en/");

        for (int i = 0; i < 3; i++){
            driver.findElements(By.cssSelector("#box-most-popular li")).get(i).click();
            if(driver.findElements(By.cssSelector("[name='options[Size]'")).size() == 1){
                driver.findElement(By.cssSelector("[name='options[Size]'")).click();
                driver.findElement(By.cssSelector("[value='Small']")).click();

            }
            String previousNumber = driver.findElement(By.cssSelector("#cart a.content span.quantity")).getText();
            Integer nextNumber = Integer.valueOf(previousNumber) + 1;

            driver.findElement(By.cssSelector("[name='add_cart_product'")).click();
            wait.until(ExpectedConditions.textToBe(By.cssSelector("#cart a.content span.quantity"), nextNumber.toString()));
                    driver.findElement(By.cssSelector("[alt='My Store']")).click();

        }
        driver.findElement(By.cssSelector("#cart > a.link")).click();
        for (int j = 0; j < 3; j++){
            driver.findElement(By.cssSelector("[name='remove_cart_item']")).click();
            wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("td.item"), 2-j));
        }

    }
}
