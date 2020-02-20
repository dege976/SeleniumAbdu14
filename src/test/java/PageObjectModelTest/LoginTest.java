package PageObjectModelTest;

import Pages.Vytrack_pages.VytrackLoginPage;
import Utilites.Config;
import Utilites.Driver;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void positiveLoginScenario(){

        String username = Config.getProperty("storemanagerUsername");
        String password = Config.getProperty("storemanagerPassword");
        Driver.getDriver().get(Config.getProperty("vytrackUrl"));

        VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
        vytrackLoginPage.usernameInput.sendKeys(username);
        vytrackLoginPage.passwordInput.sendKeys(password);
        vytrackLoginPage.loginButton.click();
    }


}
