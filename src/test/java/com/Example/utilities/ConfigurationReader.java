package com.Example.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //1-create the object of Properties class
    private static Properties properties = new Properties();

    static{

        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);
            //close the file
            file.close();
        } catch (IOException e) {
            System.out.println("Something happened in configurationReader class.");
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyword){

        return properties.getProperty(keyword);
    }
}
