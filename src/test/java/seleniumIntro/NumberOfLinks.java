package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class NumberOfLinks {
    public static void main(String[] args) {
        //	Checking	the	number	of	links	on	the	page
        //	1.Open	Chrome	browser
        //	2.Go	to	https://www.openxcell.com
        //	3.Count	the	number	of	the	links	on	the	page	and	verifyExpected:
        //
        //	188TC	#2:	Printing	out	the	texts	of	the	links	on	the	page1.Open	Chrome	browser2.Go	to	https://www.openxcell.com
        //	3.Print	out	all	of	the	texts	of	the	links	on	the	pageTC
        //	#3:	Counting	the	number	of	links	that	does	not	have	text1.Open	Chrome	browser2.Go	to	https://www.openxcell.com
        //	3.Count	the	number	of	links	that	does	not	have	text	and	verifyExpected:	1
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.openxcell.com");
        //Count the number  of  the links   on  the page    and verify. Expected 188
        List<WebElement> links = driver.findElements(By.xpath("//body//a"));
        int expectedNum = 188;
        int actualNum = links.size();
        if(expectedNum == actualNum){
            System.out.println("List size verification PASSED!");
        }else{
            System.out.println("List size verification FAILED!!!");
        }
        //printing out the texts of each webElement
//        for(int i=0; i<links.size(); i++){
//            links.get(i).getText();
//        }
        int counter = 0;
        for(WebElement link : links){
            System.out.println(link.getText());
            if(link.getText().equals("")){
                counter++;
            }
        }
        int expectedNumOfLinksWithNoText = 109;
        int actualNumOfLinksWithNoText = counter;
        if (expectedNumOfLinksWithNoText == actualNumOfLinksWithNoText){
            System.out.println("Links without text verification passed!");
        }else{
            System.out.println("Links without text verification failed!");
        }

    }
}
