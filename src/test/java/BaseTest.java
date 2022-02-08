import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;
import util.DriverSetup;
import util.DriverType;

import java.io.IOException;
import java.net.URL;

public class BaseTest {

    public static URL url;
    public static DesiredCapabilities capabilities;
    public static AppiumDriver driver;

    @BeforeClass
    public static void setup() throws IOException {

        DriverSetup setup = new DriverSetup();
        driver = setup.getDriver(DriverType.ANDROID);
    }

    @Before
    public void resetApp() {
        driver.resetApp();
    }

    @AfterClass
    public static void teardown() {
        if(driver != null)
            driver.quit();
    }
}
