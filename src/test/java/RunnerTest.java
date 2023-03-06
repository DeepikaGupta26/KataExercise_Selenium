import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Basepage;
import pages.Homepage;

public class RunnerTest extends Basepage {
    Homepage hp;
    @BeforeMethod
    public void Setup() throws InterruptedException {
        Navigate_toURL();
        hp = new Homepage();
    }
    @Test
    public void BookRoomtest(){
        hp.RoomBookingactivity();
    }
}
