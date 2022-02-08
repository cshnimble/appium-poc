package pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SecondScreen extends BasePage {

    public SecondScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(className = "android.view.View")
    @iOSXCUITFindBy(className = "")
    public MobileElement textElement;

    public String getHeaderText() {
        return textElement.getText();
    }
}
