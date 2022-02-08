package util;

public enum DriverType {

    iOS("XCUNITDriver"),
    ANDROID("UiAutomator2");

    public final String driverType;

    private DriverType(String driverType) {
        this.driverType = driverType;
    }
}
