import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by QAEngineer on 12.06.2017.
 */
public class Task10 extends BaseClass{

    @Test
    public void checkProduct(){
    driver.get("http://localhost/litecart/en/");
        WebElement product = driver.findElement(By.cssSelector("#box-campaigns li:first-child"));
        WebElement mainPrice = driver.findElement(By.cssSelector("#box-campaigns .regular-price"));
        WebElement promoprice = driver.findElement(By.cssSelector("#box-campaigns .campaign-price"));
        WebElement InnerHedaer = driver.findElement(By.cssSelector("h1.title"));
        WebElement totalPrice = driver.findElement(By.cssSelector(".regular-price"));
        WebElement promoPriceInner = driver.findElement(By.cssSelector(".campaign-price"));

        String prPrice = promoPriceInner.getText();
        String productName = product.findElement(By.cssSelector(".name")).getText();
        String price = mainPrice.getText();
        String promoPrice = promoprice.getText();
        String colorPrice = mainPrice.getCssValue("text-decoration-line");
        String colorMainPrice = mainPrice.getCssValue("color");
        String fontPromoPrice = promoprice.getCssValue("font-weight");
        String colorPromoPrice = promoprice.getCssValue("color");
        String fontHeightPromoPrice = promoprice.getCssValue("font-size");
        String fontHeightMainPrice = mainPrice.getCssValue("font-size");
        String title = InnerHedaer.getText();
        String allPrice = totalPrice.getText();
        String sizeAllPrice = totalPrice.getCssValue("font-size");
        String sizePromoPrice = promoPriceInner.getCssValue("font-size");
        double allInnerHeight = Double.parseDouble(sizeAllPrice.substring(0, sizeAllPrice.length()-2));
        double promoInnerHeight = Double.parseDouble(sizePromoPrice.substring(0,sizePromoPrice.length()-2));

        checkFontMainPrice(colorPrice, colorMainPrice, "line-through", "rgba(119, 119, 119, 1)");  // 10 в
        checkFontPromoPrice(fontPromoPrice, colorPromoPrice); // 10 г
        checkSizeFonts(fontHeightPromoPrice, fontHeightMainPrice);  // 10 В
        product.click();  // переход во внутрь страницы
        checkTitles(productName, title);  // 10 a
        checkMainPrice(price, allPrice);  // 10 б
        checkAllPromoPrice(prPrice, promoPrice); // 10 б
        checkFontSizeMainPromo(allInnerHeight, promoInnerHeight); // 10 г


   }

    public void checkFontSizeMainPromo(double allInnerHeight, double promoInnerHeight) {
        Assert.assertTrue("font of inner promo is lager than font of inner main price", allInnerHeight < promoInnerHeight);
    }

    public void checkAllPromoPrice(String prPrice, String promoPrice) {
        assertEquals(promoPrice, prPrice);
    }

    public void checkMainPrice(String price, String allPrice) {
        assertEquals(allPrice, price);
    }

    public void checkTitles(String productName, String title) {
        assertEquals(title, productName);
    }

    public void checkSizeFonts(String fontHeightPromoPrice, String fontHeightMainPrice) {
        double a = Double.parseDouble(fontHeightPromoPrice.substring(0, fontHeightPromoPrice.length()-2));
        double b = Double.parseDouble(fontHeightMainPrice.substring(0,fontHeightMainPrice.length()-2));
        Assert.assertTrue("font promo is lager than font main", b < a);
    }

    public void checkFontMainPrice(String colorPrice, String colorMainPrice, String actual, String actual2) {
        Assert.assertEquals(colorPrice, actual);
        Assert.assertEquals(colorMainPrice, actual2);
    }

    public void checkFontPromoPrice(String fontPromoPrice, String colorPromoPrice) {
        Assert.assertEquals(colorPromoPrice, "rgba(204, 0, 0, 1)");
        Assert.assertEquals(fontPromoPrice, "bold");
    }


}
