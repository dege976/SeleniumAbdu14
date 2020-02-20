package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXpassCybertek {
    public static void main(String[] args) {
        //PracticeCybertek.com_ForgotPasswordWebElement verification
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/forgot_password
        // 3.Locate all theWebElements on the page using XPATH locator only (total of 6)
        // a.“Home”link
        // b.“Forgot password”header
        // c.“E-mail”text
        // d.E-mailinput box
        // e.“Retrieve password”button
        // f.“Powered by Cybertek School”text
        // 4.Verify allWebElements aredisplayed.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        if (driver.findElement(By.xpath("//a[@class='nav-link']")).isDisplayed()){
            System.out.println("home link is displayed");
        }else {
            System.out.println("home link is not displayed");
        }

        if (driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2")).isDisplayed()){
            System.out.println("forget password header is diplayed");
        }else {
            System.out.println("forget password heder is not displayed");
        }
        if (driver.findElement(By.xpath("//*[@id=\"forgot_password\"]/div/div/label")).isDisplayed()){
            System.out.println("e mailinput is displayed");
        }else {
            System.out.println("e mailinput is not displayed");
        }
        if (driver.findElement(By.xpath("//input[@name='email']")).isDisplayed()){
            System.out.println("E-mailinput box is displayed");
        }else {
            System.out.println("E-mailinput box not displayed");
        }
        if(driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']")).isDisplayed()){
            System.out.println("Retrieve password button is displayed");
        }else {
            System.out.println("Retrieve password button is not displayed");
        }
        if (driver.findElement(By.xpath("//a[@target='_blank']")).isDisplayed()){
            System.out.println("Powered by Cybertek School”text is displayed");
        }else {
            System.out.println("Powered by Cybertek School”text is not displayed");
        }
        System.out.println("++++++++++++++++++++++++++++++++++");

    }
//    public static void main(String[] args) {
//        //TC #1: PracticeCybertek.com_ForgotPasswordWebElement verification
//        // 1.Open Chrome browser
//        // 2.Go to http://practice.cybertekschool.com/forgot_password
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("http://practice.cybertekschool.com/forgot_password");
//        // 3.Locate all theWebElements on the page using XPATH locator only (total of 6)
//        // a.“Home”link
//        WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));
//        // b.“Forgot password”header
//        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//div[@class='example']/h2"));
//        // c.“E-mail”text
//        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));
//        // d.E-mail input box
//        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
//        // e.“Retrieve password”button
//        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));
//        //button[.='Retrieve password']
//        // f.“Powered by Cybertek School”text
//        WebElement footerText = driver.findElement(By.xpath("//a[.='Cybertek School']/.."));
//        // 4.Verify allWebElements are displayed.
//        if(homeLink.isDisplayed() && forgotPasswordHeader.isDisplayed() && emailLabel.isDisplayed()
//                && emailInput.isDisplayed() && retrievePasswordButton.isDisplayed()
//                && footerText.isDisplayed())
//        {
//            System.out.println("All web elements are displayed");
//        }else{
//            System.out.println("One or more of the webElements are not displayed!");
//        }
//
//    }

}
