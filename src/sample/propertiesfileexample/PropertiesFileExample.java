package sample.propertiesfileexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileExample {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            // Writing to properties file
            FileOutputStream out = new FileOutputStream("config.properties");
            properties.setProperty("username", "admin");
            properties.setProperty("password", "password123");
            properties.store(out, null);
            out.close();
            
            // Reading from properties file
            FileInputStream in = new FileInputStream("config.properties");
            properties.load(in);
            System.out.println("Username: " + properties.getProperty("username"));
            System.out.println("Password: " + properties.getProperty("password"));
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
