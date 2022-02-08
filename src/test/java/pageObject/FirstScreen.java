package pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class FirstScreen extends BasePage {

    public FirstScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(className = "android.view.View")
    @iOSXCUITFindBy(className = "")
    public MobileElement textElement;

//    @AndroidFindBy(className = "android.widget.Button")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View")
    @iOSXCUITFindBy(className = "")
    public MobileElement buttonElement;

    public String getHeaderText() {
        return textElement.getText();
    }

    public String getButtonText() {
        System.out.println(buttonElement.getText());
        return buttonElement.getText();
    }
}
