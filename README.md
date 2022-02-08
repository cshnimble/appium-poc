# Example app automation framework

This is a very basic app automation framework done as a PoC.

It uses [Appium](https://appium.io) as a base.

## Requirements

* Java 8+
* Appium server

### Installing Appium server

If you have node installed, you can simply do

`npm i -g appium`

and run with command `appium`

Or you can download the [Appium server GUI](https://github.com/appium/appium-desktop) to run with a UI version

## Running the example test

### Windows

Run `gradlew.bat test` file from your command line

### Linux / MacOS

Run `./gradlew test` from your terminal

> ### Note
> You will need to enable any real device you are working with for appium, details can be found for
> [iOS](https://appium.io/docs/en/drivers/ios-xcuitest-real-devices/)
> and for [Android](https://appium.io/docs/en/drivers/android-uiautomator2/#real-device-setup).