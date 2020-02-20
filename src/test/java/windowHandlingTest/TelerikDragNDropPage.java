package windowHandlingTest;

import Utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TelerikDragNDropPage {
    public TelerikDragNDropPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "draggable")
    public WebElement smallCircle;

    @FindBy(id = "droptarget")
    public WebElement bigCircle;

}
