package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.time.Duration;

public class CommonUtils {

    public static void scrolldown(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,1500)");
    }

    public static void selectDate(){
        Actions act = new Actions(GlobalClass.driver);
        WebElement a = GlobalClass.driver.findElement(By.xpath("//button[text()='08']"));
        WebElement b = GlobalClass.driver.findElement(By.xpath("//button[text()='10']"));

       // Action dragAndDrop =act.moveToElement(b).build().perform();

    }
}
