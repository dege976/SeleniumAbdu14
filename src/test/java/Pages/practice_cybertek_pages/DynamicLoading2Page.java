package Pages.practice_cybertek_pages;

import Utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoading2Page {
    public WebElement helloWordText;

    public DynamicLoading2Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;
    @FindBy(xpath = "//div[@id='finish']/h4")
    public WebElement helloWorldText;
}
