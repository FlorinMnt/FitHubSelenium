package com.fithub.fithub_test.Utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationLoader {

    private static final Properties PROPERTIES = new Properties();

    static {
        try (FileInputStream input = new FileInputStream("src/main/resources/application.properties")) {
            PROPERTIES.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
}
