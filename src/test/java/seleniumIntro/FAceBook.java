package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FAceBook {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.xpath("//input[@class='input r4 wide mb16 mt8 username']")).sendKeys("username");
        driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("password");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
}
