package Mentoring.Tuesday.Amazone;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AmazonePage extends BasePAge {

    String url = "https://www.amazon.com/";
    @Test
    public void navigateTo() {
        driver.get(url);
        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(url, actualUrl);
    }
    //Expected size = 47
    @Test
    public void validateCategroriesSize() {
        driver.get(url);
        driver.findElement(By.id("nav-hamburger-menu")).click();
        int expCategoriesSize = 47;
        List<WebElement> categoriesList = driver
                .findElements(By.cssSelector("ul.hmenu-visible li"));
        Assert.assertEquals(expCategoriesSize, categoriesList.size());
    }
    public void clickCategory(String categorName) {
        driver.findElement(By.xpath("//*[.='" + categorName + "']")).click();
    }

////    WebDriver driver;
////    @Before
////    public void setUp() {
////        System.out.println("Instantiating the driver");
////        WebDriverManager.chromedriver().setup();
////        driver = new ChromeDriver();
////    }
////    @After
////    public void tearDown() {
////        System.out.println("Quitting the browser");
////        driver.quit();
////    }
//    @Test
//    public void navigateTo() {
//        String url = "https://www.amazon.com/";
//        driver.get(url);
//        String actualUrl = driver.getCurrentUrl();
//        System.out.println(actualUrl);
//        Assert.assertEquals(url,actualUrl);
//    }
//
////    WebDriver driver;
////    @Before
////
////    public void setUp(){
////        WebDriverManager.chromedriver().setup();
////        WebDriver driver = new ChromeDriver();
////        driver.quit();
////
////    }
////    @After
////    public void tearDown(){
////        System.out.println("queting the browser");
////        //driver.quit();
////    }
////    @Test
////    public void navigateTo(){
////        driver.get("https://www.amamzone.com");
////        String url = "https://www.amazone.com";
////        driver.get(url);
////        String actualUrl = driver.getCurrentUrl();
////if (actualUrl.equals(url)){
////    System.out.println("Passed");
////}else {
////    System.out.println("Failed");
////
////}
////
////Assert.assertEquals(url,actualUrl);
////    }
//

}
