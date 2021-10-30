import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;


public class StepImplementation extends BaseTest {

    public Logger logger =Logger.getLogger(getClass());

    AndroidTouchAction action = new AndroidTouchAction(appiumDriver);

    @Step("<time> saniye bekle")
    public void waitTime(int time) throws InterruptedException {
        Thread.sleep(1000L*time);
        logger.info(time+"saniye beklendi");
    }

    @Step("<Key> İd'li elemente tıkla")
    public void clickElementByid(String Key){
        appiumDriver.findElement(By.id(Key)).click();
        logger.info(Key+"Elementine Tiklandi");


    }
    @Step("<Key> İd'li elemente <keywordc> değerini yaz")
    public void SendkeyElementByid(String Key,String keywordc){
        appiumDriver.findElement(By.id(Key)).sendKeys(keywordc);
        logger.info(Key+"Elementine Tiklandi");

    }
    @Step("<Key> xpath'li elemente tıkla")
    public void clickElementByxpath(String Key){
        appiumDriver.findElement(By.xpath(Key)).click();
        logger.info(Key+"Elementine Tiklandi");
    }
    @Step("<Key> xpath'li elemente <keywordc> değerini yaz")
    public void SendkeyElementByxpath(String Key,String keywordc){
        appiumDriver.findElement(By.xpath(Key)).sendKeys(keywordc);
        logger.info(Key+"Elementine Tiklandi");

    }
    @Step("Sayfayı bir kere asagi kaydir")

    public void scrolEt(){

        (new AndroidTouchAction(appiumDriver)).press(new PointOption().withCoordinates(538,1493))
                .moveTo(new PointOption().withCoordinates(534,688))
                .release().perform();
        logger.info("Sayfa Scroll edildi");
    }

    @Step("Sayfayı bir kere daha asagı kaydır")
    public void scrolEtİki(){
        (new AndroidTouchAction(appiumDriver)).press(new PointOption().withCoordinates(546,1764))
                .moveTo(new PointOption().withCoordinates(546,514))
                .release().perform();
        logger.info("Sayfa ikinci kere Scroll edildi");
    }
    @Step("Sayfayı bir daha scroll et")
    public void scrolEtUc(){
        (new AndroidTouchAction(appiumDriver)).press(new PointOption().withCoordinates(963,1476))
                .moveTo(new PointOption().withCoordinates(963,437))
                .release().perform();
        logger.info("Favoriler butonuna basabilmesi icin scroll edildi");
    }

    @Step("<Key> id'li element sayfada var mı doğru sayfada mıyım kontrolü yap")
    public boolean isDisplayed(String Key){
        boolean a= appiumDriver.findElement(By.id(Key)).isDisplayed();
        if(a){
            logger.info("Element bulundu.Doğru sayfadasınız");
        }else{
            logger.info("Element bulunamadı.Yanlış sayfadasınız.");
        }
        return appiumDriver.findElement(By.id(Key)).isDisplayed();

    }
    @Step("<Key> xpath'ine sahip element sayfada var mı, doğru sayfada mıyım kontrolü yap")
    public boolean isDisplayedxpath(String Key){
        boolean a= appiumDriver.findElement(By.id(Key)).isDisplayed();
        if(a){
            logger.info("Element bulundu.Doğru sayfadasınız");
        }else{
            logger.info("Element bulunamadı.Yanlış sayfadasınız.");
        }
        return appiumDriver.findElement(By.xpath(Key)).isDisplayed();
    }

}