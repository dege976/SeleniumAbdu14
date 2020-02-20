package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumEasyCheckBox2 {
    public static void main(String[] args) {

        //TC    #3: SeleniumEasy    Checkbox    Verification    –Section  2
        // 1.Open   Chrome  browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 2.Go to  https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        // 3.Verify “Check    All”  button  text    is  “Check    All”
        WebElement checkAllButton = driver.findElement(By.xpath("//input[@id='check1']"));
        String expectedText = "Check All";
        String actualText = checkAllButton.getAttribute("value");
        if(actualText.equals(expectedText)){
            System.out.println("Check All button text verification PASSED!");
        }else{
            System.out.println("Check All button text verification FAILED!!!");
        }
        // 4.Click  to  “Check    All”  button
        checkAllButton.click();
        // 5.Verify all check   boxes   are checked
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]"));
        WebElement checkbox3 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[3]"));
        WebElement checkbox4 = driver.findElement(By.xpath("(//input[@class='cb1-element'])[4]"));
        if(checkbox1.isSelected() && checkbox2.isSelected() && checkbox3.isSelected() && checkbox4.isSelected()){
            System.out.println("All checkboxes are checked. Verification PASSED!");
        }else{
            System.out.println("All checkboxes are not checked. Verification FAILED!!!");
        }
        // 6.Verify button  text    changed to  “Uncheck All"
        String expectedValueAfterClick = "Uncheck All";
        String actualValueAfterClick = checkAllButton.getAttribute("value");
        if(expectedValueAfterClick.equals(actualValueAfterClick)){
            System.out.println("Button text changed to Uncheck All. Verification PASSED!");
        }else{
            System.out.println("Button text verification FAILED!!!");
        }


//        //	SeleniumEasy	Checkbox	Verification	–Section	2
//        //	1.Open	Chrome	browser
//        //	2.Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
//        //	3.Verify	“Check	All”	button	text	is	“Check	All”
//        //	4.Click	to	“Check	All”	button
//        //	5.Verify	all	check	boxes	are	checked
//        //	6.Verify	button	text	changed	to	“Unc
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
//        WebElement checkAll = driver.findElement(By.xpath("//input[@type=\"button\"]"));
//        checkAll.click();
//        WebElement check1 = driver.findElement(By.xpath("//input[@type='button']/../div[1]/label/input"));
//        WebElement check2 = driver.findElement(By.xpath("//input[@type='button']/../div[2]/label/input"));
//        WebElement check3 = driver.findElement(By.xpath("//input[@type='button']/../div[3]/label/input"));
//        WebElement check4 = driver.findElement(By.xpath("//input[@type='button']/../div[4]/label/input"));
//        if (check1.isSelected()&&check2.isSelected()&&check3.isSelected()&&check4.isSelected()){
//            System.out.println("all checkboxes are checked Passed!");
//        }else {
//            System.out.println("all checkboxes are  not checked Failed!!!");
//        }
//        WebElement unc = driver.findElement(By.xpath("//input[@value=\"Check All\"]"));


    }
}
