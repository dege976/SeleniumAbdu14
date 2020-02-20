package Utilites;
import java.io.File;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Config {

    private static Properties properties = new Properties();

    static  {

        String path = "Configration.properties";

        try {

            FileInputStream file = new FileInputStream(path);
            properties.load(file);
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("file not find");
        }

    }

    public static String getProperty(String keyword) {

        return properties.getProperty(keyword);

    }


}
