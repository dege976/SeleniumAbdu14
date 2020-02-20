package windowHandlingTest;

import Utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropTest {
    @Test
    public void dragNDropTest(){
        //1- get page
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //2- locate webelements, instantiate the class
        TelerikDragNDropPage telerik = new TelerikDragNDropPage();

        //3- Actions class object creating
        Actions actions = new Actions(Driver.getDriver());

        //4- use dragNDrop method
        actions.dragAndDrop(telerik.smallCircle, telerik.bigCircle).perform();



    }

}
