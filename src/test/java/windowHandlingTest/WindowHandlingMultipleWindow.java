package windowHandlingTest;

import Utilites.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.SplittableRandom;

public class WindowHandlingMultipleWindow {
    @Test
    public void multipleWindowsTest() {

        Driver.getDriver().get("http://practice.cybertekschool.com");
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('http://facebook.com','_blank');");
//The line above is opening a new tab with the given link.

        String mainHandle = Driver.getDriver().getWindowHandle();

        System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

        for (String handle : Driver.getDriver().getWindowHandles()) {

            if (!handle.equals(mainHandle)) {
                Driver.getDriver().switchTo().window(handle);
                if (Driver.getDriver().getCurrentUrl().contains("etsy")) {
                    break;
                }

            }
        }

        System.out.println("Final URL: " + Driver.getDriver().getCurrentUrl());

    }
}
