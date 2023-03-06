package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.GlobalClass;

public class Homepage {

    @FindBy(xpath = "//button[text()='Book this room']")
    WebElement bookthisroomButton;
    @FindBy(name = "firstname") WebElement Firstnm;
    @FindBy(name = "lastname") WebElement Lastnm;
    @FindBy(name = "email") WebElement EmailID;
    @FindBy(name = "phone") WebElement Phno;
    public Homepage(){
        PageFactory.initElements(GlobalClass.driver,this);
    }

    public void RoomBookingactivity(){
        bookthisroomButton.click();
        Firstnm.sendKeys("abc");
        Lastnm.sendKeys("xyz");
        EmailID.sendKeys("abc123@gmail.com");
        Phno.sendKeys("06756453423");
        CommonUtils.selectDate();
    }
}
