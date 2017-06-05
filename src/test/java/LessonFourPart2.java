import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by QAEngineer on 05.06.2017.
 */
public class LessonFourPart2 extends BaseClass{

    @Test
    public  void checkstickers(){
        driver.get("http://localhost/litecart");
        List<WebElement> allElements = driver.findElements(By.cssSelector(".box li"));
        int s=allElements.size();
        for(int i=1;i<=s;i++){
            driver.findElements(By.cssSelector("[class~=sticker]"));
        }
    }

}
