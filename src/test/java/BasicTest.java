import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObject.FirstScreen;
import pageObject.SecondScreen;

import java.util.List;

public class BasicTest extends BaseTest {

    @Test
    public void testClickButton() {

        FirstScreen firstScreen = new FirstScreen(driver);
//        Assert.assertEquals("Home", firstScreen.getHeaderText());
//        Assert.assertEquals("Next", firstScreen.getButtonText());
        firstScreen.buttonElement.click();

        SecondScreen secondScreen = new SecondScreen(driver);
        Assert.assertEquals("Screen1", secondScreen.getHeaderText());
    }
}
