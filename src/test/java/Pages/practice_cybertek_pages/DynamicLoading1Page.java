package Pages.practice_cybertek_pages;

import Utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoading1Page {
    public DynamicLoading1Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;
    @FindBy(id = "username")
    public WebElement usernameInput;



}
