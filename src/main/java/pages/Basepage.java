package pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.CommonUtils;
import utils.GlobalClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Basepage {
    /** Below constructor will take care of loading property file where keyvalue pair stored **/
    public Basepage(){
        try{
            FileInputStream file = new FileInputStream("src/main/java/properties/Config.properties");
            GlobalClass.prop = new Properties();
            GlobalClass.prop.load(file);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    /** Below method will load value from property file, intialize browser and open url**/
    public void Navigate_toURL() throws InterruptedException {
        String applicationURL = GlobalClass.prop.getProperty("url");
        String browsernm = GlobalClass.prop.getProperty("browser");
        assigneBrowser(browsernm);
        GlobalClass.driver.get(applicationURL);
        GlobalClass.driver.manage().window().maximize();
        Thread.sleep(2000);
        CommonUtils.scrolldown(GlobalClass.driver);
    }

    public void assigneBrowser(String nameofbrowser){
        if(nameofbrowser.equals("chrome") || nameofbrowser.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver","C:/ALL_hybrid_work_project/Drivers/Chrome/chromedriver.exe");
            GlobalClass.driver = new ChromeDriver();
        }
        else if(nameofbrowser.equals("ff") || nameofbrowser.equals("FF") || nameofbrowser.equals("firefox")){
            System.setProperty("wedriver.gecko.driver","C:/ALL_hybrid_work_project/Drivers/Firefox/geckdriver.exe");
            GlobalClass.driver = new FirefoxDriver();
        }

    }

}
