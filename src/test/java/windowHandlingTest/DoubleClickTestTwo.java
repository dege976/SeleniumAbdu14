package windowHandlingTest;

import Utilites.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClickTestTwo {
    @Test
    public void doubleClickTest2(){
        //1- get the page
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        //2- switch to iframe
        Driver.getDriver().switchTo().frame("iframeResult");
        //3- locate webelements
        W3schoolsDoubleClickPage w3schoolsDoubleClickPage = new W3schoolsDoubleClickPage();
        //4- Actions object
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(w3schoolsDoubleClickPage.doubleClickText).perform();

        System.out.println("The value of style attribute: " + w3schoolsDoubleClickPage.doubleClickText.getAttribute("style"));

    }

}
