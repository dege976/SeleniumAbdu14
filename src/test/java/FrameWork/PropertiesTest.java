package FrameWork;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    @Test
    public void test1() throws IOException {
        String path = "Test.properties";
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream(path);
        properties.load(file);
        System.out.println();

    }
}
