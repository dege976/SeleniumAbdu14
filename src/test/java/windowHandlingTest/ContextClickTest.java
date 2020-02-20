package windowHandlingTest;

import Utilites.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextClickTest {
    @Test
    public void rightClickTest() throws InterruptedException{
        //1- Get the page
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");

        //2- Locate the webElement to context click
        WebElement box = Driver.getDriver().findElement(By.id("hot-spot"));

        //3- Create Actions class object to be able to use context click method
        Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(2000);
        //4- Use the object to context click
        actions.contextClick(box).perform();

        //5- Switch to alert to handle it
        Alert alert = Driver.getDriver().switchTo().alert();

        //6- Accept the alert
        alert.accept();

    }

}
